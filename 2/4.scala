def DetermineProfit(ticket_price:Int):Int = {
    val show_cost = 500;
    val attendee_cost = 3;

    val gen_price = 15;
    val gen_attendance = 120;

    val price_incr_decr = 5;
    val attendance_incr_decr = 20;

    val no_of_participants = (((gen_price - ticket_price)/5) * 20) + gen_attendance;
    val total_cost = show_cost + (attendee_cost * no_of_participants);
    val income = ticket_price * no_of_participants;

    val profit = income - total_cost;

    profit
}

@main def main = {
    println(DetermineProfit(5)); //profit = -180
    println(DetermineProfit(10)); //profit = 480
    println(DetermineProfit(15)); //profit = 940
    println(DetermineProfit(20)); //profit = 1200
    println(DetermineProfit(25)); //profit = 1260 Best ticket price 
    println(DetermineProfit(30)); //profit = 1120
}