class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf(0,0,0)
        
        val numArr = arrayOf(
            arrayOf(1,2,3,4,5),
            arrayOf(2,1,2,3,2,4,2,5),
            arrayOf(3,3,1,1,2,2,4,4,5,5)
        )
        
        for(i in 0 until 3){
            var score = 0
            for(j in 0 until answers.size){
                score +=if(numArr[i][j%numArr[i].size]== answers[j]) 1 else 0
            }
            answer[i] = score
        }
        
        return answer.mapIndexed{idx, i->
            if(i==answer.maxOf{it}) idx+1 else -1
        }.filter{it!=-1}.toIntArray()
    }
}