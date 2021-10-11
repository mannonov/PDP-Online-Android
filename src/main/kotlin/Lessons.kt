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

}