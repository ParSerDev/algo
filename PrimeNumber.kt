
    fun main() {

        val a = readLine()?.toDouble() ?: 2.0

        fun isPrime(a: Double): Boolean {

            var b = 2.0

            while (b <= Math.sqrt(a)) {
                if (a % b == 0.0) return false
                b++
            }

            return true

        }


        print(if (isPrime(a)) "YES" else "NO")

    }
