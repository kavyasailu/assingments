class Stackmain{

 

public static void main(String[] args) {
    Stack stack = new Stack(5);

 

    stack.push(1);
    stack.push(2);
    stack.push(3);

 

    System.out.print("Stack: ");
    stack.printStack();

 

    stack.pop();
    System.out.println("pop");
    stack.printStack();

 

  }
}


