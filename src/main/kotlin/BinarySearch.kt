class BinarySearch {
    // 配列にxが含まれていればtrueをそうでなければfalseを返す
    fun binarySearch(lst: List<Int>, x: Int): Boolean {
        var l = 0
        var r = lst.size - 1

        while (l <= r) {
            val mid = (l + r) / 2
            if (lst[mid] == x) return true
            else if (lst[mid] > x) r = mid - 1
            else l = mid + 1
        }
        return false
    }

    // 配列の中でx以上になる最初のindexを返す
    fun lowerBound(lst: List<Int>, x: Int): Int {
        var ng = -1
        var ok = lst.size

        while (ok - ng > 1) {
            val mid = (ng + ok) / 2
            if (lst[mid] >= x) ok = mid
            else ng = mid
        }
        return ok
    }
}