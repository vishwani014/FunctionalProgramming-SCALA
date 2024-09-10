def toUpper(str: String) : String = {
    str.toUpperCase();
}

def toLower(str: String) : String = {
    str.toLowerCase();
}

def formatNames(name: String)(format: String => String): String = {
    format(name);
}

@main def main() = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara");

    println(formatNames(names(0))(toUpper));
    println(formatNames(names(1))(name => name.substring(0,2).toUpper() + name.substring(2)))
    println(formatNames(names(2))(toLower));
    println(formatNames(names(3))(x => x.init + x.last.toUpper))
}