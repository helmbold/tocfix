# tocfix

This small tool is a workaround for [bug](https://github.com/spf13/hugo/issues/1778) in the static site generator [Hugo](http://gohugo.io/). Hugo generates an unnecessary level of nesting in tables of contents, if the content is structured with `h2` (and not h1) headings (and below).

Usage
-----

[Download tocfix.jar](http://helmbold.de/tocfix.jar) or build the project from source. You can build the project with `gradle bigJar`. The generated jar file will be in build/libs. Place the jar file in a directory contained in your PATH, or put it in a the base directory of your Hugo project.

```
cd some/hugo/project
java -jar tocfix.jar
```

Prerequisites
-------------

JDK 8 for building from source. To run it, JRE 8 is sufficient. You can [download the JDK or JRE](http://www.oracle.com/technetwork/java/javase/downloads/index.html) from Oracle.