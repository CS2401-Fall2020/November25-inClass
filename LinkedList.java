
public class LinkedList {
  private class Node{
    public String value; 
    public Node next;
    
    Node(String inVal, Node inNext){
      value = inVal;
      next = inNext;
    }
    
    public String toString() { return value; }
  }
  
  private Node head;
  private Node tail;
  
  public void prepend(String inVal) {
    if(head == null) append(inVal);
    else head = new Node(inVal, head);
  }
  
  public void append(String inVal) {
    if(tail != null) {
      tail.next = new Node(inVal, null);
      tail = tail.next;
    }else {
      head = tail = new Node(inVal, null);
    }
  }

  public String headValue() {
    if(head == null) return null;
    return head.value;
  }

  public String tailValue() {
    if(tail == null) return null;
    return tail.value;
  }
  
  public void deleteHead() {
    if(head != null) head = head.next;
    if(head == null) tail = null;
  }
  
  public void deleteTail() {
    if(head == tail) head = tail = null;
    if(head == null) return;
    
    Node current = head;
    while(current.next != tail) {
      current = current.next;
    }
    current.next = null;
    tail = current;
  }
  
  public int count() {
    if(head==null) return 0;
    int rtn = 1;
    Node current = head;
    while(current != tail) {
      current = current.next;
      rtn++;
    }
    return rtn;
  }
  
  public String toString() {
    Node current = head;
    String rtn = "";
    while(current != null) {
      rtn += current + "->";
      current = current.next;
    }
    return rtn + "null";
  }
}
