/*
- Fields : salary, workedDays, position
- Constructors to initialize the all fields
- Override methods:
- accept() : allow user to input additional details for an employee:
invoke method accept() of super class.
using try-catch exception for validation: salary belongs to [200-10000], salary belongs to [0-27].
- printInfo() : display details of an employee including id, name, age, position, salary, worked days, income (salary* worked days/26)
- toString() : return a string presenting all the details of a employee.
 */
package data;
import java.util.*;

public class Employee extends Person{
    public int salary,workedDays;
    public String position;

    public Employee() {
    }

    public Employee( String id, String name, int yob,int salary, int workedDays, String position) {
        super(id, name, yob);
        this.salary = salary;
        this.workedDays = workedDays;
        this.position = position;
    }

    
    
    @Override
    public void accept() {
        super.accept();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập position");
        position=sc.nextLine().trim();
        while(true){
            System.out.println("Nhập salary [200-10000]:");
            try{
                salary=sc.nextInt();
                if(salary>=200 &&salary<=10000) break;
                System.out.println("Salary must be belong to [200-10000]");
            //    throw new ClassFormatError("Salary must be belong to [200-10000]");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
        }
        
        while(true){
            System.out.println("Nhập Worked Days [0-27] :");
            try{
                workedDays=sc.nextInt();
                if(workedDays>=0 &&workedDays<=27) break;
                System.out.println("Worked Days must be belong to [0-27]");
            //    throw new ClassFormatError("Worked Days must be belong to [0-27]");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
        }
    }

    public int getAge(){
        return 2020-yob;
    }
    
    public int getIncome(){
        return salary*workedDays/26;
    }
    
    @Override
    public void prinInfo() {
        System.out.println("\n>>Thông tin Employee<<");
        System.out.println("ID          : "+id);
        System.out.println("Name        : "+name);
        System.out.println("Age         : "+getAge());
        System.out.println("Position    : "+position);
        System.out.println("Salary      : "+salary);
        System.out.println("Worked Days : "+workedDays);
        System.out.println("Income      : "+getIncome());        
    }

    @Override
    public String toString() {
        return String.format("%s - %s -%d - %s - %d - %d - %d",id,name,getAge(),position,salary,workedDays,getIncome());
    }
    
    
    
    
    
    
    
}
