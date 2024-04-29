class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        for(a in 0 .. n){
         if(a%2==0)
            {
                answer +=a   
            }
        }
        return answer
    }
}