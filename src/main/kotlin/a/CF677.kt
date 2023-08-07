package a

// https://codeforces.com/contest/677/problem/A
// Vanya and fence
fun main() {
    val numbers= readInts()
    var n = numbers[0]
    val h = numbers[1]
    var ans = 0
    val heights = readInts()
    for (i in 0 until n){
        val curr = heights[i]
        ans += if(curr> h)
            2
        else
            1
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