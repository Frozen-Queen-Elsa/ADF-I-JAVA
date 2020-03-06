/*
- Protected Fields: id, name, yob(year of birth)
- Constructors to initialise the all fields.
- Methods:
public abstract void print()
public void input (): input data for a student with following constraints:
• ID, name is not null
• Age must be between 15 and 60
 */
package basic;

import java.time.Year;
import java.util.*;

public abstract class Student {
    protected String id,name;
    protected int yob;

    public String getid(){
        return id;
    }
    
    
    public Student() {
    }

    public Student(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }
    
    
    public int getAge(){
        int year = Year.now().getValue();
        return year-yob;
    }
    
    public abstract void print();
    public void input(){
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
            if(getAge()>15&&getAge()<60) break;
            System.out.println("Ypur age must be [15-60] !!! Your age is "+getAge());
        }
    }
    
}
