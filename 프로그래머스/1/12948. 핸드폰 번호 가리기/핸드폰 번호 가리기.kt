class Solution {
    fun solution(phone_number: String): String {
        return "*".repeat(phone_number.length - 4) + phone_number.takeLast(4)
    }
}