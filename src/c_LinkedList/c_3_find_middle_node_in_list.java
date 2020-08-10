package c_LinkedList;

//3 Finding a middle node in list
public class c_3_find_middle_node_in_list {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        createList(list);

        Node slowPointer = list.head;
        Node fastPointer = list.head;

        while (fastPointer != null & fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        System.out.println("middle node = " + slowPointer.data);
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

