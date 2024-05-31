public class Operation_On_SingleLinkedList {
   static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class singleLinkedList {
        Node head;

        singleLinkedList() {
            this.head = null;
        }

        public void insertAtGivenPosition(int data, int pos) {
            if (pos < 1) {
                System.out.println("Position must be a positive integer");
            }

            Node newNode = new Node(data);

            if (pos == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node current = head;
            int count = 1;

            while (current != null && count < pos - 1) {
                current = current.next;
                count++;
            }

            if (current == null) {
                System.out.println("Position out of bounds");
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
        public void deleteAtPosition(int pos) {
            if (head == null) {
                System.out.println("List is empty");
            }
            if (pos < 1) {
                System.out.println("Position must be a positive integer");
            }
            if (pos == 1) {
                head = head.next;
                return;
            }
            Node prev = null;
            Node current = head;
            int count = 1;
            while (current != null && count < pos) {
                prev = current;
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Position out of bounds");
            }
            prev.next = current.next;
        }
        public void deleteAfterNode(Node prevNode) {
            if (prevNode == null || prevNode.next == null) {
                System.out.println("Previous node is null or there is no node after the given node");
            }
            prevNode.next = prevNode.next.next;
        }
        public boolean searchNode(int key) {
            Node current = head;
            while (current != null) {
                if (current.data == key) {
                    return true; // Found the key
                }
                current = current.next;
            }
            return false; // Key not found
        }
    }
    static class Stack {
        private Node top;

        Stack() {
            this.top = null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

        public int pop() {
            if (top == null) {
                System.out.println("Stack is empty");
            }
            int poppedValue = top.data;
            top = top.next;
            return poppedValue;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack is empty");
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {
        singleLinkedList list = new singleLinkedList();

        // Insert at various positions
        list.insertAtGivenPosition(4, 1); // Insert 4 at position 1
        list.insertAtGivenPosition(2, 2); // Insert 2 at position 2
        list.insertAtGivenPosition(3, 3); // Insert 3 at position 3
        list.insertAtGivenPosition(7, 4); // Insert 7 at position 4
        list.insertAtGivenPosition(9, 5); // Insert 9 at position 5
        list.insertAtGivenPosition(12, 6); // Insert 12 at position 6
        list.insertAtGivenPosition(33, 7); // Insert 33 at position 7
        list.insertAtGivenPosition(76, 8); // Insert 76 at position 8

        // Print the list
        System.out.println("Linked List after insertion at various positions:");
        list.printList();

        // Delete at a given position
        list.deleteAtPosition(2);
        System.out.println("\nLinked List after deleting at position 2:");
        list.printList();
        // delete after node
        list.deleteAfterNode(list.head );
        list.deleteAfterNode(list.head.next );
        list.deleteAfterNode(list.head.next.next);
        //list.deleteAfterNode(list.(12));
        System.out.println("\nLinked List after deleting node after node :");
        list.printList();

        // search node
        System.out.println("\n node with data value 8 exist?"+ list.searchNode( 8));
        System.out.println("\n node with data value 7 exist?"+ list.searchNode( 7));

        // Create a stack and perform operations
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(16);
        stack.push(25);
        stack.push(40);

        // Peek and pop elements from the stack
        System.out.println("\nPeek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }


    }

