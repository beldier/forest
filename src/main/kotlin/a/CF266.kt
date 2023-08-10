package a

// https://codeforces.com/contest/266/problem/A
// Stones on the table
fun main() {
    val n = readInt()
    var s = readLn()
    var ans = 0
    var prev = s[0]
    for( i in 1 until s.length){
        if(prev == s[i])
            ans++
        prev = s[i]
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
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doub