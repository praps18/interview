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
        Node nh1=addAtAnyPosition(1,newHead,2);
        System.out.println();
        printTheList(nh1);
        System.out.println("After deleting at desired position");
        Node nd=deleteAtAnyPosition(nh1,0);
        printTheList(nd);
        System.out.println();
        System.out.println("Another delete");
        Node nd1=deleteAtAnyPosition(nd,2);
        printTheList(nd1);
        System.out.println();
        System.out.println("delete at the end");
        Node nd2=deleteAtAnyPosition(nd1,2);
        printTheList(nd2);
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
        n=new Node(data,null);
        Node temp=head;
        while (temp.next!=null){
           temp=temp.next;
           cursor+=1;
            if(cursor==position){
                n.next=temp.next;
                temp.next=n;
                break;
            }
        }
        return  head;
    }
    static Node deleteAtAnyPosition(Node head,int position){
        int cursor=0;
        if(position==0){
            head=head.next;
            return head;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
            cursor+=1;
            if(cursor==position-1){
                temp.next=temp.next.next;
                break;
            }
        }
        return  head;
    }
}
