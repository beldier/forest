package a

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

// https://codeforces.com/contest/268/problem/A
// Games
fun main() {
    var n = readInt()
    val host = mutableListOf<Int>()
    val guest = mutableListOf<Int>()
    var ans = 0
    while (n-- > 0) {
        val nums = readInts()
        host.add(nums[0])
        guest.add(nums[1])
    }
    host.forEach { h ->
        ans += guest.count { g -> g == h }
    }
    println(ans)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints