
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class addlast {

    private static class Node {
        int data;
        Node next;
    }

    private static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int data) {
            Node temp = new Node();
            temp.data = data;
            temp.next = null;
            // if(head == null)
            // {
            // head = tail = temp;
            // size++;
            // }
            // else
            // {
            // tail.next = temp;
            // tail = temp;
            // size++;
            // }

            tail.next = temp;
            tail = temp;
            size++;

        }

        int size() {
            return size;
        }

        void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.println(temp.data + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("display")) {
                list.display();
            }

            str = br.readLine();
        }

    }
}