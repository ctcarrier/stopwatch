[SBT]: https://github.com/harrah/xsbt/wiki

Stopwatch
=========

#### Stopwatch API to easily monitor production Scala applications. ####

This README.md file is the developer documentation.

Please refer to the website at <http://aboisvert.github.com/stopwatch/> for user documentation.

### About SBT ###

This branch of Stopwatch is compatible with [SBT] 0.11.2.

### Building ###


    # compile, and package .jars
    sbt update
    sbt compile
    sbt package

    # test
    sbt test

### Launching the sample web UI ###

    # launch the sample stopwatch server on port 9999
    TODO: buildr sample

### Target platform ###

* Scala 2.9.1
* JVM 1.5+

### License ###

Copyright (C) 2009-2010 by Alex Boisvert.

Stopwatch is is licensed under the terms of the Apache Software License v2.0.
<http://www.apache.org/licenses/LICENSE-2.0.html>
