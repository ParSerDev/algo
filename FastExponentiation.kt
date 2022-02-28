fun main() {
    val number = readLine()?.toDouble() ?: 0.toDouble()
    val degree: Int = readLine()?.toInt() ?: 0

    fun binpow(number: Double, degree: Int): Double {
        when {
            number in 0.toDouble()..1.toDouble() -> return number
            degree==0 -> return 1.toDouble()
            (degree%2)==0 -> {
                val a = binpow(number, degree/2)
                return a*a
            }
            else -> return binpow(number, degree-1) * number
        }
    }

    val result = binpow(number, degree)

    println(result)
}