package khurshidebk_kurbanov

import java.util.*

class Tasks1 {

    fun isAnagrams(str1: String, str2: String): Boolean {

        if (str1.length != str2.length) {
            return false
        }

        val strArray1 = str1.toCharArray()
        val strArray2 = str2.toCharArray()

        Arrays.sort(strArray1)
        Arrays.sort(strArray2)

        val sortedStr1 = String(strArray1)
        val sortedStr2 = String(strArray2)

        return sortedStr1 == sortedStr2

    }

    fun armstrongNumber(number: Int): Boolean {

        var result = 0
        var indexResult: Int

        number.toString().toCharArray().apply {

            for (c in this) {

                indexResult = Integer.parseInt(c.toString())

                for (i in 0 until this.size -1) {

                    indexResult *= Integer.parseInt(c.toString())
                    println(indexResult)

                }

                result += indexResult

            }

        }

        return result == number
    }
}