class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for(i in 1 .. food.size-1){
            println(food[i]/2)
            answer += i.toString().repeat(food[i]/2)
            
        }
        return answer + "0" + answer.reversed()
    }
}