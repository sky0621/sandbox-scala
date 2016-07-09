package chap

/**
  * Created by SS on 2016/07/10.
  */
object SampleFor {

  def main(args: Array[String]): Unit = {
    val rng = Range(1, 10)
    for(i <- rng) {
      println(i)
    }

    val lst = List("Scala", "Go", "Java", "Ruby", "Clojure", "PHP", "Python", "C")
    val lst2 = for(lang <- lst if !lang.startsWith("C") if !lang.startsWith("P")) yield lang
    lst2.foreach(lang => println(lang))
  }
}
