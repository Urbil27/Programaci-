
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {

	private List<Item> shoppingCart;
	
	public ShoppingCart(){
		shoppingCart = new ArrayList<Item>();
	}
	
	
//Agrega un nuevo artículo al carrito de compras. Si el artículo ya existe,
//la cantidad de artículos se incrementa.
//parametro newItem para agregar a la lista.

	public void addToCart(Item newItem) {
		boolean found = false;
		Iterator<Item> it = shoppingCart.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			if(item.getName().equals(newItem.getName())) {
				found = true;
				int newAmount = item.getAmount() + newItem.getAmount();
				item.setAmount(newAmount);
			}
		}
		if (!found) {
			shoppingCart.add(newItem);
		}
	}
	
	public float totalPrice() {
		float totalPrice = 0f;
		for (Item item : shoppingCart) {
			totalPrice += item.getUnitPrice() * item.getAmount();
		}
		return totalPrice;
	}
	
	
	public float totalPrice(int discountPrctg) {
		float totalPrice = totalPrice();
		if (discountPrctg >= 0 && discountPrctg <= 100) {
			totalPrice *= discountPrctg / 100; 
		}
		return totalPrice;
	}
	
	public boolean isInCart(String itemName) {
		for (Item item : shoppingCart) {
			if(item.getName().equals(itemName)) {
				return true;
			}
		}
		return false;
	}
	
	public void removeFromCart(String itemName) {
		/*
		for (int i=0;i<shoppingCart.size();i++) {
			Item item = shoppingCart.get(i);
			if(item.getName().equals(itemName)) {
				shoppingCart.remove(i);
			}
		}
		*/
		Iterator<Item> it = shoppingCart.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			if(item.getName().equals(itemName)) {
				it.remove();
			}
		}
		
	}
	
	

	/*Quita la cantidad de elementos con el nombre itemName. Si no hay suficiente
	 elementos con ese nombre, el elemento se elimina de la lista.
	  @param itemName el nombre del elemento que se va a buscar
	  @param cantidad de la cantidad de artículos para eliminar de la lista
	 */
	public void removeFromCart(String itemName, int amount) {
		Iterator<Item> it = shoppingCart.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			if(item.getName().equals(itemName)) {
				int itemAmount = item.getAmount();
				if(itemAmount <= amount) {
					it.remove();
				}
				else {
					int newAmount = itemAmount - amount;
					item.setAmount(newAmount);
				} 				
			}
		}
	}
	
	
	/*Cambia el precio unitario de los artículos cuyo precio unitario es al menos minUnitPrice,
	  Aplicando el porcentaje de descuento. 
	  @param descuentoPrctg
	  @param minUnitPrice
	*/
	public void applyDiscount(int discountPrctg, float minUnitPrice) {
		
	}
	
	public void display() {
		System.out.println("This is your shopping cart:");
		for (Item item : shoppingCart) {
			System.out.println(item);
		}
	}
	
}
//Falta crear el main para probar todos los métodos