package c_LinkedList;

//7 Find Kth node from the end of linked list
public class c_7_find_Kth_node_from_end_of_linked_list {

    public static void main(String[] args) {
        /*LinkedList list = new LinkedList();
        createList(list);

        int lastNodeFromEnd = 5;

        Node current = list.head;
        Node last = list.head;

        int i=1;
        while(i<lastNodeFromEnd) {
            last = last.next;
            i++;
        }

        while (last.next!=null) {
            current = current.next;
            last = last.next;
        }

        System.out.println("last node = " + current.data);*/

        java.io.Console console = System.console();
        String username = console.readLine("Username: ");
        String password = new String(console.readPassword("Password: "));
    }

    public static void createList(LinkedList list) {
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
        list = LinkedList.insert(list, 5);
        list = LinkedList.insert(list, 6);
        list = LinkedList.insert(list, 7);
    }
}

