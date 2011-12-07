import sbt._
import Keys._
import com.github.siasia.WebPlugin
import xml.transform.{RewriteRule, RuleTransformer}

object BuildSettings {

  lazy val basicSettings = Seq[Setting[_]](
    organization  := "org.alexboisvert",
    version       := "1.0-SNAPSHOT",
    description   := "A project for profiling Scala code",
    scalaVersion  := "2.9.1",
    resolvers     ++= Dependencies.resolutionRepos
  )

  lazy val moduleSettings = basicSettings ++ Seq(
    // compiler and scaladoc settings
    scalacOptions := Seq("-deprecation", "-encoding", "utf8"),
    (scalacOptions in doc) <++= (name, version).map { (n, v) => Seq("-doc-title", n, "-doc-version", v) }
    ,

    // work-around for SBT 0.11.1 issue #257 (https://github.com/harrah/xsbt/issues/257)
    pomPostProcess := new RuleTransformer(
      new RewriteRule {
        import xml._
        override def transform(n: Node) = n match {
          case e: Elem if e.label == "classifier" => NodeSeq.Empty
          case e => e :: Nil
        }
      }
    )
  )

  lazy val noPublishing = Seq(
    publish := (),
    publishLocal := ()
  )

  lazy val exampleSettings = basicSettings ++ noPublishing

  lazy val jettyExampleSettings = exampleSettings ++ WebPlugin.webSettings
}