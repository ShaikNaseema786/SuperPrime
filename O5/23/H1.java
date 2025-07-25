class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class H1 {
    Node head;
    H1(){
        this.head=null;
    }
    void insertAtend(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void display(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }else{
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ->");
                temp=temp.next;
                
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        H1 nw=new H1();
        nw.insertAtend(10);
        nw.insertAtend(20);
        nw.insertAtend(30);
        nw.display();
    }
}
