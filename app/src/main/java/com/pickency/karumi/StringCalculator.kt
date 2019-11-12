package com.pickency.karumi

class StringCalculator {
    fun add(num: String, separator: String) =
        when {
            num.isEmpty() -> 0
            num.contains("-") -> throw NumberFormatException()
            else -> num.split("/n", ",").map { it.toInt() }.sum()

        }


}


