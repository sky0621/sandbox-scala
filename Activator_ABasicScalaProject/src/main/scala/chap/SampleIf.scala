package chap

/**
  * Created by SS on 2016/07/10.
  */
object SampleIf {

  def main(args: Array[String]): Unit = {
    println("SampleIf")

    val str = "Scala,Java,Go,Ruby,PHP,JavaScript,Python,Clojure,Groovy"
    val ifList: List[String] = if(str != null){
      str.split(",").toList
    } else {
      Nil
    }
    ifList.foreach(l => println(l))
  }

}
