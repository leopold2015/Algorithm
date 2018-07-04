package com.exercise.addTwoNumbers;


/**
 * Created by Joe on 18/7/4.
 */
public class SumOfTwoNums {
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1,q = l2,curr = dummyHead;
        int carry = 0;
        while(p!=null || q!= null){
            int x = (p!=null) ? p.value : 0;
            int y = (q!=null) ? q.value : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(0),l2 = new ListNode(0);

        ListNode node1_1 = new ListNode(2);
        ListNode node1_2 = new ListNode(4);
        ListNode node1_3 = new ListNode(3);

        ListNode node2_1 = new ListNode(5);
        ListNode node2_2 = new ListNode(6);
        ListNode node2_3 = new ListNode(4);

        l1.next = node1_1;
        node1_1.next = node1_2;
        node1_2.next = node1_3;
        node1_3.next = null;

        l2.next = node2_1;
        node2_1.next = node2_2;
        node2_2.next = node2_3;
        node2_3.next = null;


        ListNode res = addTwoNumbers(l1,l2);

        while(res.next!=null){
            res = res.next;
            System.out.println(res.value);
        }


    }
}
class ListNode{
    public int value;
    public ListNode next;
    ListNode(int value){
        this.value = value;
    }
}
