/*
- Private Fields [ID, name]: string, [workedDays, salary]: int
- Constructors to initialize the above fields.
- Method:
- Proctected void accept() : allow user input data into data fields.
validation: ID, name is not null, workedDays, salary > 0.
ID is not duplicate.
- Public abtract void printInfo() : used to print the pay slip of any employee.
 */
package data;

import java.util.Scanner;

public abstract class Employee {
    String ID,name;
    int workedDays,salary;

    public Employee() {
    }

    public Employee(String ID, String name, int workedDays, int salary) {
        this.ID = ID;
        this.name = name;
        this.workedDays = workedDays;
        this.salary = salary;
    }
    protected void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập ID : ");
        ID=sc.nextLine().trim();
        System.out.println("Nhập Name : ");
        name=sc.nextLine().trim();
        while(true){
            System.out.println("Nhập số ngày làm việc");
            workedDays=sc.nextInt();
            if(workedDays>0) break;
            System.out.println("Số ngày làm việc phải >0");
        }
        
        while(true){
            System.out.println("Nhập lương : ");
            salary=sc.nextInt();
            if(salary>0)  break;
            System.out.println("Lương phải lớn hơn 0");
        }        
    }
    
    public abstract void printinfo();

 
    
    
}
