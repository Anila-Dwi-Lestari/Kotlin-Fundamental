fun main(){
    val nilai = 75
    val hasil : String

    hasil = if  (nilai > 90){
        "A"
    }else if  (nilai > 80 && nilai <=90){
        "B"
    }else if  (nilai > 70 && nilai <=80){
        "C"
    }
    else if  (nilai > 60 && nilai <=70){
        "D"
    }
    else {
        "E"
    }
    println(hasil)
}