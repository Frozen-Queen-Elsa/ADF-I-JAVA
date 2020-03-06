/*
- Fields: theoryMark, practiceMark, project.
- Constructors to initialise the all fields.
- public float getFinal() : return the final mark that calculated by formula : (theoryMark*2 + practiceMark + project*3)/6
- Override methods :
input(): allow user input more data into data fields theoryMark, practiceMark, project. Using try-catch exception for data validation: marks must be between 0 and 100
print():display detailed information of a student, including final mark.
 */
package basic;

import java.util.Scanner;


public class StudentFPT extends Student{
    public int theoryMark,practiceMark,project;

    public StudentFPT() {
    }

    public StudentFPT(String id, String name, int yob,int theoryMark, int practiceMark, int project) {
        super(id, name, yob);
        this.theoryMark = theoryMark;
        this.practiceMark = practiceMark;
        this.project = project;
    }
    
    public float getFinal(){
        return(theoryMark*2+practiceMark+project*3)/6;
    }

    @Override
    public void input() {  
        Scanner sc=new Scanner(System.in);
        super.input(); 
        //Nhập Theory Mark
        while(true){            
            System.out.println("Nhập theory Mark [0-100]:");
            try{
                theoryMark=sc.nextInt();
                if(theoryMark>=0 &&theoryMark<=100) break;
                System.out.println("Theory Mark must be belong to [0-100]");
           
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
        }
        //Nhập Practice Mark
        while(true){
            System.out.println("Nhập practice Mark [0-100]:");
            try{
                practiceMark=sc.nextInt();
                if(practiceMark>=0 &&practiceMark<=100) break;
                System.out.println("Practice Mark must be belong to [0-100]");
           
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
        }
        //Nhập Project
        while(true){
            System.out.println("Nhập Project [0-100]:");
            try{
                project=sc.nextInt();
                if(project>=0 &&project<=100) break;
                System.out.println("Project must be belong to [0-100]");
           
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
        }
    }

    
    
        @Override
    public void print() {
        System.out.println("\n>>Thông tin Employee<<");
        System.out.println("ID            : "+id);
        System.out.println("Name          : "+name);
        System.out.println("Age           : "+getAge());
        System.out.println("Theory Mark   : "+theoryMark);
        System.out.println("Practice Mark : "+practiceMark);
        System.out.println("Project       : "+project);    
        System.out.println("Final Mark    : "+getFinal());
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d - %d - %d - %d - %f",id,name,getAge(),theoryMark,practiceMark,project,getFinal());
    }
    
    
    
    
    
}
