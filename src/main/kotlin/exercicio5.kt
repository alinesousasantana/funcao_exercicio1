fun main () {
text("Aline")
}

fun text (str:String) {
    println(str.lowercase().replace(oldValue = "A", newValue = "X", ignoreCase = true))

}