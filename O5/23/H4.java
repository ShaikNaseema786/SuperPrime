class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class H4{
    Node head;
    H4(){
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
    void deleteAtbeg(){
        if(head==null){
            System.out.println("Delition is not possible becouse list is empty");
            return;
        }else{
            Node temp=head;
            head=temp.next;
            temp.next=null;

        }
    }
    void deleteAtend(){
        if(head==null){
            System.out.println("Delition is not possible becouse list is empty");
            return;
        }if (head.next == null) {
        head = null;
        return;
    }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;

        }
    }
    void deleteAtpos(int pos) {
    if (head == null) {
        System.out.println("Deletion is not possible because the list is empty");
        return;
    }

    if (pos == 0) {
        Node temp = head;
        head = head.next;
        temp.next = null;
        return;
    }

    Node temp = head;
    int count = 0;

    while (temp != null && count < pos - 1) {
        temp = temp.next;
        count++;
    }

    if (temp == null || temp.next == null) {
        System.out.println("Position out of range");
        return;
    }

    Node nodeToDelete = temp.next;
    temp.next = nodeToDelete.next;
    nodeToDelete.next = null;
}
    void search(int el){
        boolean found=false;
        if(head==null){
            System.out.println("There is no element to search");
        }if(head.next==null){
             if(head.data==el){
                found=true;
                return;
             }
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==el){
                found = true;
            }
            temp=temp.next;
        }
        if(!found){
            System.out.println("Not found");
        }else{
            System.out.println("Found  ");
        }
    }
    void reverse(){
        if(head==null){
            System.out.println("Thre is no element to revese");
            return;
        }
        if(head.next==null){
            System.out.println("There is only one element:"+head.data);
        }
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
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
        H4 nw=new H4();
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
        System.out.println("Delete At beging");
        nw.deleteAtbeg();
        nw.deleteAtbeg();
        nw.deleteAtbeg();
        nw.display();
        System.out.println("Detete at end");
        nw.deleteAtend();
        nw.deleteAtend();
        nw.display();
        System.out.println("Delete at position ");
        nw.deleteAtpos(2);
        nw.display();
        System.out.println("No of Nodes are theres "+nw.count());
        System.out.println("The search element found or not :");
        nw.search(10);

}}
