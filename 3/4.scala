def sumOfEvens(list:List[Int]): Int = {
    var sum = 0;

    for(i <- 0 to list.length-1){
        if(list(i) % 2 == 0){
            sum += list(i);
        }
    }
    sum;
}




@main def main = {
    println(sumOfEvens(List(1,2,3,4,5,6,7,8,9,10)));
}