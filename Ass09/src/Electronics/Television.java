/*
- Fields: pprice, QoH (quantity on hand) and brand.
- Constructors to initialise the all fields.
- Override methods:
protected void accept() : allow user to input additional details of a television
invoke method accept() of super class. public String toString() : return a string presenting all the details of a product as
 */
package Electronics;

import Goods.*;
import java.util.*;

public class Television extends Products implements ITax{
    public int price,QoH;
    public String brand;

    public Television() {
    }

    public Television(String brand, String id, String name,int price, int QoH) {
        super(id, name);
        this.price = price;
        this.QoH = QoH;
        this.brand = brand;
    }

    @Override
    protected void accept() {
        super.accept(); 
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập brand :");brand=sc.nextLine().trim();
        System.out.println("Nhập giá : "); price=sc.nextInt();
        System.out.println("Nhập số lượng hàng tồn kho: "); QoH=sc.nextInt();        
    }

    @Override
    public float getCost() {
        return price+price*VAT_TAX_PERCENT;
    }

    
    
    @Override
    public String toString() {
        String s=super.toString();
       
        return s+" - "+price+" - "+QoH+ " - "+getCost()+" - "+QoH+getCost();
    }

    
    @Override
    public void printinfo() {
        System.out.println(">>Thông tin sản phẩm<<");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
        System.out.println("Hàng tồn kho : "+QoH);
        System.out.println("Brand : "+brand);
    }  
    
}
