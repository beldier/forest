package a

// https://codeforces.com/contest/431/problem/A
// Black Square
fun main() {
    var strips = readInts()
    var calories = readLn().map { it.code - 48}
    var ans = 0
    calories.forEach { c ->
        ans+= strips[c - 1]
    }
    println(ans)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints