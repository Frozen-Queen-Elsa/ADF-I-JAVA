/*
- Fields ID, name, yob
- Default constructor to initialize the above fields.
- Method
- public void accept() : allow user input data into data fields.
Using try-catch exception for validation: ID, name not null- yob must be in range [1940-2000] .
- public abtract void printInfo() : print details of an person.
 */
package data;

import java.util.Scanner;


public abstract class Person {
    public String id,name;
    public int yob;

    public Person() {
    }

    public Person(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }
    
    public void accept(){
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("Nhập ID : ");
            id=sc.nextLine().trim();
            if(id.length()>0) break;
            System.out.println("ID is not NULL !!!");
        }
        
        while(true){
            System.out.println("Nhập Tên : ");
            name=sc.nextLine().trim();
            if(name.length()>0) break;
            System.out.println("NAME is not NULL !!!");
        }
        
        while(true){
            System.out.println("Nhập Year Of Birth : ");
            yob=sc.nextInt();
            if(yob>=1940&&yob<=2000) break;
            System.out.println("YoB in range [1940-2000] !!!");
        }
    }
    
    public abstract void prinInfo();
}
