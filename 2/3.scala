def TakeHomeSalary(normal:Int, OT_Hours:Int):Int = {
    val normal_pay = 250;
    val OT_pay = 85;
    val tax_percentage = 12
    val salary = ((normal * normal_pay) + (OT_Hours * OT_pay)) * 4 * (100 - tax_percentage) / 100

    salary
}

@main def main = {
    val s = TakeHomeSalary(40, 30);
    println(s"Monthly Takehome Salary: RS.$s")
}
