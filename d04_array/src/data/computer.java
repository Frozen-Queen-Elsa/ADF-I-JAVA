
package data;


public class Computer {
    //Khai báo thuộc tính của 1 computer
    public String id,description;
    public int price;
    
    //Hàm dựng không tham số - Default constructor
    public Computer() {
        id="C01";
        description="Desktop IBM - 1234";
        price=100;
    }
    
    //Hàm dựng có tham số

    public Computer(String id, String description, int price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
    
}
