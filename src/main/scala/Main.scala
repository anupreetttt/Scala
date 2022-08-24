object Main {
  def main(args: Array[String]): Unit = {
      val myName = "Anupreet"
      val myAge = 20.5;
    println("My name is " + myName + " and my age is " + myAge + ".")
    println(s"$myName is $myAge years old.") //s interpolation
    println(f"$myName%s is $myAge%f years old.") // type safe
    println(raw"Hello \nworld") // prints literal code

  }
}