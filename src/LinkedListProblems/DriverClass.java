package LinkedListProblems;

public class DriverClass {
    public static void main(String[] args) {

        Node head=addAtTheEnd(null,1);
        addAtTheEnd(head,2);
        addAtTheEnd(head,3);
        printTheList(head);
        Node newHead=addAtAnyPosition(0,head,0);
        System.out.println("After adding a new node");
        printTheList(newHead);




    }
    static Node addAtTheEnd(Node head,int data){
        Node n;
        if(head==null){
            n=new Node(data,null);
            return n;

        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;

        }
        temp.next=new Node(data,null);
        return head;
    }
    static void printTheList(Node head){
        Node temp=head;
        while (temp.next!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
    static Node addAtAnyPosition(int position, Node head, int data){
        Node n;
        int cursor=0;
        if(position==0){
            n=new Node(data,null);
            n.next=head;
            head=n;
            return n;
        }
        return new Node(22,null);
    }
}
