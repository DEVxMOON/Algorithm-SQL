class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer = 1
        var currM = section[0]
        
        for(i in 0 until section.size){
            if(section[i]<=currM + m - 1) continue 
            else {
                currM = section[i]
                answer ++
            }
        }    
        return answer
    }
}