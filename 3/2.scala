def filterString(s:String) : Array[String] = {
    var List = s.split(" ");
    var newStr = "";

    for(i <- 0 to List.length-1){
        if(List(i).length() > 5){
            newStr += List(i) + " ";
        }
    }
    val new_list = newStr.split(" ");
    new_list;
}



@main def main = {
    println((filterString("ant elephant rabbit cow parrot")).mkString(" "));
}