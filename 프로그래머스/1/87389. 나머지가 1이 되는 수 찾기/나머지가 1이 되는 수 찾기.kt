class Solution {
    fun solution(n: Int): Int {
        for(i in 1..n){
            if(n%i==1){
                return i
            }
        }
        return -1
    }
}