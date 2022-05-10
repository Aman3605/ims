package toolboothproject;

public class TollBoothTest {

	public static void main(String[] args) {
		 TollBooth booth = new TollBooth();
	        
	        Truck Ford = new Truck(5, 12500);
	        Truck nissan = new Truck(2, 5000);
	        Truck daewoo = new Truck(6, 17000);
	        Truck Benz=new Truck(6,542);
	        
	        booth.calculateToll(Ford);
	        booth.displayData();
	        
	        booth.calculateToll(nissan);
	        booth.displayData();

	        booth.calculateToll(daewoo);
	        booth.displayData();
	        

	        booth.calculateToll(Benz);
	        booth.displayData();
	        
	        booth.onReceiptCollection();
	        
	        

	        
	      
	}
}
