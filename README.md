# tocfix

This small tool is a workaround for [bug](https://github.com/spf13/hugo/issues/1778) in the static site generator [Hugo](http://gohugo.io/). Hugo generates an unnecessary level of nesting in tables of contents, if the content is structured with `h2` (and not h1) headings (and below).

Usage
-----

Build the project with `gradle bigJar` and place the jar file from build/libs in a directory contained in your PATH, or put in a the base directory of your Hugo project.

```
cd some/hugo/project
java -jar tocfix-1.0.jar
```