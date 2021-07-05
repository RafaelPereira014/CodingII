import java.util.LinkedList;

import javax.management.*;
import p2utils.Queue;
import p2utils.HashTable;

public class SupermarketOrdering {
	
	
	private int numOrders = 0;
	private java.util.Queue<Order> orders = new Queue<>();
	private HashTable<Integer> products = new HashTable<>(10);
	
	private int numOrders(){
		return numOrders;
	}

	public void enter(Order order){
		orders.in(order);
		if(!products.contains(order.prodName)){ 
		products.set(order.prodName,order.quantity);
		}else{
			products.set(order.prodName,products.get(prodName)+order.quantity);
		}  
		numOrders++;
	}

	public Order serveOrder(){
		Order c = orders.peek();
		orders.out();
		numOrders--;

		return c;
	}

	public int query(String product){
		int quant = 0;
		if(this.products.contains(product)) return this.products.get(product);
		else return quant;
	}

	public String[] displayOrders(){
		System.out.print(""+products);
		String[] c = orders.keys();
		System.out.print("List of orders: "+c);
		return c;
	}
}