class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = mutableListOf<Int>()
        
        arr.forEach { a ->
            if (a % divisor == 0) {
                answer.add(a)
            }
        }
        
        if (answer.isEmpty()) {
            return intArrayOf(-1)
        }
        
        answer.sort()
        
        return answer.toIntArray()
    }
}
