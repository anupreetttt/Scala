object Main {
  def main(args: Array[String]): Unit = {
      val myName = "Anupreet"
      val myAge = 21;

    if (myAge == 20) {
      println("My name is " + myName + " and my age is " + myAge + ".")
      println(s"$myName is $myAge years old.") //s interpolation
      println(f"$myName%s is $myAge years old.") // type safe
      println(raw"Hello \nworld") // prints literal code
    } else {
      println(s"$myName is not $myAge yet.")
    }

    println(if(myAge == 20) f"Age is $myAge%d." else f"Age is not $myAge%d.");


    var x = 0
    while(x <= 100) {
      println("Value x = " + x)
      x += 10;
    }
    var y = 0
    do {
      println("Value y= " + y)
      y += 10
    } while (y == 100)
  }
}