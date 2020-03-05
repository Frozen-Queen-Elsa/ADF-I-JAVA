/*
- Private Field [level]: int
- Constructors to initialize the all fields.
- Override methods:
- proctected void accept() : allow user to input all details for an egineer. (Hint: invoke super.accept() ) - validation: level >= 1 and <= 4
- public float getAllowance(): level = 1 => allownce= 400, level = 2 => allownce= 600 level = 3 => allownce= 1000,level = 4 => allownce= 2000
- public float getTax(): monthly sal = salary * worked days /24 + allowance ; tax = monthly sal * income tax percent
- public float getIncome(): monthly sal – tax
- public void printInfo() : print the pay slip of a worker
- public String toString() : return a string presenting all details of an engineer
 */
package data;

import java.util.Scanner;
public class Engineer extends Employee implements ISalary,ITaxable{
    private int level;

    public Engineer() {
    }

    public Engineer(String ID, String name, int workedDays, int salary,int level) {
        super(ID, name, workedDays, salary);
        this.level = level;
    }

    @Override
    protected void accept() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập thông tin của Engineer");
        super.accept(); 
        while(true){
            System.out.println("Nhập Level : ");
            level=sc.nextInt();
            if(level>=1 && level<=4)
                break;
            System.out.println("Nhập level trong khoảng [1-4]");
        }
    }

    
    
    @Override
    public void printinfo() {
        System.out.println("ID : "+ID);
        System.out.println("Name : "+name);
        System.out.println("Worked Days : "+workedDays);
        System.out.println("Salary : "+salary);
        System.out.println("Level: "+level);
        System.out.println("Income : "+getIncome());
    }

    @Override
    public float getAllowance() {
        float allowance = 0;
        switch(level){
            case 1:
                allowance= 400f;
            case 2:
                allowance= 600f;
            case 3:
                allowance= 1000f;
            case 4:
                allowance= 2000f;
        }
        return allowance;
    }

    float MonthSalary(){
        return salary*workedDays/24+getAllowance();
    }
    
    @Override
    public float getIncome() {
        return MonthSalary()-getTax();
    }

    @Override
    public float getTax() {
        return MonthSalary()*INCOME_TAX_PERC;
    }
    
    @Override
    public String toString() {
        return String.format("ID : %s -Name : %s -WorkedDays : %d days -Salary : %d $ -Lvel : %d -Allowance : %f -Tax : %f -Income : %f",ID,name,workedDays,salary,level,getAllowance(),getTax(),getIncome());
    }
    
}
