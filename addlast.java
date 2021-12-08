
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
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int size() {
            return size;
        }

        void display() {
            if (size == 0) {
                return;
            }
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.println(temp.data + "\t");
            }
            System.out.println();
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty"); 
                return -1;
            }
            return tail.data;
        }

        public int getAt(int idx) {
            Node temp = head;
            if(size == 0)
            {
                System.out.println("List is empty");
                return -1;
            }
            else if(idx < 0 || idx >= size)
            {
                System.out.println("Invalid arguments");
                return -1;
            }
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();
        Scanner scn = new Scanner(System.in);

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("getFirst")) {
                list.getFirst();
            } else if (str.startsWith("getAt")) {
                list.getLast();
            } else if (str.startsWith("getLast")) {
                int n = scn.nextInt();
                list.getAt(n);
            }

            str = br.readLine();
            scn.close();
        }

    }
}