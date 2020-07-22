package ds1;

public class Linked {
	

	    public class Node{
	        int data;
	        Node next;
	            public Node(int data){
	                this.data=data;
	                this.next=null;
	            }
	    }

	    public Node head=null;

	    public void insbeg(int data){
	        Node temp=new Node(data);
	        if(head==null){
	            head=temp;
	        }else{

	            temp.next=head;
	            head=temp;
	        }
	        System.out.println(temp.data);
	    }

	    public void delbeg(){
	        if(head==null){
	            System.out.println("list is empty");
	        }else{
	            Node temp=head;
	            System.out.println(temp.data);
	            head=head.next;
	            temp=null;
	        }
	    }

	    public void inslast(int data){
	        Node temp=new Node(data);
	        if(head==null){
	            head=temp;
	        }else{
	            Node last=head;
	            while(last.next!=null){
	                last=last.next;
	            }
	            last.next=temp;
	            System.out.println(temp.data);
	        }
	    }

	    public void dellast(){
	        if(head==null){
	            System.out.println("list is empty");
	        }else{
	            Node slast=head;
	            while(slast.next.next!=null){
	                slast=slast.next;
	            }
	            Node last=slast;
	            Node ll=slast.next;
	            slast.next=null;
	            System.out.println(ll.data);
	            last=null;
	            ll=null;

	        }
	    }

	    public void screen(){
	        Node current=head;
	        if(head==null){
	            System.out.println("list is empty");
	            return;
	        }else{
	            System.out.println(" list is: ");
	            while(current!=null){
	                System.out.print(current.data+" ");
	                current=current.next;
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String argv[]){
	        Linked ob=new Linked();
	        ob.insbeg(7);
	        ob.insbeg(14);
	        ob.insbeg(25);
	        ob.inslast(18);
	        ob.inslast(17);

	        ob.screen();

	        ob.insbeg(21);
	        ob.inslast(40);

	        ob.screen();

	        ob.dellast();
	        ob.delbeg();

	        ob.screen();
	    }
	}

