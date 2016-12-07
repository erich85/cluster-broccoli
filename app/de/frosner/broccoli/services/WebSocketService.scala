package de.frosner.broccoli.services

import javax.inject.{Inject, Singleton}

import de.frosner.broccoli.util.Logging
import play.api.Configuration
import play.api.libs.iteratee.Concurrent

@Singleton
class WebSocketService @Inject() () extends Logging {

  val (out, channel) = Concurrent.broadcast[String]

}