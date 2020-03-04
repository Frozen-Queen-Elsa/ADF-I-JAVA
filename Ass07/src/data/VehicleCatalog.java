/*
Create class VehicleCatalog in package data for managing a collection of Car:
- Fields: [max, next] int, vehicleList – an array consists of cars
- Methods:
- addCar() - add a new car into system
- displayAll() - display all cars
- searchByBrand (String sBrand) – search & display car by the brand.
- displayAllGPSCar() - display all cars having GPS module installed.
- displayHighRankl() - display all cars having price greater than 50000
4
 */
package data;


public class VehicleCatalog {
    int max,next;
    Car[] vehicleList;
    
    public void VehicleCatalog(){
        int max=10;
        int next=0;
        Car[] vehicleList =new Car[max];
       
    }
    
    public void addCar(){
        if(next==max){
            System.out.println("Hệ thống hết chỗ lưu trữ. Từ chối thêm xe mới !");
            return;
        }
        Car c=new Car();
        c.input();
        
        vehicleList[next]=c;
        next++;
    }
    
    
    public void displayAll(){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu !!!");
            return;
        }
        
        System.out.println("\n>>Danh sách xe <<");
        for(int i=0;i<next;i++){
            System.out.println(vehicleList[i].toString());
        }
    }
    
    public void searchByBrand(String sBrand){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        
        int cntBrand=0;
        for(int i=0;i<next;i++){
            if(vehicleList[i].brand.equalsIgnoreCase(sBrand)){
                vehicleList[i].printInfo();
                cntBrand++;
            }
        }//Kết thúc for
        
        if(cntBrand==0){
            System.out.println("Không tìm thấy xe thuộc thương hiệu : "+sBrand);
        }
    }
    
    public void displayAllGPSCar(){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        int cntGPS=0;
        for(int i=0;i<next;i++){
            if(vehicleList[i].getGPS().equals("Y")){
                vehicleList[i].printInfo();
                cntGPS++;
            }
        }//Kết thúc for
        
        if(cntGPS==0){
            System.out.println("Không tìm thấy xe có hệ thống GPS !!");
        }
    }
    
    public void displayHighRank(){
        if(next==0){
            System.out.println("Hệ thống chưa có dữ liệu");
            return;
        }
        int cntPrice=0;
        for(int i=0;i<next;i++){
            if(vehicleList[i].price>=50000){
                vehicleList[i].printInfo();
                cntPrice++;
            }
        }//Kết thúc for
        
        if(cntPrice==0){
            System.out.println("Không tìm thấy xe có đơn giá >= 50000 !!");
        }
    }
}
