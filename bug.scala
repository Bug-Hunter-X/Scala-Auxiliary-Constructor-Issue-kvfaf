```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
  def method1(): Unit = {
    println(x)
  }
  def method2(): Int = x
}

object Main extends App {
  val obj1 = new MyClass(5)
  val obj2 = new MyClass()
  obj1.method1()
  println(obj2.method2())
}
```