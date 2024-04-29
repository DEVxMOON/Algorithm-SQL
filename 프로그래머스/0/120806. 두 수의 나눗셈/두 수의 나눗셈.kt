class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Double = num1.toDouble()/num2.toDouble()
        answer *=1000
        return answer.toInt()
    }
}