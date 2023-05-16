import java.util.Scanner;
class MyStack{
    int arr[];
    int cap;
    int top;

    MyStack(int c){
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    void push(int x){
        if(top == cap-1){
            System.out.println("STACKOVERFLOW !!!!");
        }else{
            top++;
            arr[top] = x;
        }
	   return ;
    }

    int pop(){
        if(top == -1){
            System.out.println("STACKUNDERFLOW !!!!");
        }else{
            int res = arr[top];
            top--;
            return res;
        }
		return -1;
    }
}

class StackImplementation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Stack : ");
        int size = sc.nextInt();
        MyStack s = new MyStack(size);

        int x;

        for(int i=1; i<=size; i++){
            System.out.print("Enter Element " + i +" : ");
            x = sc.nextInt();
            s.push(x);
        }
        

        System.out.println("The contents of Stack are : ");
        for(int i=1; i<=size; i++){
            System.out.print("Element " + i +" : ");
            System.out.println(s.pop());
        }
        s.pop();

        

    }
}