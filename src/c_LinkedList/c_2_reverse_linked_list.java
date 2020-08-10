package c_LinkedList;

//2 Implementation of reverse a linked list
public class c_2_reverse_linked_list {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        createList(list);

        /*Node first = list.head;
        Node second = first.next;
        Node third = second.next;
        first.next =null;

        while(second!=null) {
            second.next = first;
            first = second;
            second = third;

            if(third!=null)
            third = third.next;
        }*/

        Node current = list.head;
        Node prev = null;
        Node nextNode= null;

        while (current !=null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        list.head = prev;

        list.printList(list);
    }

    public static void createList(LinkedList list) {
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
        list = LinkedList.insert(list, 5);
        list = LinkedList.insert(list, 6);
        list = LinkedList.insert(list, 7);
        list = LinkedList.insert(list, 8);
    }
}

