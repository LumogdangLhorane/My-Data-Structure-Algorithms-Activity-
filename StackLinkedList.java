class Node {   //Basic class or the class node
    int data;
    Node next;

    public Node(int data) { //constructor
        this.data = data;
        this.next = null;
    }
}

class Stack{
    private Node top; //private is access modifier
    public Stack(){    //constructor
        this.top = null;
    }
    public void push(int data){ //if public void there is no data that will return
        Node  newNode = new Node(data);
        newNode.next = top;
        top = newNode ;
        System.out.println(data + " pushed onto stack"); //the + sign is concatenation
    }
    //return type
    public int pop(){ 
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
    public class stackll{
        public static void main(String[]args){
            Stack stack = new Stack();
            stack.push(10);
            stack.push(20);
            
            System.out.println("Top element is : "+stack.peek());
            
        }
    }