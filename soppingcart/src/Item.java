

public class Item {
	
	private String name;
	private float unitPrice;
	private int amount;
	
	Item(String name, float unitPrice, int amount){
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Item name:" + name + ", unit price: " + unitPrice 
				+ ", amount: " + amount;
	}

	public String getName() {
		return name;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public float applyDiscount(int discountPrctg, float minUnitPrize) {
		if(getUnitPrice()<minUnitPrize) {
			System.out.println("ERROR, El producto vale menos que el precio minimo");
		}
		else {
			return getUnitPrice()/100*90;
		}
		return minUnitPrize;
		
	}
}
	