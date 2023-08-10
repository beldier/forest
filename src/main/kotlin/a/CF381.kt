package a

// https://codeforces.com/contest/381/problem/A
// Sereja and Dima
fun main() {
    val n = readInt()
    var cards = readInts()
    var i=0
    var j = cards.size-1
    var serejaTurn = true
    var sereja = 0
    var dima = 0
    while(i<=j){
        if(cards[i] > cards[j]){
            if(serejaTurn)
                sereja+= cards[i]
            else
                dima+= cards[i]
            i++
        } else{
            if(serejaTurn)
                sereja+= cards[j]
            else
                dima+= cards[j]
            j--
        }
        serejaTurn = !serejaTurn
    }
    println("$sereja $dima")
}

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doub