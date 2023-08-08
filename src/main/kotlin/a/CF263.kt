package a

import kotlin.math.abs


// https://codeforces.com/contest/263/problem/A
// Beautiful Matrix
fun main() {
    var amount = 5
    var row = 0
    var ans = 0
    while (amount-- > 0) {
        val pos = readInts().indexOf(1)
        if(pos>=0){
            ans = abs(pos - 2 ) + abs(row - 2)
        }
        row++
    }
    println(ans)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles