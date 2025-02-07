package classes;
public class recyclebin extends SmartWasteBin
{
     private String recycle_type;
     public recyclebin(int binid, String location, int capacity, String recycleType) {
        super(binid, location, capacity); 
        this.recycle_type = recycle_type;

     }

     public void showRecycleType() {
        System.out.println("This is a " + recycle_type + " recycling bin");
    }

    public void displayRecycleDetails() {
        System.out.println("Recycle Bin Details:");
        super.display();
        System.out.println("Recycle Type: " + recycle_type);
    }
     
}