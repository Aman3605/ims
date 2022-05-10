package toolboothproject;

public class TollBooth {

	int trucksSinceCollection;
	 int receiptsSinceCollection;

	
	void calculateToll(Truck truck) {
       int axles = truck.getAxles();
       int totalWeight = truck.getTotalWeight();
       int tollDue = 5*axles + 10*(totalWeight/1000);  // Toll calculation
       
       System.out.print("Truck arrival - axles: ");
       System.out.println(axles);
       
       System.out.print(" total weight: ");
       System.out.println(totalWeight);
       
       System.out.print(" Toll due: ");
       System.out.println(tollDue);
       
       trucksSinceCollection += 1;
       receiptsSinceCollection +=tollDue;
   }
	
   void onReceiptCollection() {
       System.out.print("* Collecting receipts *");
       displayData(); 
   }
   
   void displayData() {
       System.out.print("Totals since last collection - Receipts: ");
       System.out.print(receiptsSinceCollection);
       System.out.print(" Trucks: ");
       System.out.println(trucksSinceCollection);
   }
   
}
