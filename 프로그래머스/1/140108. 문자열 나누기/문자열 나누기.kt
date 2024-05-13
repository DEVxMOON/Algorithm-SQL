class Solution {
    fun solution(s: String): Int {                
        
        var start = ""
        var isSameCnt = 0
        var isNotSameCnt = 0
        var resultCnt = 0
        
        for(i in 0 until s.length) {
            
            if(start == "") start = s[i].toString()
                
            if(start == s[i].toString()) isSameCnt++
            
            else isNotSameCnt++                                     
            
            if(isSameCnt == isNotSameCnt) {
                resultCnt++
                start = ""
                isSameCnt = 0
                isNotSameCnt = 0
            }
        }
        
        if(start != "") resultCnt++
        
        return resultCnt
    }
}