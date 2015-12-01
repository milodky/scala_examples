object NestedFunction {

  def main(args: Array[String]) {
    nested_function1()
  }
  def nested_function1() {
    println("in nested function1!")
    def nested_function2() {
      println("in nested function2!")
      nested_function1()
    }
    nested_function2()
  }
}
