def AreaOfDisk(r:Double):Double = {
    math.Pi * r * r
}

def CelciusToFarenheit(celcius:Double):Double = {
    celcius * 1.8000 + 32.00
}

def VolumeOfSphere(r:Double):Double = {
    (4 * math.Pi * r * r *r) / 3
}

def WholeSaleCost(no_of_copies:Int):Double = {
    val cover_price = 24.95
    val discount = 0.4
    val discounted_price = no_of_copies * cover_price * (1-discount)

    def ShippingCost(no_of_copies:Int):Double = {
        if (no_of_copies <= 50){
            3.0
        }
        else{
            3.0 + ((no_of_copies - 50) * 0.75)
        }
    }

    discounted_price + ShippingCost(no_of_copies)
}

def CalculateTime(easy1:Int, tempo:Int, easy2:Int):Double = {
    val easy_speed = 8
    val tempo_speed = 7

    def easy_pace(easy:Int):Double = easy * easy_speed
    def tempo_pace(tempo:Int):Double = tempo * tempo_speed

    easy_pace(easy1) + tempo_pace(tempo) + easy_pace(easy2)
}

@main def main = {
    println(AreaOfDisk(5))
    println(CelciusToFarenheit(35))
    println(VolumeOfSphere(5))
    println(WholeSaleCost(60))
    println(CalculateTime(2,3,2))
}