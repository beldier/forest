package a

// https://codeforces.com/contest/427/problem/A
// Police recruits
fun main() {
    var n = readInt()
    var officersAvailable = 0
    var untreated = 0
    val events = readInts()
    for (i in 0 until n) {
        if (events[i] < 0) {
            if (officersAvailable < 1)
                untreated++
            else
                officersAvailable--
        } else
            officersAvailable += events[i]
    }
    println(untreated)
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints