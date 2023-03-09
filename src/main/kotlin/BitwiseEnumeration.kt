private fun bitwiseEnumeration(lst: List<Int>): List<List<Int>> {
    val keta = lst.size
    val ansList = mutableListOf<List<Int>>()

    for (i in 0 until 1.shl(keta)) {
        val tmpList = mutableListOf<Int>()
        for (j in 0 until keta) {
            if (i.and(1.shl(j)) != 0) {
                tmpList.add(lst[j])
            }
        }
        ansList.add(tmpList)
    }
    return ansList
}