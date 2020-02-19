package orders;

import Items.Item;

public class Order {
	Client c;
	int order;
	Item i; 
	Order(Client client, int orderNumber, Item item){
		c=client;
		order=orderNumber;
		i = item; 
	}
}
