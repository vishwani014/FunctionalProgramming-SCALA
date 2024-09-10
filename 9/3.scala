object formatStrings extends App{
    val toUpper: String => String = name => name.toUpperCase
    val toLower: String => String = name => name.toLowerCase

    def formatNames(name : String)(f: String => String) : String ={
        f(name)
    }

    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(name => toUpper(name.substring(0,2)) + toLower(name.substring(2))))
    println(formatNames("Saman")(toLower))
    println(formatNames("Kumara")(name => toUpper(name.substring(0,1)) + toLower(name.substring(1,5)) + toUpper(name.substring(5))))
}