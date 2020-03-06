/*
i. Fields: ArrayList ds (chứa các đối tượng căn hộ),
ii. No-agr constructor (Hàm dựng không tham số): khởi tạo bộ nhớ cho arraylist ds
iii. Methods:
1. void add(): thêm 1 căn hộ mới mới vô danh sách ds. Lưu ý: kiểm tra nếu mã số căn hộ bị trùng sẽ báo lỗi và từ chối thêm mới.
2. void display(): In toàn bộ bảng danh sách các căn hộ, và in thông báo lỗi nếu hệ thống chưa có dữ liệu
3. void display(int area): In ra danh sách các căn hộ có diện tích trên area m2. Chương trình sẽ in thông báo lỗi nếu hệ thống chưa có dữ liệu hoặc không tìm thấy căn hộ nào thỏa điều kiện nêu trên.
4. void display(boolean isSquare): - Nếu isSquare là true: Tìm và in ra danh sách các căn hộ hình vuông, ngược lại xuất các căn hộ hình chữ nhật. - Lưu ý: chương trình sẽ in thông báo lỗi nếu hệ thống chưa có dữ liệu hoặc không tìm thấy căn hộ nào theo yêu cầu.
5. void menu(): xây dựng hệ thống thực đơn cho phép thêm, tìm kiếm và in danh sách các căn hộ theo yêu cầu.
6. static void main (): tạo 1 đối tượng kiểu ApartmentTest, gọi phương thức menu() trên đối tượng này để thi hành chương trình.
 */
package ui;

import data.*;
import java.util.*;
public class ApartmentTest {

    int max=10;
    int index=0;
    Apartment[] aList =new Apartment[max];
    
    public void add(){
        if(index==max){
            System.out.println("Hệ thống không còn chỗ lưu dữ liệu !! Từ chối thêm mới !!");
            return;
        }
        
        while(true){
            Apartment a=new Apartment();
            a.getInput();
            int checkid=0;
            for(int i=0;i<index;i++){
                if(aList[i].id.equalsIgnoreCase(a.id)){
                    checkid=1;
                    break;
                }                
            }
            if(checkid==0){
                aList[index]=a;
                index++;
                break;
            }
            else{
                System.out.println("ID bị trùng !! Xin vui lòng nhập lại !!");
            }
        }
    }
    
    public void display(){
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        
        System.out.println("\n>>Danh sách các căn hộ<<");
        for(int i=0;i<index;i++){
            System.out.println(aList[i]);
        }
    }
    
    public void display(int area){
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        
        System.out.printf("\n>>Danh sách các căn hộ có diện tích lớn hơn %d<<\n",area);
        for(int i=0;i<index;i++){
            if(aList[i].getArea()>area){
                aList[i].print();
            }
        }
    }
    
    public void display(boolean isSquare){
        if(index==0){
            System.out.println("Hệ thống chưa có dữ liệu !!");
            return;
        }
        if(isSquare){
            System.out.println("\n>>Danh sách căn hộ hình vuông<<");
            for(int i=0;i<index;i++){
                if(aList[i].isSquare()){
                    aList[i].print();
                }
            }
        }
        else{
            System.out.println("\n>>Danh sách căn hộ hình chữ nhật<<");
            for(int i=0;i<index;i++){
                if(aList[i].isSquare()){
                    aList[i].print();
                }
            }
        }
        
    }
    
    void menu(){        
        while(true){
            Scanner sc=new Scanner(System.in);
            String opt="";
            
            System.out.println(">>MENU<<");
            System.out.println("1. Nhập thông tin căn hộ");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Hiển thị các căn hộ theo diện tích");
            System.out.println("4. Hiển thị các căn hộ hình vuông");
            System.out.println("5. Hiển thị các căn hộ hình chữ nhật");
            System.out.println("6. Thoát");
            System.out.println("Vui lòng lựa chọn [1-6]");
            opt=sc.nextLine().trim();
            
            switch(opt){
                case "1":
                    add();
                    break;
                case "2":
                    display();
                    break;
                case "3":
                    int area;
                    System.out.println("Nhập diện tích");
                    area=sc.nextInt();
                    display(area);
                    break;
                case "4":
                    display(true);
                    break;
                case "5":
                    display(false);
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Vui lòng lựa chọn [1-6]");
            }
        }
    }
    
    public static void main(String[] args) {
        ApartmentTest o=new ApartmentTest();
        o.menu();
    }
    
}
