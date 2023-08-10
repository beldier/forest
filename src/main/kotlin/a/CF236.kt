package a

// https://codeforces.com/contest/236/problem/A
// Boy or Girl
fun main() {
    val s1 = readLn().toList().distinct().size
    if(s1 %2 != 0)
        println("IGNORE HIM!")
    else
        println("CHAT WITH HER!")

}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles