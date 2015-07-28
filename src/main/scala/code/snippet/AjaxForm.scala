package code.snippet

import net.liftweb.http._
import net.liftweb.util.Helpers._

/**
 * @author user
 */
class AjaxForm(value: String) extends StatefulSnippet {
  
  def dispatch = {
    case "render" => render
  }
  
  def render = "#value *" #> value
  
}