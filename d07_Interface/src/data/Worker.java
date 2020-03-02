/*
    Lớp mô tả công nhân xây dựng - 
    S4 có cách tính lương mô tả ở interface Icalculate
 */
package data;
import basic.ICalculate;
import java.util.Scanner;

public class Worker implements ICalculate{
    public int workDays,baseSalary;
    public String name;
    
    public Worker(){
        
    }
    
    public Worker(int workDays, int baseSalary, String name) {
        this.workDays = workDays;
        this.baseSalary = baseSalary;
        this.name = name;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("NHập dữ liệu công nhân: ");
        System.out.println("Nhập tên : "); name=sc.nextLine();
        System.out.print("Nhập lương cơ bản 1 ngày : "); baseSalary=Integer.parseInt(sc.nextLine());  
        System.out.print("Số ngày làm việc trong tháng: "); workDays=Integer.parseInt(sc.nextLine());    
    }

    @Override
    public int getSalary() {
        return workDays*baseSalary;
    }

    @Override
    public int getAllowance() {
       return 0;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %d -%d -%d",name,baseSalary,workDays,getSalary());
    }
    
}
