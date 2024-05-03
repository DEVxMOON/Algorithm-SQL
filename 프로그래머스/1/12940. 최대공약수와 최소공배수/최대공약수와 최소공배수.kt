class Solution {
    fun solution(n: Int, m: Int): IntArray {        
        return intArrayOf(gcd(n,m), ((n*m)/gcd(n,m)))
    }
    
    fun gcd(n:Int, m:Int):Int{
        if (m > n) {
            return if (n == 0) m else gcd(n, m%n)
        } else {
            return if (m == 0) n else gcd(n%m, m)
        }
    }
}