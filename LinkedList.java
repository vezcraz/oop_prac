class LinkedList
{
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node next;
        Node prev;

    }
    public void insertAtEnd(int data)
    {
        Node x = new Node();
        x.data = data;
        x.next = null;
        x.prev = null;
        tail.next = x;
        x.prev = tail;
        tail = x;
        // x.prev
    }
    public void insertAtBeg(int data)
    {
        Node x = new Node();

        x.data = data;
        x.next = head;

        x.prev = null;
        head.prev = x;
        head = x;


    }

    public void insertAtN(int data, int n) //insert element after n nodes
    {
        Node x = new Node();
        x.data = data;
        x.next = null;
        x.prev = null;

        if(n == 0)
            insertAtBeg(data);
        else
        {
            int count = 1;
            Node z = head;

            while(count != n)
            {
                count++;
                z = z.next;
            }
            if(z.next == null)
                insertAtEnd(data);
            else
            {
                x.next = z.next;
                z.next = x;
                x.prev = z;
                x.next.prev = x;
            }

        }

    }

    public void show()
    {
        System.out.println("");
        Node z = head;
        while(z.next != null)
        {
            System.out.println(z.data);
            z = z.next;

        }
        System.out.println(z.data);
    }

    public void delete(int n) //delete nth node
    {
        if(head == null)
            return;
        if(n == 1)
        {
            head = null;
        }
        else
        {
            Node z = head;
            int count = 1;
            while(count != n - 1)
            {
                count++;
                z = z.next;
            }
            if(z.next != null)
                z.next = z.next.next;

        }
    }
}