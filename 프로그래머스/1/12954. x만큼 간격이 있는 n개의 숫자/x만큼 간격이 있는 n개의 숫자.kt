class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = mutableListOf<Long>()
        
        var num :Long = 0
        
        for(i in 0 until n){
            num+=x.toLong()
            answer.add(num)
        }      
        
        return answer.toLongArray()
    }
}