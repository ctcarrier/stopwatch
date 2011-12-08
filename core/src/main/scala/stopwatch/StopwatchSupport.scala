package stopwatch

import TimeUnit._

/**
 * @author chris_carrier
 * @version 12/7/11
 */


trait StopwatchSupport {
  
  def stopwatchGroupName: String

  def printShortString = println(withTiming.snapshot("test").toShortString)
  def printMediumString = println(withTiming.snapshot("test").toMediumString)
  def printLongString = println(withTiming.snapshot("test").toLongString)

  def handleResults(f: String => Unit) = f(withTiming.snapshot("test").toShortString)

  def snapshot(s: String) = withTiming.snapshot(s)

  val withTiming = new StopwatchGroup(stopwatchGroupName)
  withTiming.enabled = true
  withTiming.range = StopwatchRange(0 seconds, 10 seconds, 500 millis)

}