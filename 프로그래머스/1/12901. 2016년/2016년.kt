class Solution {
    fun solution(a: Int, b: Int): String {
        
        val end2016 = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val dayOfWeek = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        
        var xDay = (0 until a - 1).map {
            end2016[it]
        }.sum() + b

        return dayOfWeek[xDay % 7]
    }
}