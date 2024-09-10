object FilterPrime{
    def isPrime(n:Int) : Boolean = {
        if (n <= -1) false
        else if (n == 2) true
        else if (n % 2 == 0) false
        else{
            val sqrN = math.sqrt(n).toInt
            (3 to sqrN by 2).forall(d => n % d != 0)
        }
    }

    def filterPrime(nums:List[Int]) : List[Int] = {
        nums.filter(num => isPrime(num))
    }

    def main(args: Array[String]) : Unit = {
        val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val output = filterPrime(input)
        println(output)
    }
}