package com.example.privacy_policy_lib

import android.util.Log
import kotlin.random.Random

class Test {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }

        fun printSayi() {
            val min = 1
            val max = 6
            val rastgele = rastgeleSayi(min, max)
            println("Rastgele sayı: $rastgele")
        }

        fun printLog(tag: String, message: String) {
            Log.d(tag, message)
        }

        fun rastgeleSayi(min: Int, max: Int): Int {
            return Random.nextInt(min, max + 1)
        }
    }
}
