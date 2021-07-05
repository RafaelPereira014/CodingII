package p2utils;

/** This class implements a List abstract data type using a linked list.
 * Please note that this is p2utils.LinkedList.
 * It is NOT the java.util.LinkedList class in the standard Java library!
 */
public class LinkedList<E> {

  private Node<E> first = null;
  private Node<E> last = null;
  private int size = 0;

  /** {@code LinkedList} constructor, empty so far.
   */
  public LinkedList() { }

  /** Returns the number of elements in the list.
   * @return Number of elements in the list
   */
  public int size() { return size; }

  /** Checks if the list is empty.
   * @return  {@code true} if list empty, otherwise {@code false}.
   */
  public boolean isEmpty() { return size == 0; }

  /** Returns the first element in the list.
   * @return  First element in the list
   */
  public E first() {
    assert !isEmpty(): "empty!";

    return first.elem;
  }

  /** Returns the last element in the list.
   * @return Last element in the list
   */
  public E last() {
    assert !isEmpty(): "empty!";

    return last.elem;
  }

  /** Adds the given element to the start of the list.
   * @param e the element to add
   */
  public void addFirst(E e) {
    first = new Node<>(e, first);
    if (isEmpty())
      last = first;
    size++;

    assert !isEmpty(): "empty!";
    assert first().equals(e) : "wrong element";
  }

  /** Adds the given element to the end of the list.
   * @param e the element to add
   */
  public void addLast(E e) {
    Node<E> newest = new Node<>(e);
    if (isEmpty())
      first = newest;
    else
      last.next = newest;
    last = newest;
    size++;

    assert !isEmpty(): "empty!";
    assert last().equals(e) : "wrong element";
  }

  /** Removes the first element in the list.
   */
  public void removeFirst() {
    assert !isEmpty(): "empty!";
    first = first.next;
    size--;
    if (isEmpty())
      last = null;
  }

  /** Removes all elements.
   */
  public void clear() {
    first = last = null;
    size = 0;
  }

  /** Checks if the given element exists in the list.
   * @param e an element
   * @return {@code true} if the element exists and {@code false} otherwise
   */
  public boolean contains(E e) { 
    return contains(first, e); 
  }
  private boolean contains(Node<E> n, E e) {
    if (n == null) return false;
    if (n.elem==null) return e==null; //dispensável, se impedirmos elem==null
    if (n.elem.equals(e)) return true; 
    return contains(n.next, e);
  }

  /** Prints all elements, one per line. */
  public void print() {
    print(first);
  }
  private void print(Node<E> n) {
    if (n != null) {
      System.out.println(n.elem);
      print(n.next);
    }
  }

  // funções adicionais pedidas no guião...
  public LinkedList<E> clone() {
	LinkedList<E> cl = new LinkedList<E>();
	Node<E> node = first;
		while( node != null ){
			cl.addLast(node.elem);
			node = node.next;
			}
			return cl;
	}
	
  public LinkedList<E> reverse() {
		LinkedList<E> cl2 = new LinkedList<E>();
		Node<E> node2 = first;
			while( node2 != null){
				cl2.addFirst(node2.elem);
				node2 = node2.next;
				}
			return cl2;
		}
	
		
   public E get(int pos) {
	 assert pos >= 0 && pos <= size();
	Node<E> node4 = first;
	int cont = 0;
		while(cont != pos){
			node4 = node4.next;
			cont++;
			}
		return node4.elem;
		}
		
	public void remove(E e){
		Node<E> node5 = first;
		Node<E> ant = null;
			while(e.equals(node5.elem)==false && node5 != null){
				ant = node5;
				node5 = node5.next;
			
				}
			if(node5 == first) first = node5.next;
			else if(node5 == last){
				 last = ant;
				 ant.next=null;
			 }
		
			
		}
	
	public LinkedList<E> concatenate(LinkedList<E> lst){
		LinkedList<E> nova = lst.clone();
		Node<E> node = first;
			while(node != null){
				nova.addLast(node.elem);
				node=node.next;
				}
			return nova;
			
		}
		

}
