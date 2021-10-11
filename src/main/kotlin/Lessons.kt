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


}