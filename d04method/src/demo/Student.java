
package demo;

import java.util.Scanner;


/**
 *
 * @author Iris
 */
public class Student {

    String name, id, batch;
    int mark;

    public Student() {
        name="Dung";
        id="SV01";
        batch="1907-M0";
        mark=100;
    }

    public Student(String name, String id, String batch, int mark) {
        this.name = name;
        this.id = id;
        this.batch = batch;
        this.mark = mark;
    }
    
    
    
    
    void input(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập id: ");
        id=sc.nextLine();
        
        System.out.println("Nhập ten: ");
        name=sc.nextLine();
        
        System.out.println("Nhập ma lop: ");
        batch=sc.nextLine();
        
        System.out.println("Nhập diem ket qua: ");
        mark=sc.nextInt();
    }
    
    void output(){
        System.out.println("Thong tin sinh vien :");       
        System.out.println("Ten SV : "+name);
        System.out.println("Id : "+id);
        System.out.println("Ma Lop : "+batch);
        System.out.println("Diem : "+mark);
        System.out.println();
    }
    
 
}
