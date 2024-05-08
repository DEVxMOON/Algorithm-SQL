class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.toMutableList().sortedDescending().chunked(m).forEach{
            if(it.size==m){
                answer += (it.minOrNull()!! * m)
            }
        }
        return answer
    }
}