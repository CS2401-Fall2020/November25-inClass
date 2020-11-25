
public class QueueLL<X> {
  
  // class variable(s)
  private LinkedList<X> list;
  
  //constructor
  QueueLL(){
    list = new LinkedList<X>();
  }
  
  public void enqueue(X inVal) {
    list.append(inVal);
  }
  
  public X dequeue() {
    X rtn = list.headValue();
    list.deleteHead();
    return rtn;
  }
  
  public boolean isEmpty() {
    return (this.getLength()==0);
  }
  
  public int getLength() {
    return list.count();
  }
  
  public X peek() {
    return list.headValue();
  }
  
  public String toString() {
    return list.toString();
  }
  
}
