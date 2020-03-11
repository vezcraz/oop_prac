class Runner 
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.insertAtEnd(50);
		l.insertAtEnd(100);
		l.insertAtEnd(250);

		l.show();

		l.insertAtBeg(30);
		l.insertAtN(40,4);
		l.delete(3);
		l.show();
	}
}