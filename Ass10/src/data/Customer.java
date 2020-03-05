/*
- Fields ID, name,address,bonus
- No-arg / parametter constructor to initialise the above fields.
- Method
- void accept() : allow user input data into data fields.
Using try-catch exception for validation: ID, name is not null. bonus must be greater than zero and less than 1000.
toString() : return a string presenting all the details of a customer
 */
package data;

import java.util.Scanner;


public class Customer {
    public String id,name,address;
    public int bonus;

    public Customer() {
    }

    public Customer(String id, String name, String address, int bonus) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bonus = bonus;
    }
    
    public void accept(){
        
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Nhập ID : ");
            try{
                id=sc.nextLine().trim();
                if(id.length()>0){
                    break;
                }
                throw new ClassFormatError("ID không hợp lệ !! ID is not null !!");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
        }
        
        while(true){
            System.out.println("Nhập Têm : ");
            try{
                name=sc.nextLine().trim();
                if(name.length()>0){
                    break;
                }
                throw new ClassFormatError("Name không hợp lệ !! Name is not null !!");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
        }
        System.out.println("Nhập Địa Chỉ : ");address=sc.nextLine().trim();
        while(true){
            System.out.println("Nhập Bonus [1-999]: ");bonus=sc.nextInt();
            try{
                if(bonus<1000&&bonus>0){
                break;
            }
            throw new ClassFormatError("Bonus không hợp lệ !! Bonus [1-999]");
            }catch(Exception e){
                System.out.println("Lỗi nhập sai dữ liệu xin vui lòng nhập lại");
                System.out.println("Loi he thong: " + e.getMessage());
            }
            
        }
    }

    @Override
    public String toString() {
        return String.format("ID : %s \nName : %s \nAddress : %s \nBonus : %d\n",id,name,address,bonus);
    }
    
    
    
}
