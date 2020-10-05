
object classEg {
  def main(arg: Array[String]){
    var ob = new NewClass("Hello World")
    ob.sayHi()
  }
}

class NewClass(mssg: String){
  def sayHi() = println(mssg)
}
