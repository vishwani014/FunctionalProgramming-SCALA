object checkNumber extends App{
    val num = scala.io.StdIn.readInt()

    val checkNum: Int => String = num => num match{
        case n if n <= 0 => "Negative/Zero"
        case n if n % 2 == 0 => "Even Number"
        case _ => "Odd Number"
    }

    println(checkNum(num))
}