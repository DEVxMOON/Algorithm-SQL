class Solution {
    fun solution(num: Int): Int {
        var cnt = 0
        var n = num.toLong()

        while (n > 1) {
            if (n % 2 == 0L) {
                n /= 2
            } 
            else {
                n = n * 3 + 1
            }
            cnt++
            
            if (cnt > 500) break;
        }

        return if (cnt < 501) cnt else -1
    }
}