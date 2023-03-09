import java.io.PrintWriter


fun main() {
    val pw = PrintWriter(System.out)
    pw.solve()
    pw.flush()
}

private fun PrintWriter.solve() {
    val br = System.`in`.bufferedReader()

    // ここにコードを書く
    val (n, r) = br.readLine().split(" ").map { it.toInt() }
    val modint = Modint(1000000007)

    println(modint.combination(n.toLong(), r.toLong()))
}