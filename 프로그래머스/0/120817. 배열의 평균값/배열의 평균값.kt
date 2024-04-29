class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        numbers.forEach{a->
            answer += a
        }
        answer /= numbers.size
        return answer
    }
}