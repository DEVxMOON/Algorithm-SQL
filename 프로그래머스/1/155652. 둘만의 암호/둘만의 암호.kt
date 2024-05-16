class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        return s.map{c->
            var C = c
            var t = index
            while(t >0 ){
                C = C.inc()
                if(C>'z') C = 'a'
                if(!skip.contains(C)) t--
            }
            C
        }.joinToString("")
    }
}