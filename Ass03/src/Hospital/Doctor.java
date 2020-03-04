/*
    a. Fields dữ liệu : docNo, name, specification (string), exp_years, salary (int)
    b. Hàm dựng: khởi trị ban đầu cho các field dữ liệu, bao gồm hàm dựng
        i. Không tham số Doctor()
        ii. Có tham số Doctor(String, String, String, int, int)
    c. Phương thức:
        i. void input () : nhập dữ liệu chi tiết của 1 bác sĩ . Yêu cầu kiểm tra tính hợp lệ của dữ liệu: docNo, name, specification -ko được để trống, exp_years, salary phải lớn hơn 0
        ii. void print() : in các thông tin chi tiết của 1 bác sĩ ra màn hình 
        iii. void print(String id) : in ra hệ số cấp bậc của bác sĩ có mã số là id, dựa vào số năm kinh nghiệm (exp_years) như sau :
            1. ‘D’ nếu số năm kn >=15 năm
            2. ‘C’ nếu số năm kn >=10 năm và nhỏ hơn <15 năm
            3. ‘B’ nếu số năm kn >=5 năm và nhỏ hơn <10 năm
            4. ‘A’ nếu số năm kn <5 năm
        Lưu ý, chương trình sẽ thông báo lỗi nếu mã số id ko đúng.
        iv. int print(int days): tính và trả về thu nhập trong tháng của bác sĩ dựa vào số ngày làm việc (days) và số năm kinh nghiệm theo công thức sau : income = (salary * days)/24 + allowance (phụ cấp cấp bậc) , với allowance = 1000 nếu số năm kn >=15 năm
        600 nếu số năm kn >=10 năm và nhỏ hơn <15 năm
        300 nếu số năm kn >=5 năm và nhỏ hơn <10 năm
        100 nếu số năm kn <5 năm
 */
package Hospital;

import java.util.*;

public class Doctor {
    public String docNO,name,specification;
    public int exp_years,salary;

    public Doctor() {
    }

    public Doctor(String docNO, String name, String specification, int exp_years, int salary) {
        this.docNO = docNO;
        this.name = name;
        this.specification = specification;
        this.exp_years = exp_years;
        this.salary = salary;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập thông tin bác sỹ !");
        System.out.println("Nhập ID :");
        docNO=sc.nextLine().trim();
        System.out.println("Nhập Tên :");
        name=sc.nextLine().trim();
        System.out.println("Nhập Specification :");
        specification=sc.nextLine().trim();
        System.out.println("Nhập Số năm kinh nghiệm :");
        exp_years=sc.nextInt();
        System.out.println("Nhập lương :");
        salary=sc.nextInt();        
    }
    
    public void print(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nThông tin của bác sỹ !");
        System.out.printf("ID : %s - Name : %s - Specification : %s - Exp Years : %d years - Salaray : %d $\n",docNO,name,specification,exp_years,salary);
    }
    
    public void print(String id){
        String level;
        
        if(id.equalsIgnoreCase(docNO)){
            if(exp_years<5){
            level="A";
            }
            if(exp_years>=5&&exp_years<10){
                level="B";
            }
            if(exp_years>=10&&exp_years<15){
                level="C";
            }
            else{
                level="D";
            }
            System.out.printf("Bác sỹ ID %s có hệ số lương là %s",docNO,level);
           return;
        }
        System.out.println("Không có bác sỹ có mã số ID là "+id);
        
    }
    
    public int print(int days){
        int income=0;
        int allowance=0;
        if(exp_years<5){
            allowance=100;
        }
        if(exp_years>=5&&exp_years<10){
            allowance=300;
        }
        if(exp_years>=10&&exp_years<15){
            allowance=600;
        }
        else{
            allowance=1000;
        }
        income=(salary+days)/24+allowance;
        return income;
    }
}
