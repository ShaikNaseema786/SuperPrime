// Node class representing a Train Compartment
class Compartment {
    String name;       // Compartment name (e.g., "A", "B", "Sleeper")
    Compartment next;

    public Compartment(String name) {
        this.name = name;
        this.next = null;
    }
}

// Linked List class representing the Train
public class Train {
    private Compartment head;

    public Train() {
        this.head = null;
    }

    // Add compartment at the end
    public void addCompartment(String name) {
        Compartment newCompartment = new Compartment(name);

        if (head == null) {
            head = newCompartment;
        } else {
            Compartment temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newCompartment;
        }
        System.out.println("Compartment '" + name + "' added.");
    }

    // Display all compartments
    public void displayTrain() {
        if (head == null) {
            System.out.println("The train has no compartments.");
            return;
        }

        System.out.print("Train compartments: ");
        Compartment temp = head;
        while (temp != null) {
            System.out.print("'" + temp.name + "' -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove a compartment by name
    public void removeCompartment(String name) {
        if (head == null) {
            System.out.println("Train is empty.");
            return;
        }

        if (head.name.equals(name)) {
            head = head.next;
            System.out.println("Compartment '" + name + "' removed.");
            return;
        }

        Compartment temp = head;
        while (temp.next != null && !temp.next.name.equals(name)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Compartment '" + name + "' not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Compartment '" + name + "' removed.");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Train train = new Train();

        train.addCompartment("Engine");
        train.addCompartment("FirstClass");
        train.addCompartment("Sleeper");
        train.addCompartment("Dining");

        train.displayTrain();

        train.removeCompartment("Sleeper");
        train.displayTrain();

        train.removeCompartment("Cargo");  // Trying to remove a non-existent compartment
    }
}
