package test.main.java;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import main.java.ListNode;
import main.java.RemoveNthNode;
import org.junit.Test;

public class RemoveNthNodeTest {

  RemoveNthNode removeNthNode = new RemoveNthNode();

  @Test
  public void removeNthFromEnd_checkForNullHead(){
    //given
    ListNode head = null;

    //when
    ListNode result = removeNthNode.removeNthFromEnd(head, 1);

    //then
    assertThat(result, equalTo(null));
  }

  @Test
  public void removeNthFromEnd_checkForRemovedNode(){
    //given
    ListNode head = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);
    ListNode fifth = new ListNode(5);
    head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = null;

    //when
    ListNode result = removeNthNode.removeNthFromEnd(head, 2);

    //then
    assertThat(result.val, equalTo(head.val));
    assertThat(result.next.val, equalTo(second.val));
    assertThat(result.next.next.val, equalTo(third.val));
    assertThat(result.next.next.next.val, equalTo(fifth.val));
  }
}
