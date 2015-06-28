package constants

/**
 * Created by superleo on 19/6/15.
 */
object Constants {
  var WEBSITE_URL: String = "http://pos.emd.com.sg/"
  var PICTURE_URL: String = WEBSITE_URL + "public/upload/"
  var CODE: String = "code"
  var CODE_SUCCESS: String = "200"
  var CODE_NOT_FOUND: String = "404"
  var CODE_FAILURE: String = "500"
  var DATAS: String = "datas"
  var STATUS: String = "status"
  var MESSAGE: String = "message"
  var COUNT: String = "count"
  var HAVE_MORE: String = "havemore"
  var NA: String = "N.A."
  var SUCCESS: String = "1"
  var FAILURE: String = "0"
  var ERROR: String = "-1"
  var PATTERN_YYYYMMDDHHMMSS: String = "yyyyMMddHHmmss"
  var PATTERN_YYYYMMDD: String = "yyyyMMdd"
  var USERTYPE_ADMIN: String = "Admin"
  var USERTYPE_DOCTOR: String = "Doctor"
  var USERTYPE_USER: String = "User"
  var LOGIN_USERTYPS: List[String] = List(USERTYPE_ADMIN, USERTYPE_DOCTOR, USERTYPE_USER)
  var CURRENT_USERID: String = "current_id"
  var CURRENT_USERNAME: String = "current_username"
  var CURRENT_USER_REALNAME: String = "current_realname"
  var CURRENT_ROLE: String = "current_role"
  var CURRENT_CREATE_DATE: String = "current_create_date"
  var CURRENT_BRACELETS: String = "current_bracelets"


}
