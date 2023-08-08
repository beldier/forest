package a

// https://codeforces.com/contest/734/problem/A
// Anton and Danik
fun main() {
    var n = readInt()
    val s = readLn()
    var anton = 0
    var danik = 0
    for (i in 0 until n){
        if(s[i] == 'A')
            anton++
        else
            danik++
    }
    if(anton == danik){
        println("Friendship")
        return
    }
    if(anton> danik){
        println("Anton")
        return
    }
    if(anton < danik){
        println("Danik")
        return
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