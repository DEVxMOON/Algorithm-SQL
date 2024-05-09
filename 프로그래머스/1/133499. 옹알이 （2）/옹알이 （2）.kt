class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val p1 = "aya|ye|woo|ma".toRegex()  //정규식
        val p2 = "ayaaya|yeye|woowoo|mama".toRegex()
        answer = babbling.map { it.replace(p2, "*") }.map { it.replace(p1, "") }.filter { it == "" }.size
        return answer
    }
}