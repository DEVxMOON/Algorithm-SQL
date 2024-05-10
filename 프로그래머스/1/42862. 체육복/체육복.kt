class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        
        lost.sort()
        reserve.sort()
        
        val lostSet = lost.toMutableSet()
        val reserveSet = reserve.toMutableSet()
        
        reserve.filter{
            lostSet.contains(it)
        }.forEach{
            reserveSet.remove(it)
            lostSet.remove(it)
        }
        
        reserveSet.forEach{
            when{
                lostSet.contains(it-1) -> lostSet.remove(it-1)
                lostSet.contains(it+1) -> lostSet.remove(it+1)
            }
        }
        
        return n-lostSet.count()
    }
}