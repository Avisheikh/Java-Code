import java.util.*;

public class SLList
{
   public Node first,last;
   public void insertBeg()
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.print("Enter Data Item to Insert:");
	   int element=scan.nextInt();
	   Node node=new Node();
	   node.info=element;
	   if(first==null) //if there is no node, firstNode=lastNode
	   {
		   first=node;
		   last=node;
		   node.next=null;
	   }
	   else
	   {
		   node.next=first; //next of new node must point existing first node
		   first=node; //Now,update the first node
	   }

   }
   public void insertEnd()
   {
	       Scanner scan=new Scanner(System.in);
	   	   System.out.print("Enter Data Item to Insert:");
	   	   int element=scan.nextInt();
	   	   Node node=new Node();
	   	   node.info=element;
	   	   if(first==null) //if there is no node, firstNode=lastNode
	   	   {
	   		   first=node;
	   		   last=node;
	   		   node.next=null;
	   	   }
	   	   else
	   	   {
	   		   last.next=node; //next of existing last node-->new one
	   		   last=node; //update last node
	   		   node.next=null; //last node must point null
	   	   }

   }
   public void insertAtSpecificPosition()
   {
	           Scanner scan=new Scanner(System.in);
	   	   	   System.out.print("Enter Data Item to Insert:");
	   	   	   int element=scan.nextInt();
	   	   	   Node node=new Node();
	   	   	   node.info=element;
	   	   	   System.out.print("Which Position You Want to Insert?");
	   	   	   int pos=scan.nextInt();
	   	   	   if(first==null)  //if there is no node, firstNode=lastNode
	   	   	   {
				   first=node;
				   last=node;
				   node.next=null;
			   }
			   else
			   {
				   Node temp=first; //assign temporary node as first node
	   	   	   	   for(int i=1;i<pos-1;i++) //go up-to requested position
	   	   	   	   {
	                    temp=temp.next; 
	   			   }
	   	   	   	   node.next=temp.next; //insert the node at given position
  	                   temp.next=node; //update node
			   }


   }
   public void deleteFirst()
   {
	   if(first==null)
	   {
	      System.out.println("Linked List is Empty");
	   }
	   else if(first==last) //if only one node, first=last=null
	   {
	      first=null;
	      last=null;
	   }
	   else
	   {
	      first=first.next; //assign next of first as first
	   }
   }
   public void deleteEnd()
   {
	   if(first==null)  //if only one node, first=last=null
	   	   {
	   	      System.out.println("Linked List is Empty");
	   	   }
	   	   else if(first==last) //if only one node, first=last=null
	   	   {
	   	      first=null;
	   	      last=null;	   	     
	   	   }
	   	   else
	   	   {
	   	      Node temp=new Node();
	   	      temp=first;
	   	      while(temp.next !=last) //searching last node
	   	      {
			     temp=temp.next;
			  }
			  temp.next=null; //assign of next of temporary node as null
			  last=temp; //update
			  System.out.println("Last Node is Removed ");
	       }
   }
   public void deleteAtSpecificPosition()
   {
	   if(first==null)
	   	   {
	   	      System.out.println("Linked List is Empty");
	   	   }
	   	   else if(first==last) //if only one node, first=last=null
	   	   {
	   	      first=null;
	   	      last=null;
	   	     
	   	   }
	   	   else
	   	   {
	   	      Scanner scan=new Scanner(System.in);
	   	      System.out.print("Which Position You Want to Delete?:");
	   	   	  int pos=scan.nextInt();
	   	   	  Node temp=first;
			  for(int i=1;i<pos-1;i++) //determine the required position
			  	{
			  		temp=temp.next;
				}
				Node tpr=new Node(); //create extra node & bypass the node to be deleted
				tpr=temp.next;
				temp.next=tpr.next;
				System.out.println("Node is Removed ");
	       }
   }
   public void searchItem()
   {
	   if(first==null)
	   	   	   {
	   	   	      System.out.println("Linked List is Empty");
	   	   	   }

	   	   	   else
	   	   	   {
	   	   	      Scanner scan=new Scanner(System.in);
	   	   	      System.out.print("Which Element You Want to Search?:");
	   	   	   	  int element=scan.nextInt();
	   	   	   	  Node temp=first;
	   	   	   	  int position=0;
	   			  while(temp!=null)
	   			  	{
	   			  		if(temp.info==element)
	   			  		{
						   System.out.println("Element Found at position="+position);

						   break;
						}
	   			  		temp=temp.next;
	   			  		position=position+1;
	   				}
	   				if(temp==null)
	   				{
					   System.out.println(element+ " Not Found on the Linked List");
					}
	       }
   }

public void displayAllItems()
   {
	   if(first==null)
	   	   	   {
	   	   	      System.out.println("Linked List is Empty");
	   	   	   }

	   	   	   else
	   	   	   {

	   	   	   	  Node temp=first;
                  System.out.println("Elements in Linked List Are:");
                  System.out.println("===========================================================");
	   			  while(temp!=null)
	   			  	{

	   			  		System.out.print(temp.info + "  ");
	   			  		temp=temp.next;

	   				}
	   				System.out.println("");

	       }
   }

   public static void main(String args[])
   {
	   int choice;
	   Scanner scan=new Scanner(System.in);
	   SLList sllist=new SLList();



	       while(true)

	       {
			        System.out.println("===========================================================");
			        System.out.println("Press 1 for Insert at Begining");
			   	    System.out.println("Press 2 for Insert at End");
			   	    System.out.println("Press 3 for Insert at Specific Position in List");
			   	     System.out.println("Press 4 for Delete First Node");
			   	      System.out.println("Press 5 for Delete Last Node");
			   	       System.out.println("Press 6 for Delete Specific Node");
			   	       System.out.println("Press 7 for Searching Specific Item in Linked List");
			   	       System.out.println("Press 8 for Displaying all Items in Linked List");
	       System.out.println("Enter 9 for Exit");
	       System.out.println("===========================================================");

			   System.out.print("Enter Your Choice:");
	           choice=scan.nextInt();
	           switch(choice)
	           {

			      case 1:
			          sllist.insertBeg();
			          break;
			      case 2:
			          sllist.insertEnd();
			          break;
			       case 3:
			          sllist.insertAtSpecificPosition();
			          break;
			       case 4:
			          sllist.deleteFirst();
			          break;
			        case 5:
			            sllist.deleteEnd();
			        break;
			        case 6:
			           sllist.deleteAtSpecificPosition();
			           break;
			        case 7:
			            sllist.searchItem();
			            break;
			        case 8:
			            sllist.displayAllItems();
			            break;
			      case 9:
			         System.exit(0);
			         break;
			        default:
			        System.out.println("Wrong Option! Enter Correct Choice!!!");

			   }
		   }

   }

}