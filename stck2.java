package ds1;

public class stck2 {
	

	    int arr[];
	    int size;
	    int top1;
	    int top2;

	    public stck2(int n){
	        size=n;
	        arr=new int[n];
	        top1=-1;
	        top2=size;
	    }

	    public void push1(int data){
	        if(top1==size){
	            System.out.println("Stack Overflow");
	            return;
	        }else{
	            arr[++top1]=data;
	            System.out.println(data+" is inserted in stack 1");
	        }
	    }
	    public void push2(int data){
	        if(top2==-1){
	            System.out.println("Stack Overflow");
	            return;
	        }else{
	            arr[--top2]=data;
	            System.out.println(data+" is inserted in stack 2");
	        }
	    }

	    public void pop1(){
	        if(top1==-1){
	            System.out.println("Stack underflow");
	            return;
	        }else{
	            System.out.println(arr[top1]+" is poped");
	            top1--;
	        }
	    }

	    public void pop2(){
	        if(top2==-1){
	            System.out.println("Stack underflow");
	            return;
	        }else{
	            System.out.println(arr[top2]+" is poped");
	            top2++;
	        }
	    }

	    public int pek1(){

	        System.out.println(arr[top1]);
	        return arr[top1];
	    }

	    public int pek2(){

	        System.out.println(arr[top2]);
	        return arr[top2];
	    }





	    public static void main(String argv[]){

	        stck2 ob=new stck2(6);
	        ob.push1(11);
	        ob.push2(20);
	        ob.push1(30);
	        ob.push2(40);
	        ob.pop1();
	        ob.pop2();
	        ob.pek1();
	        ob.pek2();

	    }
	}

