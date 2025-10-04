import java.util.Random;

public class ThingList {

    private class Node {
        Thing data;
        Node next;
        Node(Thing t) { data = t; }
    }

    private Node head;

    public void addThing(Thing t) {
        Node n = new Node(t);
        n.next = head;
        head = n;
    }

    public void printAll() {
        for (Node curr = head; curr != null; curr = curr.next){
            curr.data.display();
        }
        System.out.println("done");

        System.out.flush();
    }

    public void moveAll(Random rand) {
        for (Node curr = head; curr != null; curr = curr.next){
            curr.data.move();
        }
    }
}
