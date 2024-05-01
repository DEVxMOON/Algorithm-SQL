class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var sum: Long = 0
        
        for(i in 1..count){
            sum += price * i
        }
        answer = (sum - money)
        
        return if(sum > money) answer else 0
    }
}