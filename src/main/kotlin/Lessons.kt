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

    fun calculateTwoCarDistance(v1: Int, v2: Int, s: Int, t: Int): Int {

        return (v1 * t) + (v2 * t) + s

    }

}