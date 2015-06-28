package models

/**
 * Created by superleo on 19/6/15.
 */

import java.util.Date

import org.squeryl.PrimitiveTypeMode._
import org.squeryl.annotations.Column
import org.squeryl.{Schema, Session}
import play.api.Play
import play.api.Play.current

case class LoginForm(username: String, password: String)

class User(
                 val id: Long = 0,
                 val username: String,
                 var password: String,
                 var realname: String,
                 var status: Boolean,
                 @Column("create_by") var createBy: Option[String],
                 @Column("modified_by") var modifiedBy: Option[String],
                 @Column("create_date") var createDate: Option[Date],
                 @Column("modified_date") var modifiedDate: Option[Date],
                 @Column("last_login_date") var lastLoginDate: Option[Date],
                 var age: Option[Int],
                 var gender: Option[String],
                 var height: Option[Float],
                 var weight: Option[Float]
                 );

object User extends Schema {

  if (Play.isDev(current)) {
    Session.currentSession.setLogger(msg => println(msg))
  }

  val users = table[User]("tb_user")

  def login(form: LoginForm): User = {
    val dbUser: List[User] = from(User.users)(user =>
      where(user.username === form.username and user.password === form.password).select(user)
    ).toList
    if (dbUser.isEmpty) null else dbUser(0)
  }

}
