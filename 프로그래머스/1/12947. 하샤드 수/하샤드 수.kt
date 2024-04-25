class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var sum = 0
        var str : String = x.toString()
        val list = mutableListOf<Int>()

        
        for(i in str.indices){
            val s = str[i].toString()
            val num = s.toInt()
            list.add(num)
        }
        
        for(num in list){
            sum += num
        }
        
        return x%sum==0
    }
}

