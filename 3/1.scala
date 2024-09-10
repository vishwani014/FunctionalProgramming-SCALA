def reverse(s:String):Unit = {
    var revStr = ""

    if(s.length() <= 0){
        revStr = "";
    }
    else{
        for(i <- s.length()-1 to 0 by -1){
            revStr +=  s(i);
        }
    }
    println(revStr)
}



@main def main = {
    reverse("SCALA");
    reverse("");
}