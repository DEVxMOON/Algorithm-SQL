class Solution {
    fun solution(arr: IntArray): IntArray = if (arr.size == 1) intArrayOf(-1)
    else arr.filter {  it != arr.minOrNull() }.toIntArray()
}