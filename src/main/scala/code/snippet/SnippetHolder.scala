package code.snippet

import net.liftweb.http.Templates
import net.liftweb.http.S
import net.liftweb.http.SHtml._
import net.liftweb.util.Helpers._
import net.liftweb.util.StringHelpers
import net.liftweb.http.js.jquery.JqJsCmds._
import net.liftweb.http.js.JsCmds._


/**
 * @author user
 */
class SnippetHolder {
  
  def render =
    "#show-new-form" #> ajaxButton("show new form", () => {
      S.overrideSnippetForClass("AjaxForm", new AjaxForm(StringHelpers.randomString(8)))
      SetHtml("ajax-form", Templates("templates-hidden"::"ajax-form"::Nil).openOrThrowException("I know it's there")) &
      Show("ajax-form")
    }) &
    "#hide-form" #> ajaxButton("hide form", () => {
      SetHtml("ajax-form", Nil) & Hide("ajax-form")
    })
}
