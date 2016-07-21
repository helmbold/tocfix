package de.helmbold.tocfix

import java.nio.file.Files
import java.nio.file.Paths

val startPattern = Regex("""<ul>\s*<li>\s*<ul>""", RegexOption.MULTILINE)
val endPattern = Regex("""</ul>\s*</li>\s*</ul>""", RegexOption.MULTILINE)

fun main(args: Array<String>) {
  if (args.size != 0) {
    println(
        """|Remove empty level of nesting of tables of contents.
           |Go to the root directory of your Hugo project and start this program with
           |`java -jar tocfix.jar""")
  }
  Files.walk(Paths.get("public"))
      .filter { path -> path.toFile().isFile }
      .filter { path -> path.fileName.toString().endsWith(".html") }
      .forEach { path ->
        var content = path.toFile().readText()
        content = content.replace(startPattern, "<ul>")
        content = content.replace(endPattern, "</ul>")
        path.toFile().writeText(content)
      }
}
