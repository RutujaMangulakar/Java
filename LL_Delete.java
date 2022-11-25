class LL {
    private int size;
    LL(){
        this.size =0;
    }
    Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            return ; 
        }
            newNode.next = head;
            head = newNode;
    }
    
    public void addLast(String data)
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
        currNode.next = new Node(data);
    }
    
    public void print()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        Node currNode = head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+ "-> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    
    public void deleteFirst()
    {
        size--;
            if(head==null)
            {
                System.out.println("List is Empty");
                return;
            }
            head = head.next;
    }
    
    public void deleteLast()
    {
        size--;
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        if(head.next==null)
        {
            head= null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next!=null)
        {
            currNode = currNode.next;
        }
        currNode.next = null;
    }
    
    public static void main(String[] args) {
        LL list = new LL();
        System.out.println(list.size);
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("This");
        list.print();
        System.out.println(list.size);
        list.deleteFirst();
        list.print();
        System.out.println(list.size);
        list.deleteLast();
        list.print();
        System.out.println(list.size);
    }
}