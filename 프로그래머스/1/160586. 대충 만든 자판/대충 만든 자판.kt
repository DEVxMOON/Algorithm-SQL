import kotlin.math.min
class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        
        var minPress = Array(26, {it->200})
        for(km in keymap){
            for(i in 0 until km.length){
                val k = km[i]
                minPress[k.code - 'A'.code] = min(minPress[k.code - 'A'.code] , i+1)
            }
        }
        
        var answer : IntArray = intArrayOf()
        for(t in targets){
            var pressSum = 0
            for(i in 0 until t.length){
                val k=t[i]
                
                if(minPress[k.code-'A'.code] == 200){
                    pressSum = -1
                    break
                }
                pressSum += minPress[k.code-'A'.code]
            }
            answer+=pressSum
        }
        
        return answer
    }
}