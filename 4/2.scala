import scala.io.StdIn._

def PatternMatching(n : Int) : Unit = n match{
    case x if n <= 0 => println("Negative/Zero");
    case x if n % 2 == 0 => println("Even Number");
    case _ => println("Odd Number");
}

@main def main() = {
    PatternMatching(readInt());
}