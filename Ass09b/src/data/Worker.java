/*
- Private Field [overtime]: int
- Constructors to initialize the all fields.
- Override methods:
- proctected void accept() : allow user to input all details for a worker. (Hint: invoke super.accept() ) - validation: overtime >= 0
- public float getTax(): monthly sal = salary*(worked days + overtime*2) /26; tax = 0 if mothly sal < 400 else tax = monthly sal * income tax percent
- public float getAllowance(): 0
- public float getIncome(): monthly sal – tax
- public void printInfo() : print the pay slip of a worker
- public String toString() : return a string presenting all details of a worker .
 */
package data;

import java.util.Scanner;


public class Worker extends Employee implements ISalary,ITaxable{
    private int overtime;

    public Worker() {
    }

    public Worker(String ID, String name, int workedDays, int salary,int overtime) {
        super(ID, name, workedDays, salary);
        this.overtime = overtime;
    }

    @Override
    protected void accept() {
        System.out.println("Nhập thông tin của Worker :");
        super.accept(); 
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Nhập OverTime :");
            overtime=sc.nextInt();
            if(overtime>0){
                break;
            }
            System.out.println("Vui lòng nhập OverTime >0");
        }
        
    }
    
    
    
    @Override
    public void printinfo() {
        System.out.println("ID : "+ID);
        System.out.println("Name : "+name);
        System.out.println("Worked Days : "+workedDays);
        System.out.println("Salary : "+salary);
        System.out.println("Over Time : "+overtime);
        System.out.println("Income : "+getIncome());
    }

    @Override
    public float getAllowance() {
        return 0;
    }

    

    public float MonthSalary(){
        return salary*(workedDays+overtime*2)/26;
    }
    @Override
    public float getTax() {
        if(MonthSalary()<400)
            return 0;
        else 
            return MonthSalary()*INCOME_TAX_PERC;
    }
    
    @Override
    public float getIncome() {
        return MonthSalary()-getTax();
    }

    @Override
    public String toString() {
        return String.format("ID : %s -Name : %s -WorkedDays : %d days -Salary : %d $ -Overtime : %d days -Allowance : %f -Tax : %f -Income : %f",ID,name,workedDays,salary,overtime,getAllowance(),getTax(),getIncome());
    }

   
    
    
}
