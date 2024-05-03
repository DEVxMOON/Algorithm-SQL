class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return Array<IntArray>(arr1.size){
            i -> IntArray(arr1[0].size){
                j->arr1[i][j] + arr2[i][j]
            }
        }
    }
}