package linkListEx;

public class ReverseAltNodeAddEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkList lList=new LinkList();
		
		createList(lList);
		///////linklist created
		lList.displayLinkList();
		System.out.println("**********************");
		//lList.reverseAltNodeAndAddAtEnd();
		lList.reverseAltNodeAndAddAtEndEff();
		lList.displayLinkList();

	}

	
	private static void createList(LinkList lList)
	{

		lList.insertFirst(9);
		lList.insertFirst(8);
		lList.insertFirst(7);
		lList.insertFirst(6);
		lList.insertFirst(5);
		lList.insertFirst(4);
		lList.insertFirst(3);
		lList.insertFirst(2);
		lList.insertFirst(1);
			
		
	}
}
