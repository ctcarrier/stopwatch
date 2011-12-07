import sbt._

object Dependencies {

  val resolutionRepos = Seq(
    "Akka Repository" at "http://akka.io/repository/",
    "Glassfish Repository" at "http://download.java.net/maven/glassfish/",
    ScalaToolsSnapshots
  )


  object V {
    val akka      = "1.3-RC1"
    val jetty     = "8.0.3.v20111011"
    val sprayCan  = "0.9.2-SNAPSHOT"
    val sprayJson = "1.1.0-SNAPSHOT"
    val slf4j     = "1.6.1"
    val logback   = "0.9.29"
    val liftJson  = "2.4-M2"
    val scalaTest  = "1.4.1"
    val scalaCheck  = "1.9"
    val junit  = "4.5"
  }

  object Compile {
    val akkaActor     = "se.scalablesolutions.akka" %   "akka-actor"                % V.akka      % "compile"
    val parboiled     = "org.parboiled"             %   "parboiled-scala"           % "1.0.2"     % "compile"
    val mimepull      = "org.jvnet"                 %   "mimepull"                  % "1.6"       % "compile"
    val sprayCan      = "cc.spray.can"              %   "spray-can"                 % V.sprayCan  % "compile"
    val sprayJson     = "cc.spray.json"             %%  "spray-json"                % V.sprayJson % "compile"
    val pegdown       = "org.pegdown"               %   "pegdown"                   % "1.1.0"     % "compile"
  }

  object Provided {
    val akkaActor     = "se.scalablesolutions.akka" %   "akka-actor"                % V.akka            % "provided"
    val sprayJson     = "cc.spray.json"             %%  "spray-json"                % V.sprayJson       % "provided"
    val sprayCan      = "cc.spray.can"              %   "spray-can"                 % V.sprayCan        % "provided"
    val servlet30     = "org.glassfish"             %   "javax.servlet"             % "3.0"             % "provided"
    val jetty7Async   = "org.eclipse.jetty"         %   "jetty-continuation"        % "7.5.1.v20110908" % "provided"
    val tomcat6Async  = "org.atmosphere"            %   "atmosphere-compat-tomcat"  % "0.7.1"           % "provided"
    val slf4j         = "org.slf4j"                 %   "slf4j-api"                 % V.slf4j           % "provided"
    val liftJson      = "net.liftweb"               %   "lift-json_2.9.0-1"         % V.liftJson        % "provided"
    val liftJsonExt   = "net.liftweb"               %   "lift-json-ext_2.9.0-1"     % V.liftJson        % "provided"

  }

  object Test {
    val scalaTest = "org.scalatest" % "scalatest_2.9.0" % V.scalaTest % "test"
    val scalaCheck = "org.scala-tools.testing" % "scalacheck_2.9.0" % V.scalaCheck % "test"
    val junit      = "junit" % "junit" % V.junit % "test"
  }

  object Runtime {
    val jettyWebApp   = "org.eclipse.jetty"         %   "jetty-webapp"              % V.jetty   % "container"
    val akkaSlf4j     = "se.scalablesolutions.akka" %   "akka-slf4j"                % V.akka
    val slf4j         = "org.slf4j"                 %   "slf4j-api"                 % V.slf4j
    val logback       = "ch.qos.logback"            %   "logback-classic"           % V.logback
  }

}