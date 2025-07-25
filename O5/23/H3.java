class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class H3 {
    Node head;
    H3(){
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
    int c=0;
    int count(){
        Node temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    void atPosition(int data,int pos){
        Node newnode=new Node(data);
        if(head==null || pos==0){
            newnode.next=head;
            head=newnode;
        }else{
            int cou=0;
            Node temp=head;
            while(temp.next!=null && cou<pos-1){
                temp=temp.next;
                cou++;
            }
            newnode.next = temp.next;
            temp.next = newnode;

            //newnode.next=temp;
            //temp=newnode;

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
        H3 nw=new H3();
        System.out.println("INsert At end");
        nw.insertAtend(10);
        nw.insertAtend(20);
        nw.insertAtend(30);
        nw.display();
        System.out.println("INsert At Begining");
        nw.inserAtBeg(0);
        nw.inserAtBeg(10);
        nw.inserAtBeg(100);
        nw.display();
        System.out.println("Insssssssssert at position");
        nw.atPosition(1,0);
        nw.atPosition(11,1);
        nw.atPosition(111, 2);
        nw.display();
}}
