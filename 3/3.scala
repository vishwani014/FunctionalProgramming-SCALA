def getAverage(num1:Int, num2:Int) : Unit ={
    val rounded_avg = ((num1 + num2) / 2.0);
    println(f"$rounded_avg%.2f");
}



@main def main = {
    getAverage(5,2);
}