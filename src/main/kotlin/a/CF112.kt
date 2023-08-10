package a

// https://codeforces.com/contest/112/problem/A
// Petya and String
fun main() {
    val s1 = readLn()
    val s2 = readLn()
    val ans  =s1.compareTo(s2,true)
    if(ans == 0 ){
        println(0)
        return
    }
    if(ans>0) {
        println(1)
        return
    }
    println(-1)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles