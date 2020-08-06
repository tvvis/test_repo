package test;

public class list_test {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(7);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        linkedList.addAtIndex(3,0);
        linkedList.deleteAtIndex(2);
        linkedList.addAtHead(6);
        linkedList.addAtTail(4);
        System.out.println(linkedList.get(4));


    }
}
class MyLinkedList {
    class Node {
        private int val;
        private Node next;
        private Node(int x) {
            this.val = x;
        }
    }

    private Node dummyHead;
    int size;
    public MyLinkedList(){
        this.dummyHead=new Node(-1);
        size=0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node head=dummyHead.next;
        if(index<0||index>=size)
            return -1;
        else
            for(int i=0;i<index;i++)
                head=head.next;
        return head.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node nHead=new Node(val);
        nHead.next=dummyHead.next;
        this.dummyHead.next=nHead;
        size++;
    }
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node head=dummyHead.next;
        Node nTail=new Node(val);
        for (int i=0;i<size-1;i++){
            head=head.next;
        }
        head.next=nTail;
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node head=this.dummyHead.next;
        Node nNode=new Node(val);
        Node prev=new Node(-1);
        if(index<=0){
            nNode.next=head;
            head=nNode;
            size++;
        }
        else if(index>=size){
            return;
        }
        for (int i=0;i<index;i++){
            prev=head;
            head=head.next;
        }
        prev.next=nNode;
        nNode.next=head;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node head=this.dummyHead.next;
        Node prev=new Node(-1);
        if(index<0||index>=size){
            return;
        }
        else {
            for (int i=0;i<index;i++){
                prev=head;
                head=head.next;
            }
            prev.next=head.next;
        }

    }
}

//class MyLinkedList {
//    private int val;
//    public MyLinkedList next;
//
//    /**
//     * Initialize your data structure here.
//     */
//    public MyLinkedList(int x) {
//        this.val = x;
//        this.next = null;
//    }
//
//    /**
//     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
//     */
//    public int get(int index) {
//        MyLinkedList linklist = this;
//        for(int i=0;i<index;i++){
//            if(linklist.next==null)
//                return -1;
//            else
//                linklist=linklist.next;
//        }
//        return linklist.val;
//    }
//
//    /**
//     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
//     */
//    public void addAtHead(int val) {
//        MyLinkedList head = new MyLinkedList(val);
//        MyLinkedList list =this;
//        head.next = this;
//        list=head;
//        list.next=head.next;
//    }
//
//    /** Append a node of value val to the last element of the linked list. */
//    public void addAtTail(int val) {
//        MyLinkedList tail=new MyLinkedList(val);
//        MyLinkedList list=this;
//        while(list.next!=null){
//            list=list.next;
//        }
//        list.next=tail;
//    }
//
//    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
//    public void addAtIndex(int index, int val) {
//        MyLinkedList node=new MyLinkedList(val);
//        MyLinkedList list=this;
//        if(index<=0){
//            this.addAtHead(val);
//        }
//        for(int i=0;i<index-1;i++){
//            if(list==null)
//                return;
//            else
//                list=list.next;
//        }
//        node.next=list.next;
//        list.next=node;
//    }
//
//    /** Delete the index-th node in the linked list, if the index is valid. */
//    public MyLinkedList deleteAtIndex(int index) {
//        MyLinkedList list=this;
//        MyLinkedList prev=this;
//        if(index<0){
//            return list;
//        }
//        else if(index==0){
//            return list.next;
//        }
//        for(int i=0;i<index;i++){
//            if(list==null)
//                return list;
//            else
//                prev=list;
//                list=list.next;
//        }
//        prev.next=list.next;
//        return this;
//    }
//}