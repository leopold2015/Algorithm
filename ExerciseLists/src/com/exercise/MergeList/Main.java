package com.exercise.MergeList;

/**
 * Created by Joe on 18/7/11.
 */
public class Main {
    public static Node mergeList(Node node1,Node node2){
        Node node = new Node(0);
        node.next = null;

        Node pnode = node1;
        Node qnode = node2;
        Node rnode = node;
        while(pnode!=null && qnode!= null){
            if(pnode.value <= qnode.value){
                rnode.next = pnode;
                rnode = rnode.next;
                pnode = pnode.next;
            }else{
                rnode.next = qnode;
                rnode = rnode.next;
                qnode = qnode.next;
            }
        }
        while(pnode != null){
            rnode.next = pnode;
            rnode = rnode.next;
            pnode = pnode.next;
        }
        while(qnode != null){
            rnode.next = qnode;
            rnode = rnode.next;
            qnode = qnode.next;
        }
        return node;
    }

    public static void main(String args[]){

        Node node11 = new Node(1);
        Node node12 = new Node(2);
        Node node13 = new Node(4);


        node11.next = node12;
        node12.next = node13;
        node13.next = null;

        Node node21 = new Node(1);
        Node node22 = new Node(3);
        Node node23 = new Node(4);

        node21.next = node22;
        node22.next = node23;
        node23.next = null;

        Node node =mergeList(node11,node21);
        while(node.next !=null){
            node = node.next;
            System.out.print(node.value+" ");

        }


    }
}

class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
}
