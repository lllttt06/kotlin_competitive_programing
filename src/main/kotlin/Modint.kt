class Modint(val MOD: Long = 1000000007) {
    // a**bをMODで割ったあまりを求める
    fun power(a: Long, b: Long): Long {
        var ans = 1L
        var amari = a
        var i = 0

        while (1L.shl(i) <= b) {
            if (1L.shl(i) and b == 1L.shl(i)) ans = (ans * amari) % MOD
            amari = (amari * amari) % MOD
            i++
        }
        return ans
    }

    // aの逆元を求める
    fun inverse(a: Long): Long {
        return power(a, (MOD - 2)) % MOD
    }

    // aの階乗を求める
    fun factorial(a: Long): Long {
        var ans = 1L
        for (i in 1..a) ans = (ans * i) % MOD
        return ans
    }

    // nCrを求める
    fun combination(n: Long, r: Long): Long {
        val fractrialN = factorial(n)
        val fractrialR = factorial(r)
        val fractrialNminusR = factorial(n - r)
        val inversedFractrialR = inverse(fractrialR)
        val inversedFractrialNminusR = inverse(fractrialNminusR)
        return (((fractrialN * inversedFractrialR) % MOD) * inversedFractrialNminusR) % MOD
    }
}