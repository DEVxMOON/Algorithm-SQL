class Solution {
    fun solution(n: Int) = n.toString().map {
            it.toInt() - '0'.toInt()
        }.sum()
        
}