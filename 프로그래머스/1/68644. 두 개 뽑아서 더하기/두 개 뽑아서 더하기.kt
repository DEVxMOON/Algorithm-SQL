class Solution {
    fun solution(numbers: IntArray): IntArray {
        var set = mutableSetOf<Int>()
        
        (0 until numbers.size - 1).forEach { index1 ->
            (index1 + 1 until numbers.size).forEach { index2 ->
                set.add(numbers[index1] + numbers[index2])
            }
        }

        return set.sorted().toIntArray()
    }
}