object Main {

  object Math {
    // int addNum(int m, int n) { return }
    def addNum(m: Int, n: Int): Int = {
      return m + n
    }

    def subNum(m: Int, n: Int): Int = {
      m - n
    }

    def multiplyNum(m: Int, n: Int): Int = m * n

    def divideNum(m: Int, n: Int) = m / n

  }

  def main(args: Array[String]): Unit = {
      val myName = "Paul"
      val myAge = 20;

    if (myAge == 20) {
      println("My name is " + myName + " and my age is " + myAge + " using concatenation.") //concatenation
      println(s"$myName is $myAge years old.") //s interpolation
      println(f"$myName%s is $myAge years old.") // type safe
      println(raw"Hello \nworld") // prints literal code
    } else {
      println(s"$myName is not $myAge yet.")
    }

    println(if(myAge == 20) f"Age is $myAge%d." else f"Age is not $myAge%d.");


    var x = 0
    while(x <= 50) {
      println("Value x = " + x)
      x += 10;
      //cannot do x++
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

    // Match as statement
    val num = 50

    num match {
      case 10 => println(num);
      case 20 => println(num);
      case 30 => println(num);
      case 40 => println(num);
      case 50 => println(num);

      case _ => println("Invalid")
    }
     // Match as expression
    val number = num match {
      case 10 => println(num);
      case 20 => println(num);
      case 30 => println(num);
      case 40 => println(num);
      case 50 => println(num);

      case _ => println("Invalid")
    }

    println(Math.addNum(3, 4))
    println(Math.subNum(3, 4))
    println(Math.multiplyNum(3, 4))
    println(Math.divideNum(3, 4))
  }
}