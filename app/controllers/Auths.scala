package controllers

import models.{User, LoginForm}
import org.squeryl.PrimitiveTypeMode._
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._

class Auths extends Controller {

  def validate(username: String, password: String) = {
    username match {
      case "bob" if password == "abc" =>
        Some(LoginForm(username, password))
      case "admin" =>
        Some(LoginForm(username, password))
      case _ =>
        None
    }
  }

  val userForm = Form(
    mapping(
      "username" -> text,
      "password" -> text
    )(LoginForm.apply)(LoginForm.unapply)
  )

  def index = Action {
    Ok(views.html.login())
  }

  def loginJson = Action {
    implicit request => {
      userForm.bindFromRequest.fold(
        formWithErrors => {
          BadRequest("Error")
        },
        user => {
          inTransaction {
            val dbUser = User.login(user)
            Ok(views.html.index("abc"))
          }
        }
      )
    }
  }
}