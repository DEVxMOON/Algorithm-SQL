import kotlin.math.sqrt

class Solution {
    fun cntDriver(n:Int):Int{
        var cnt = 0
        val tmp = sqrt(n.toDouble()).toInt()
        
        for(i in 1..tmp){
            if(n %i ==0){
                if(i*i == n) cnt++ else cnt+=2
            }
        }
        return cnt
    }
    
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer =0
        var overPow = mutableListOf<Int>()
        
        var countList = (1..number).map{
            cntDriver(it)
        }.toList()
        
        countList.forEach{cnt ->
            if(cnt > limit) overPow.add(power) else overPow.add(cnt)
        }
        
        for(i in overPow){
            answer+=i
        }  
        return answer
    }
}