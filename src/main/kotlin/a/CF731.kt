package a

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

// https://codeforces.com/contest/731/problem/A
// Night at the museum
fun main() {
    val s = readLn()
    var prev = 97
    var ans = 0
    s.forEach { c ->
        var x1 = abs(c.code - prev)
        var x2 = min(abs(c.code - prev), (122- max(c.code,prev) + (min(c.code,prev)-97)+1))
        ans+= min(x1,x2)
        prev = c.code
    }
    println(ans)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints