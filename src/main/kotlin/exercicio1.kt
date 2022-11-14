fun main () {
calendario()
}

fun calendario () {
    val ano = 2
    println("2 anos é equivalem a : ")
    println("${ano*12} meses")
    println("${ano*365} dias")
    println("${ano*365*24} horas")
    println("${ano*365*24*60} minutos")
    println("${ano*365*24*60*60} segundos")
}