import java.util.Scanner;

public class StackUsingArray {
    int MAX= 50;
    int []stack= new int[50];
    int top=-1;
    void push(int data){
       if(top>=MAX){
        System.out.println("Stack Is Full");
        return;
       }
       top++;
       stack[top]=data;
    }

    void pop(){
        if(top<0){
            System.out.println("Stack is Empty");
            return;
        }
        int data=stack[top];
        top--;
        System.out.println("Element  "+data +" is popped out from the stack");
    }

    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]+ " ");
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i, data;
      StackUsingArray s1=new StackUsingArray();
      while(true){
        System.out.println("Enter 1 for push"
        +"2 for pop"
        + "3 for display"
        +" 4 for exit");
        i = sc.nextInt();
        switch(i){
            case 1:
            System.out.println("Enter eleemnet");
            data= sc.nextInt();
            s1.push(data);
            break;
            case 2:
            s1.pop();
            break;
            case 3:
            s1.display();
            break;
            case 4:
            return;
            default:
            System.out.println("Wrong Input");
        }
      }

    }
}
