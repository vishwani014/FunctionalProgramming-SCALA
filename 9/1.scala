object calculateInterest extends App{
    val interest: Double => Double = deposit => deposit match{
        case d if d <= 20000 => d * 0.02
        case d if d <= 200000 => d * 0.04
        case d if d <= 2000000 => d * 0.035
        case d if d > 2000000 => d * 0.065
    }

    println(interest(10000))
    println(interest(100000))
    println(interest(1000000))
    println(interest(2500000))
}