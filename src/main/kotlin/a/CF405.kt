package a


// https://codeforces.com/contest/405/problem/A
// Gravitiy Flip
fun main() {
    val n = readInt()
    var squares = readInts().sorted()
    squares.forEach{
        print("$it ")
    }
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles