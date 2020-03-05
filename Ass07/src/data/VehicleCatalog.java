/*
Create class VehicleCatalog in package data for managing a collection of Car:
- Fields: [max, next] int, vehicleList – an array consists of cars
- Methods:
- addCar() - add a new car into system
- displayAll() - display all cars
- searchByBrand (String sBrand) – search & display car by the brand.
- displayAllGPSCar() - display all cars having GPS module installed.
- displayHighRank() - display all cars having price greater than 50000
 */
package data;

public class VehicleCatalog {
/*    int max, next;
   Car[] vehicleList;
   public VehicleCatalog(){
        max = 10;
        next = 0;
        vehicleList = new Car[max];
    }
    */
    int max = 10;
    int next = 0;
    Car[] vehicleList = new Car[max];
    
    public void addCar(){
        if (next==max) {
            System.out.println("HT het cho luu tru. Tu choi them xe moi");
            return;
        }
        Car c = new Car();
        c.input();
        
        vehicleList[next] = c;
        next++;
    }
    
    public void displayAll(){
        // xem hệ thống có dữ liệu không
        if (next==0) {
            System.out.println("HT chua co du lieu !");
            return;
        }
        
        
        System.out.println("\n >>> Danh sách xe <<<");
        for (int i = 0; i < next; i++) {
            System.out.println(vehicleList[i].toString()); // có thể có hoặc không có toString
        }
    }
    
    public void searchByBrand(String sBrand){
        // xem hệ thống có dữ liệu không
        if (next==0) {
            System.out.println("HT chua co du lieu !");
            return;
        }
        
        int cntBrand = 0;
        for (int i = 0; i < next; i++) {
            if(vehicleList[i].brand.equalsIgnoreCase(sBrand))// nhập tên gần đúng thì dùng content
            {
                vehicleList[i].printInfo();
                cntBrand++;
            }
        } //kết thúc for
        
        if(cntBrand == 0){
            System.out.println("khong tim thay xe thuoc thuong hieu" + sBrand);
        }
        
    }
    
    public void displayAllGPSCar(){
        if (next==0) {
            System.out.println("HT chua co du lieu !");
            return;
        }
        int cntGPS = 0;
        for (int i = 0; i < next; i++) {
            if(vehicleList[i].getGPS().equals("Y"))// nhập tên gần đúng thì dùng content
            {
                vehicleList[i].printInfo();
                cntGPS++;
            }
        } //kết thúc for
        if(cntGPS == 0){
            System.out.println("khong tim thay xe co lap dat GPS");
        }
    }
    
    public void displayHighRank(){
        if (next==0) {
            System.out.println("HT chua co du lieu !");
            return;
        }
        int cntPrice = 0;
        for (int i = 0; i < next; i++) {
            if(vehicleList[i].price>=5000)// nhập tên gần đúng thì dùng content
            {
                vehicleList[i].printInfo();
                cntPrice++;
            }
        } //kết thúc for
        if(cntPrice == 0){
            System.out.println("khong tim thay xe co don gia >= 5000");
        }
    }
}
