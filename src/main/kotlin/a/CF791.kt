package a


// https://codeforces.com/contest/791/problem/A
// Bear and big brother
fun main() {
    var numbers = readInts()
    var a = numbers[0]
    var b = numbers[1]
    var years = 1
    while (true){
        a*=3
        b*=2
        if(a>b){
            println(years)
            return
        }
        years++
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