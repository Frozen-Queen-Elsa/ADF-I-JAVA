/*
    i. Fields: id , owner, address, width (float, >0), length (float, >0)
ii. Constructors: no-arg, parameterize
iii. Phương thức:
1. private void input() : nhập dữ liệu cho 1 căn hộ - được gọi trong hàm dựng không tham số.
2. public void print() : xuất thông tin chi tiết của căn hộ bao gồm : id, owner, address, width, length, area (diện tích), peripheral (chu vi)
3. public boolean isSquare(), trả về true nếu chiều dài và rộng của căn hộ là bằng nhau.
4. public float getArea() : trả về diện tích căn hộ
5. public float getPeripheral() : trả về chu vi căn hộ
6. String toString(): biểu diễn đối tượng Apartment dưới dạng chuỗi
 */
package data;

import java.util.Scanner;


public class Apartment {
    public String id,owner,address;
    public float width,length;

    public Apartment() {
    }

    public Apartment(String id, String owner, String address, float width, float length) {
        this.id = id;
        this.owner = owner;
        this.address = address;
        this.width = width;
        this.length = length;
    }
    
    private void input(){
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("Nhập ID ");
            id=sc.nextLine().trim();
            if(id.length()>0) break;
            System.out.println("ID is not NULL");
        }
        
        while(true){
            System.out.println("Nhập Owner ");
            owner=sc.nextLine().trim();
            if(owner.length()>0) break;
            System.out.println("Owner is not NULL");
        }
        while(true){
            System.out.println("Nhập Address");
            address=sc.nextLine().trim();
            if(address.length()>0) break;
            System.out.println("Address is not NULL");
        }
        
        
        while(true){
            System.out.println("Nhập Width ");
            width=sc.nextFloat();
            if(width>0) break;
            System.out.println("Width must be larger than 0");
        }
        
        while(true){
            System.out.println("Nhập Length ");
            length=sc.nextFloat();
            if(length>0) break;
            System.out.println("Length must be larger than 0");
        }
    }
    
    public void getInput(){
        input();
    }
    
    public float getArea(){
        return width*length;
    }
    
    public float getPeripheral(){
        return (width+length)*2;
    }
    
    public void print(){
        System.out.println("\n>>Thông tin căn hộ<<");
        System.out.println("ID       : "+id);
        System.out.println("Owner    : "+owner);
        System.out.println("Address  : "+address);
        System.out.println("Width    : "+width);
        System.out.println("Length   : "+length);
        System.out.println("Area     : "+getArea());
        System.out.println("Parameter: "+getPeripheral());
    }
    
    public boolean isSquare(){
        return (width==length)?true:false;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %.2f - %.2f - %.2f - %.2f",id,owner,address,width,length,getArea(),getPeripheral());
    }
    
    
}
