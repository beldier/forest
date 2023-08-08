package a


// https://codeforces.com/contest/231/problem/A
// TEAM
fun main() {
    var n = readInt()
    var ans = 0
    while (n-->0){
        var sum = readInts().sum()
        if(sum>= 2)
            ans++
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