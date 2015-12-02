object CallByName {
  def main(args: Array[String]) {
    delayed(time());
  }
  def time() = {
    var t : Long = System.nanoTime
    println(s"Getting time($t) in nano seconds")
    t
  }
  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
    // no explicit return like Ruby?
    // it's like you put a block here and t actually refer to the method
    // every time you use t, it's gonna call the method t refers to
    t
  }
}
