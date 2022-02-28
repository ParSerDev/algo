fun main() {

    val a = readLine()?.toLong()?:0
    val b = readLine()?.toLong()?:0

    fun C(a: Long, b: Long): Long {
        if (b==a||b==0L) return 1
        else return C(a-1, b-1) + C(a-1, b)
    }

    print(C(a, b))

}