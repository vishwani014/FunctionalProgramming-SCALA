object RationalNum extends App{
    val rationalNum = new rational(2,7)
    println(rationalNum.neg().toString())

    val rationalNumber1 = new rational(3,4)
    val rationalNumber2 = new rational(5,8)
    val rationalNumber3 = new rational(2,7)

    println(rationalNumber1.sub(rationalNumber2).sub(rationalNumber3).toString())
}

class rational(x:Int, y:Int){
    def numer = x
    def denom = y

    def neg() = new rational(-numer , denom)

    def sub(r:rational) = new rational(numer*r.denom - r.numer*denom, denom*r.denom)

    override def toString(): String = numer + "/" + denom
}