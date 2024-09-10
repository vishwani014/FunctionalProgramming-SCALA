object CeasarCipher extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
    val input = (scala.io.StdIn.readLine("Text: "))

    def CeasarEncryption(input:String, shift:Int) : String = {
        val output = input.map((c:Char) => {
            val i = alphabet.indexOf(c.toUpper)
            if(i == -1){
                c
            }
            else{
                alphabet((i + shift) % alphabet.size)
            }
        })
        output
    }

    def CeasarDecryption(input:String, shift:Int) : String = {
        val output = input.map((c:Char) => {
            val i = alphabet.indexOf(c.toUpper)
            if(i == -1){
                c
            }
            else{
                alphabet((i - shift + alphabet.size) % alphabet.size)
            }
        })
        output
    }

    //CeasarEncryption(input,shift)
    //CeasarDecryption(input,shift)

    def CeasarCipher(input:String, shift:Int, CeasarEncryption:(String, Int) => String, CeasarDecryption:(String, Int) => String) : Unit = {
        val encrypted = CeasarEncryption(input, shift)
        val decrypted = CeasarDecryption(input, shift)

        println(s"Encrypted: $encrypted")
        println(s"Decrypted: $decrypted")
    }

    CeasarCipher(input, shift, CeasarEncryption, CeasarDecryption)

}