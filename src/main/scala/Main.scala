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

    for (i <- 1 to 5) {
      println("i using TO method: " + i)
    }
    for (i <- 1 until 5) {
      println("i using UNTIL method " + i)
    }

    for (i <- 1 to 5; j <- 1 until 5) {
      println("i  and j using nested loop: " + i + " " + j)
    }

    val square = for {i <- 1 to 5} yield { i * i}
    println(square)
  }
}