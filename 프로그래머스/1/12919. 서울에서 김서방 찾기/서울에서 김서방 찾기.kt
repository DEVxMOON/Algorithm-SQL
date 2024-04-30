class Solution {
    fun solution(seoul: Array<String>): String {   
        seoul.forEachIndexed{i, str->
            if(str =="Kim"){
                return "김서방은 ${i}에 있다"
            }
        }
        return ""
    }
}