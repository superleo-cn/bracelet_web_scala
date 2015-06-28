package controllers

import constants.Constants
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    request => {
      val id: String = request.session.get(Constants.CURRENT_USERID).getOrElse(null)
      val username: String = request.session.get(Constants.CURRENT_USERNAME).getOrElse(null)
      val realname: String = request.session.get(Constants.CURRENT_USER_REALNAME).getOrElse(null)
      Ok(views.html.index("abc"))
    }
  }
}