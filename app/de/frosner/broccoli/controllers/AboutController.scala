package de.frosner.broccoli.controllers

import javax.inject.Inject

import de.frosner.broccoli.services.{BuildInfoService, InstanceService, PermissionsService}
import play.api.libs.json.{JsObject, JsString, Json}
import play.api.mvc.{Action, AnyContent, Controller}

class AboutController @Inject()(buildInfoService: BuildInfoService,
                                permissionsService: PermissionsService,
                                instanceService: InstanceService) extends Controller {

  def about: Action[AnyContent] = Action {
    Ok(JsObject(Map(
      "project" -> JsObject(Map(
        "name" -> JsString(buildInfoService.projectName),
        "version" -> JsString(buildInfoService.projectVersion)
      )),
      "scala" -> JsObject(Map(
        "version" -> JsString(buildInfoService.scalaVersion)
      )),
      "sbt" -> JsObject(Map(
        "version" -> JsString(buildInfoService.sbtVersion)
      )),
      "permissions" -> JsObject(Map(
        "mode" -> JsString(permissionsService.getPermissionsMode)
      )),
      "nomad" -> JsObject(Map(
        "jobPrefix" -> JsString(instanceService.nomadJobPrefix)
      ))
    )))
  }

}
