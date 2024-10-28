
public class Aims {
	public static void main(String[] args){
		// Create a new cart
		Cart thanhtuu = new Cart();
		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		thanhtuu.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		thanhtuu.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
		thanhtuu.addDigitalVideoDisc(dvd3);
		thanhtuu.removeDigitalVideoDisc(dvd2);
		// Print total cost of the items in the cart
		System.out.println("Total Cost is: ");
		System.out.println(thanhtuu.totalCost());

	}
}
