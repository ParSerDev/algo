import java.util.Vector

fun main() {

    val num = readLine()?.toInt()?:0

    val booleanArray = BooleanArray(100001)
    val resultsArray = Vector<Int>()

    fun prime(num: Int) {

        for(a in 2..num) {
            booleanArray[a]=true
        }

        for(a in 2..num) {
            if (booleanArray[a]==true) {

                resultsArray.add(a)

                var b = a*2

                while (b <= num) {
                    booleanArray[b]=false
                    b+=a
                }
            }
        }

        resultsArray.forEachIndexed { index, item ->
            if (index == resultsArray.size) {
                print(item.toString())
            }
            else print(item.toString() + " ")
        }



    }

    prime(num)
}