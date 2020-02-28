/*
    Sử dụng các tính năng của lớp ShapeCollection thông qua menu
 */
package app;
import java.util.*;
        

public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestShape t=new TestShape();
        t.menu();
    }
    
    void menu(){
        String op="";
        ShapeCollection o=new ShapeCollection();
        Scanner sc=new Scanner (System.in);
        
        while(true){
            System.out.println("\n === MENU ====");
            System.out.println("1. Thêm 1 hình tròn");
            System.out.println("2. Thêm 1 hình chữ nhất");
            System.out.println("3. In danh sách các hình");
            System.out.println("4. In ra danh sách các hình có diện tích >50");
            System.out.println("5. In ra dánh sách các hình tròn");
            System.out.println("6. Thoát");
            System.out.println("Vui lòng chọn chức năng[1-6]");
            op=sc.nextLine().trim();
            
            switch(op){
                case"1":
                    o.addCircle();
                    break;
                case"2":
                    o.addRectangle();
                    break;
                case"3":
                    o.display();
                    break;
                case"4":
                    break;
                case"5":
                    break;
                case"6":
                    return; //Kết thức hàm
                default:
                    System.out.println("Chỉ nhập giá trị từ [1-6]");
                    break;
                                
            }
        }
    }
    
}
