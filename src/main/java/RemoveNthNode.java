/*
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.

Note:
Given n will always be valid.
Try to do this in one pass.

 */

package main.java;

public class RemoveNthNode {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null)
      return null;

    ListNode toDelete = head;
    ListNode end = head;

    while (n > 1){
      end = end.next;
      n--;
    }

    while (end.next != null){
      end = end.next;
      toDelete = toDelete.next;
    }
     if (toDelete == head)
       return head.next;


    ListNode prev = head;
    while(prev.next != toDelete){
      prev = prev.next;
    }
    prev.next = toDelete.next;

    return head;
  }

}
