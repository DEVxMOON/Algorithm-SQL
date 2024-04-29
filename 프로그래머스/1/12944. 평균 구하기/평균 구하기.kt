class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        
        arr.forEach{a ->
            answer +=a
        }
        
        answer /= arr.size
        
        
        return answer
    }
}