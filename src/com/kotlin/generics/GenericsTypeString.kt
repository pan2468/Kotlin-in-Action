package com.kotlin.generics

inline fun <reified T> isA(value: Any) = value is T

fun main() {
    println(isA<String>("abc"))
}