class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        
        val duplicate : MutableList<String> = mutableListOf()
        
        for(i in 0 until s.toList().size)
        {
            if(!duplicate.contains(s[i].toString()))
            {
                answer = answer.plus(-1)
                duplicate.add(s[i].toString())
            }
            else
            {
                answer = answer.plus(i-s.toList().slice(0 until i).lastIndexOf(s[i]))
            }
        }
        return answer
    }
}