import scala.io.StdIn.readLine

object Conditionals extends App {
  //conditionals let us branch our code, take one of multiple paths

//  val a = -400
  val a = readLine("Enter value of a(must be number)").toDouble //we will allow floating points as well

  // remember a could be coming from somewhere else or user input or database or somewhere
  if (a > 10) println(s"a is larger than 10, actually a is $a") // so nothing happens if a is not larger than 10

  //we can also do if else, show two paths
  if (a > 8) println(s"a is larger than 10, actually a is $a")
  else println("a is less or equal to 8")

  //if we need to do more work we can use curly braces for multiple instructions

  if (a > 9000) {
    println("Wow it is over 9000!")
    println(s"a is $a")
  } else {
    println("Sorry not quite 9000...")
    println(s"a is $a") //here of course we could have simplied code by putting
  }
  //println(s"a is $a") here

  //we can keep branching actually
  if (a > 100) {
    val b = 33333 // b is local only within these ineer curly bracers
    if (a > 500) println("Over 500") //so branch inside a branch
    else println("over 100 but less or equal to 500")
    println(s"WE can print b just for heck of it $b")
  } else println("less than or equal to 100")

  //
//  println(b) //so b is only accessible to within that  {} block after a > 100

}
