
public class StackLL<G> { // relies on generic type G
  
  // class variable
  private LinkedList<G> list;
  
  // constructor
  StackLL(){
    list = new LinkedList<G>();
  }
  
  public void push(G inVal){
    list.append(inVal);
  }
  
  public G pop(){
    G rtn = list.tailValue();
    list.deleteTail();
    return rtn;
  }
  
  public boolean isEmpty(){
    return (this.getLength()==0);
    /*
     * if(list.count()==0) return true;
     * return false;
     */
  }
  
  public int getLength(){
    return list.count();
  }
  
  public G peek(){
    return list.tailValue();
  }

  public String toString() {
    return list.toString();
  }
}
