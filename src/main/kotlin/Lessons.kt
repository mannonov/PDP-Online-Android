import java.lang.StringBuilder
import java.util.*

class Lessons {

    fun avarage(a: Int, b: Int, c: Int): Int {

        return (a + b + c) / 3

    }

    fun squarePerimeterArea(number: Int): Map<String, Int> {

        return hashMapOf<String, Int>().apply {
            put("Perimeter", (number * 4))
            put("Area", (number * number))
        }

    }

    fun changeTwoVariableValue(a: Int, b: Int) {

        var a = a
        var b = b

        a *= b
        b = a / b
        a /= b

        println("a = $a , b = $b")

    }

    fun calculateDiameterAndRadius(a: Any): Map<String, Any> {

        return hashMapOf<String, Any>().apply {

            val area: Double = a.toString().toDouble()
            val r = Math.sqrt(7 * area / 22)

            put("Diameter", r * 2)
            put("Radius", r)

        }


    }

    fun calculateTwoCarsDistance(v1: Int, v2: Int, s: Int, t: Int): Int {

        return (v1 * t) + (v2 * t) + s

    }

    fun convertDegreeToRadian(degree: Double): Double {

//        return Math.toRadians(degree)

        return (degree * (Math.PI / 180))

    }

    fun replaceNumbers(number: Int): Int {

        var first = 0
        var second = 0
        var numberClone = number

        loop@ while (true) {

            if (numberClone in 999 downTo 100) {

                first = numberClone % 10
                numberClone /= 10
                println(first)

            } else if (numberClone in 100 downTo 10) {

                second = numberClone % 10
                numberClone /= 10
                println(second)

            } else {
                numberClone = (numberClone * 10) + first
                numberClone = (numberClone * 10) + second
                break@loop
            }


        }
        return numberClone

        //Tired of writing the same code, I came up with a new way
    }

    fun howManySeconds(): Int {

        val cal = Calendar.getInstance()
        val hour = cal.get(Calendar.HOUR_OF_DAY)
        val minute = cal.get(Calendar.MINUTE)
        val second = cal.get(Calendar.SECOND)

        return (hour * 3600) + (minute * 60) + second

    }

    fun findTheCubeRoot(number: Double): Double {

        return Math.cbrt(number)

    }

    fun findTriangleHypotenuse(adjacent: Double, opposite: Double): Double {

        return Math.sqrt((adjacent * adjacent) + (opposite * opposite))

    }

    fun biggestOfThree(x: Int, y: Int, z: Int): Int {

        return if (z > (if (x > y) x else y)) z else if (x > y) x else y

    }


    fun printLastTwoLetter(text: String = "Jahongir") {

        // String = charArray()

        for (i in 0..3) {
            println("last two letter = ${text[text.length - 2]}${text[text.length - 1]}")
        }

    }

    fun changeLettersPlace(text: String = "Kotlin"): StringBuilder {

        return StringBuilder().apply {

            append(text[text.length - 2])
            append(text[text.length - 1])
            append(text.substring(0, text.length - 2))


        }

    }

    fun removeFirstAndLastLetter(text: String = "Jahongir"): String {

        return text.substring(1, text.length - 1)

    }


}