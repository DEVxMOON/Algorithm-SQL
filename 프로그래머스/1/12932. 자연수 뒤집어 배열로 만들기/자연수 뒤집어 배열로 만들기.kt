class Solution {
    fun solution(n: Long): IntArray {
        val answer = mutableListOf<Int>()
        
        val str = n.toString()

        for (i in str.length - 1 downTo 0) {
            val num = str[i] - '0'
            answer.add(num)
        }
        
        return answer.toIntArray()
    }
}