/*
i. Fields : id, name, gender(boolean), theory[0-100], practice [0-100]
ii. Constructors: no-arg constructor , parameterize constructor
iii. Methods:
1. private void input() : nhập thông tin sinh viên, được gọi trong hàm dựng không tham số
2. public void print() : xuất thông tin sinh viên
3. public String toString(): biểu diễn đối tượng sinh viên dưới dạng chuỗi bao gồm : Id, name, (male/female), theory, practice, average
 */
package data;

import java.util.Scanner;

public class Student {
    public String id,name;
    public boolean gender;
    public int theory,practice;    
    public Student() {
    }

    public Student(String id, String name, boolean gender, int theory, int practice) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.theory = theory;
        this.practice = practice;
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println(">>Nhập thông tin sinh viên<<");
        System.out.println("Nhập ID :");id=sc.nextLine().trim();
        System.out.println("Nhập tên :");name=sc.nextLine().trim();
        System.out.println("Nhập giới tính [Nam/Nữ]");gender=sc.nextLine().trim().equalsIgnoreCase("Nam");
        //Nhập theory
        while(true){
            System.out.println("Nhập theory [0-100]:");
            theory=sc.nextInt();
            if(theory>=0&&theory<=100){
                break;
            }
            System.out.println("Vui lòng nhập lại giá trị [0-100]");
        }
        //Nhập practice
        while(true){
            System.out.println("Nhập practice [0-100]:");
            practice=sc.nextInt();
            if(practice>=0&&practice<=100){
                break;
            }
            System.out.println("Vui lòng nhập lại giá trị [0-100]");
        }        
    }
    public int getAverage(){
        return (theory+practice)/2;
    }
    public void print(){
        System.out.println("Thông tin Sinh Viên<<");
        System.out.println("ID       : "+id);
        System.out.println("Name     : "+name);
        System.out.println("Gender   : "+(gender?"Nam":"Nữ"));
        System.out.println("Theory   : "+theory);
        System.out.println("Practice : "+practice);
        System.out.println("Average  : "+getAverage());
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d - %d -%d",id,name,(gender?"Nam":"Nữ"),theory,practice,getAverage());
    }
    
    
}
