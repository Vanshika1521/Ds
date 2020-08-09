package ds1;

public class stck {
	

	    int arr[];
	    int v;
	    int top=-1;


	    public stck(int size){
	        arr =new int[size];
	        v=size;
	    }

	    public void push(int data){
	        if(isfull()){
	            System.out.println("Stack Overflow");
	            return;
	        }else{
	            arr[++top]=data;
	            System.out.println(data+"  inserted");
	        }
	    }

	    public void pop(){
	        if(isempty()){
	            System.out.println("Stack underflow");
	            return;
	        }else{
	            System.out.println(arr[top]+"  poped");
	            top--;
	        }
	    }

	    public int pea(){

	        System.out.println(arr[top]);
	        return arr[top];
	    }

	    public boolean isfull(){
	        return top==v;
	    }

	    public boolean isempty(){
	        return top==-1;
	    }

	    public static void main(String argv[]){
	        stck ob=new stck(100);
	        ob.push(11);
	        ob.push(12);
	        ob.push(13);
	        ob.push(14);
	        ob.push(15);
	        ob.pea();

	        ob.pop();
	        ob.pea();


	    }
	
}
