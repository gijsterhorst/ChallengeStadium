package model
import java.util.UUID
import scala.collection.mutable.HashMap

class Stadium(val id : UUID, val name : String) {
  override def toString() = "id : " + id + " name : " + name
}

object Stadium {
  val stadiums = HashMap[UUID, Stadium]()

  def create(id : UUID, name : String) = {
    val stadium = new Stadium(id, name)
    stadiums +=(id -> stadium)
    stadium
  }
  def findById(id : UUID) = stadiums.get(id)

  def list() = stadiums.values.toList

}