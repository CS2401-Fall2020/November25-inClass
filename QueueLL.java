
public class QueueLL {
  
  // class variable(s)
  private LinkedList list;
  
  //constructor
  QueueLL(){
    list = new LinkedList();
  }
  
  public void enqueue(String inVal) {
    list.append(inVal);
  }
  
  public String dequeue() {
    String rtn = list.headValue();
    list.deleteHead();
    return rtn;
  }
  
  public boolean isEmpty() {
    return (this.getLength()==0);
  }
  
  public int getLength() {
    return list.count();
  }
  
  public String peek() {
    return list.headValue();
  }
  
  public String toString() {
    return list.toString();
  }
  
}
