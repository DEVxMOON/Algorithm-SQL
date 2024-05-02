class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        strings.sort()
        answer += strings.sortedWith(compareBy{ it[n] })
        return answer
    }
}