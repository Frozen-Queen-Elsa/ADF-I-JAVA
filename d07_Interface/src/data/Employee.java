/*
    Lớp mô tả nhân viên - 
    S4 có cách tính lương mô tả ở interface Icalculate
 */
package data;
import basic.*;
import java.util.*;

public class Employee implements ICalculate{
    public String name;
    public int basicSalary,workedDays;
    public String level;
    
    public Employee(){
        
    }
    
     public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("NHập dữ liệu nhân viên: ");
        System.out.println("Nhập tên : "); name=sc.nextLine();
        System.out.println("Nhập bậc lương [A/B/C]"); level=sc.nextLine();
        System.out.print("Nhập lương cơ bản 1 tháng : "); basicSalary=Integer.parseInt(sc.nextLine());  
        System.out.print("Số ngày làm việc trong tháng: "); workedDays=Integer.parseInt(sc.nextLine());    
    }
    
    @Override
    public int getSalary() {
        int income=0;
        if(workedDays>24){
            income=basicSalary+(basicSalary/days * (workedDays-days)*OT);
        }
        else{
            income = basicSalary * workedDays /days;
        }
        return income;
    }
    
    @Override
    public int getAllowance() {
        int allowance =0;
        switch(level){
            case "A" : allowance=1000;break;
            case "B" : allowance=500;break;
            case "C" : allowance=100;break;
        }
        return allowance;
    }

    @Override
    public String toString() {
        return String.format("%s - %s -%d -%d -%d", name,level,basicSalary,workedDays,getSalary()+getAllowance());
    }
    
    
    
}
