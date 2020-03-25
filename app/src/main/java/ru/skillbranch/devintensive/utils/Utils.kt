package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullname: String?): Pair<String?, String?> {
        val parts: List<String>? = fullname?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)

        return Pair(firstName, lastName)
    }
}