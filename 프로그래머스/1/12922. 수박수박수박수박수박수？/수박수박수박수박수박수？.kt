class Solution {
    fun solution(n: Int): String {
        var answer = ""
        var cnt = 0
        
        for(i in 0 until n)
        {
            if(i%2==0){
                answer+="수"
            }
            else{
                 answer+="박"
            }
        }
        return answer
    }
}