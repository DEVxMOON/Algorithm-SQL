class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        
        if(a==b){
            return a.toLong()
        }else if(a>b){
            for(i in b..a){
                answer += i.toLong()
            }
        }else{
            for(i in a..b){
                answer += i.toLong()
            }
        }
        return answer
    }
}