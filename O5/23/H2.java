class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class H2 {
    Node head;
    H2(){
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
    void inserAtBeg( int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            newnode.next=head;
            head=newnode;
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
        H2 nw=new H2();
        nw.insertAtend(10);
        nw.insertAtend(20);
        nw.insertAtend(30);
        nw.display();
        System.out.println("INsert At Begining");
        nw.inserAtBeg(0);
        nw.inserAtBeg(10);
        nw.inserAtBeg(100);
        nw.display();
}}
