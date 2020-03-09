
package product;
import java.util.Scanner;
import sale.*;

public class Item implements IDiscount{
    public String name;
    public int price,quantity;

    public int getToTal(){
        return quantity*price;
    }
    @Override
    public void diplayDetail() {
        System.out.println("\n>>Thông tin ITEM<<");
        System.out.println("Name     : "+name);
        System.out.println("Price    : "+price);
        System.out.println("Quantity : "+quantity);
        System.out.println("Total    : "+getToTal());
        
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nNhập thông tin ITEM");
        while(true){
            System.out.println("Nhập Tên : ");
            try{
                name=sc.nextLine().trim();
                if(name.length()>0) break;
                System.out.println("NAME is not NULL !!!");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
            
        }
        
        while(true){
            System.out.println("Nhập Giá : ");
            try{
                price=sc.nextInt();
                if(price>0) break;
                System.out.println("Price must be greater than ZERO !!!");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
            
        }
        
        while(true){
            System.out.println("Nhập Số lượng : ");
            try{
                quantity=sc.nextInt();
                if(quantity>0) break;
                System.out.println("Quantity must be greater than ZERO !!!");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
            
        }
    }
}
