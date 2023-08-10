package a

// https://codeforces.com/contest/59/problem/A
// Word
fun main() {
    val s = readLn()
    val uppersAmount = s.toList().filter { it.isUpperCase()  }.size
    if(uppersAmount > s.length/2)
        println(s.uppercase())
    else
        println(s.lowercase())

}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doub