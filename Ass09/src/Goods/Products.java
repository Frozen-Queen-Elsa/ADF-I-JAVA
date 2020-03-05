/*
- Protected Fields id, name
- Public constructor to initialise the above fields.
- Method:
- Protected void accept() : allow user input data into data fields.
- Public abstract void printInfo() : abtract method used to print details of an product.
 */
package Goods;

import java.util.Scanner;


public abstract class Products {
    protected String id,name;

    public Products() {
    }

    public Products(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    protected void accept(){
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Nhập ID : ");
            id=sc.nextLine().trim();
            if(id.length()>0) break;
            System.out.println("ID is not null !!!");
        }
        while(true){
            System.out.println("Nhập Tên : ");
            name=sc.nextLine().trim();
            if(name.length()>0) break;
            System.out.println("Name is not null !!!");
        }
    }
    
    public abstract void printinfo();

    @Override
    public String toString() {
        return String.format("%s - %s",id,name);
    }
    
    
}
