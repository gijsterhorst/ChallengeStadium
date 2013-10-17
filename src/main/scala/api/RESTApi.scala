package api

import com.typesafe.scalalogging.slf4j.Logging
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport
import java.util.UUID
import model.Stadium
import org.json4s.{DefaultFormats, Formats}

case class StadiumDTO(id : String, name : String)

class RESTApi extends ScalatraServlet with JacksonJsonSupport with Logging {
  protected implicit val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
  }

  get("/stadiums") {
     Stadium.list().map( (s:Stadium) => StadiumDTO(s.id.toString, s.name) )
  }
  get("/stadiums/:id") {
     val id = params("id")
    Stadium.findById(UUID.fromString(id)).map( (s:Stadium) => StadiumDTO(s.id.toString, s.name) )
  }
  post("/stadiums") {
    val message = parsedBody.extract[StadiumDTO]
    Stadium.create(UUID.fromString(message.id), message.name)
  }
}
