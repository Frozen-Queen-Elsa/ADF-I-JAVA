/*
    Tạo lớp kiểm thử Java Main Class, DoctorTest.java , bao gồm 2 phương thức :
        a. menu() : tạo thực đơn để thực hiện các chức năng : 1. nhập thông tin bác sĩ, 2. xuât thông tin bác sĩ, 3. in cấp bậc, 4. Nhập số ngày làm việc và tính thu nhập, 5. Thoát
        b. main() : gọi phương thức menu() để thi hành chương trình.
 */
package Hospital;
import java.util.*;

public class DocTorTest {

    
    public static void main(String[] args) {
        DocTorTest o=new DocTorTest();
        o.menu();
    }
    
    public void menu(){
        String id;
        int days;
        String opt="";        
        Doctor d=new Doctor();
        while(true){
            Scanner sc=new Scanner(System.in);
            System.out.println("\n>>MENU<<");
            System.out.println("1. Nhập thông tin bác sỹ");
            System.out.println("2. Xuất thông tin bác sỹ");
            System.out.println("3. In hệ số lương của bác sỹ");
            System.out.println("4. Nhập số ngày làm việc và tính thu nhập");
            System.out.println("5. Thoát");
            System.out.println("Nhập lựa chọn [1-5]");
            opt=sc.nextLine().trim();

            switch(opt){
                case "1":
                    d.input();
                    break;
                case "2":
                    d.print();
                    break;
                case "3":
                    System.out.println("Nhập ID bác sỹ: ");
                    id=sc.nextLine().trim();
                    d.print(id);
                    break;
                case "4":
                    System.out.println("Nhập số ngày làm việc của bác sỹ :");
                    days=sc.nextInt();
                    System.out.println("Thu nhập của bác sỹ là "+d.print(days));
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Xin vui lòng nhập lại số từ 1 đến 5");
                    break;
            }
        }
        
    }
}
