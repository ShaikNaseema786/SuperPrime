class Com {
    String name;
    Com next;

    Com(String name) {
        this.name = name;
        this.next = null;
    }
}

public class E4 {
    public Com head;

    E4() {
        head = null;
    }

    public void addCom(String name) {
        Com newCom = new Com(name);
        if (head == null) {
            head = newCom;
        } else {
            Com temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newCom;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("In train there is no compartment");
            return;  // exit display method
        } else {
            System.out.print("The compartments are: ");
            Com temp = head;
            while (temp != null) {
                System.out.print(temp.name + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        E4 train = new E4();

        train.addCom("Engine");
        train.addCom("FirstClass");
        train.addCom("Sleeper");
        train.addCom("Dining");

        train.display();
    }
}
