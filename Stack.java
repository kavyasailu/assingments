 class Stack {

 

  private int arr[];
  private int peak;
  private int total_size;

 

  Stack(int size) {
    arr = new int[size];
    total_size = size;
    peak = -1;
  }

 

  public void push(int x) {
    if (isFull()) {
      System.out.println("Stack is full");
      System.exit(1);
    }

 

    System.out.println("push the elements " + x);
    arr[++peak] = x;
  }

 

  public int pop() {
    if (isEmpty()) {
      System.out.println("stack is empty");
      System.exit(1);
    }
    return arr[peak--];
  }

 

  public int getSize() {
    return peak + 1;
  }

 

  public Boolean isEmpty() {
    return peak == -1;
  }
  public Boolean isFull() {
    return peak == total_size - 1;
  }

 

  public void printStack() {
    for (int i = 0; i <= peak; i++) {
      System.out.println(arr[i]);
    }
  }

 

}