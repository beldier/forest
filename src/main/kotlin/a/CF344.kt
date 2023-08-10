package a

// https://codeforces.com/contest/344/problem/A
// Magnets
fun main() {
    var s = readInt() - 1
    var ans = 1
    var last = readLn()
    while(s-->0){
        var current = readLn()
        if(last != current){
            ans++
            last = current
        }
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