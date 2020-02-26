
package app;

import java.util.*;
public class TestComputerArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String op="";
        ComputerArrayList o=new ComputerArrayList();
        
        //menu
        while(true){
            System.out.println("\n MENU");
            System.out.println("1. Thêm máy tính mới");
            System.out.println("2. Xem danh sách máy tính mới");
            System.out.println("3. Tìm máy tính theo mô tả");
            System.out.println("4. Xóa máy tính theo mã số");
            System.out.println("5. Thoát");
            System.out.print("Vui lòng chọn chức nang [1-5] : ");
            op=sc.nextLine().trim();
            
            switch(op){
                case "1":
                    o.addNewComputer();
                    break;
                case "2":
                    o.displayAll();
                    break;
                case "3":
                    System.out.print(">>Nhập mô tả :");
                    String s=sc.nextLine();
                    o.display(s);
                    break;
                case "4":
                    System.out.print(">>Nhập mã số :");
                    o.remove(sc.nextLine().trim());
                    break;
                case "5":
                    return;
                default :
                    System.out.println("Chọn sai chức năng");
                    break;   
            }
        }
    }
    
}
