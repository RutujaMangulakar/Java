class LL{
    private int size =0;
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList()
    {
        if(head==null)
        {
            return;
        }
        Node currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void reverseIterate()
    {
        Node prevNode = head;
        Node currNode = head.next;
        if(head ==null || head.next==null)
        {
            return;
        }
        Node nextNode ;
        while(currNode!=null)
        {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode=nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRec(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node newNode = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String args[])
    {
        LL list = new LL();
        list.addFirst(9);
        list.addLast(1);
        list.addFirst(2);
        list.addLast(5);
        list.printList();
        // list.reverseIterate();
        // list.printList();
        list.head = list.reverseRec(list.head);
        list.printList();
    }
}