import kotlin.math.min

class Solution {
    fun solution(X: String, Y: String): String {
        var answer = ""

        for(c in (9 downTo 0).toList().map{it.toString()}){
            answer += c.repeat(min(X.count{it.toString()==c}, Y.count{it.toString()==c}))
        }
        
        if(answer.isEmpty()) return "-1"
        if(answer.toList().distinct() == listOf('0')) return "0"

        return answer
    }
}