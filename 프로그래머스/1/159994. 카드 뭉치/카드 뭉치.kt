class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        
        var idx1 = 0
        var idx2 = 0
        goal.forEach { 
            if(idx1 < cards1.size && cards1[idx1] == it){
                idx1++
            } else if(idx2 < cards2.size && cards2[idx2] == it){
                idx2++
            } else {
                return "No"
            }
        }
        
        return answer
    }
}