/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1 = l1
        var l2 = l2
        var node: ListNode? = ListNode(0)
        val result = node
        var carry = 0
        while (l1 != null || l2 != null) {
            var sum = carry
            if (l1 != null) {
                sum += l1.`val`
                l1 = l1.next
            }
            if (l2 != null) {
                sum += l2.`val`
                l2 = l2.next
            }
            if (sum >= 10) {
                node!!.next = ListNode(sum - 10)
                carry = 1
            } else {
                node!!.next = ListNode(sum)
                carry = 0
            }
            node = node.next
        }
        if (carry == 1) {
            node!!.next = ListNode(1)
        }
        return result!!.next
    }
}