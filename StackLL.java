
public class StackLL {
  
  // class variable
  private LinkedList list;
  
  // constructor
  StackLL(){
    list = new LinkedList();
  }
  
  public void push(String inVal){
    list.append(inVal);
  }
  
  public String pop(){
    String rtn = list.tailValue();
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
  
  public String peek(){
    return list.tailValue();
  }

  public String toString() {
    return list.toString();
  }
}
