
public class driver {

  public static void main(String[] args) {
    StackLL<String> StringStack = new StackLL<String>();
    StringStack.push("Something");
    StringStack.push("Something Else");
    System.out.println(StringStack);
    System.out.println("Pop, should be 'Something Else': " + StringStack.pop());

    StackLL<Integer> IntegerStack = new StackLL<Integer>();
    IntegerStack.push(42);
    IntegerStack.push(-83);
    System.out.println(IntegerStack);
    System.out.println("Pop, should be '-83': " + IntegerStack.pop());
    
    StackLL<LinkedList> LLStack = new StackLL<LinkedList>();
    LLStack.push(new LinkedList<String>());
    LLStack.peek().append("Item1");
    LLStack.peek().append("Item2");
    LLStack.push(new LinkedList<String>());
    LLStack.peek().append("Item3");
    LLStack.peek().append("Item4");
    LLStack.peek().append("Item5");
    System.out.println(LLStack);
    
    /*
     * Item1  Item2
     * Item3  Item4   Item5
     * 
     */
    
    QueueLL<String> StringQ = new QueueLL<String>();
    StringQ.enqueue("S1");
    StringQ.enqueue("S2");
    StringQ.enqueue("S3");
    System.out.println(StringQ);
    System.out.println("Dequeue, should be 'S1': " + StringQ.dequeue());
    
    QueueLL<StackLL<LinkedList>> What = new QueueLL<StackLL<LinkedList>>();
    
    QueueLL<Double> DoubleQ = new QueueLL<Double>();
    DoubleQ.enqueue(32.0192838293);
    DoubleQ.enqueue(-54621.1851981);
    DoubleQ.enqueue(0.0000000000000001);
    System.out.println(DoubleQ);
  }

}
