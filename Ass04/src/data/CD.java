/*
Tạo Java Class CD, mô tả cấu trúc 1 dĩa CD như sau: i. Dữ liệu (fields – variable): id, title, type, price, year
ii. Hàm dựng (constructors):
1. Không tham số CD() , gọi hàm input()
2. Có tham số CD(String, String, String, int, int)
iii. Phương thức:
1. void input() : cho phép nhập dữ liệu vô các fields của 1 đối tượng CD. Lưu ý: type chỉ nhận giá trị Audio, hoặc Video
2. void print() : cho phép xuất thông tin chi tiết của 1 CD
c.
 */
package data;

import java.util.Scanner;


public class CD {
    public String id,title,type;
    public int price,year;

    public CD() {
    }

    public CD(String id, String title, String type, int price, int year) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.price = price;
        this.year = year;
    }
    
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập id : "); id=sc.nextLine().trim();
        System.out.println("Nhập title :"); title=sc.nextLine().trim();
        while(true){
            System.out.println("Nhập Type [Audio/Video]");
            type=sc.nextLine().trim();
            if(type.equalsIgnoreCase("Audio")||type.equalsIgnoreCase("Video")){
                break;
            }
        }
        System.out.println("Nhập price :");
        price=sc.nextInt();
        System.out.println("Nhập year :");
        year=sc.nextInt();        
    }
    
    void print(){
        System.out.println(">>Thông tin đĩa CD<<");
        System.out.println("ID : "+id);
        System.out.println("Title : "+title);
        System.out.println("Type : "+(type.equalsIgnoreCase("Audio")?"Audio":"Video"));
        System.out.println("Price : "+price);
        System.out.println("Year : "+year);
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d - %d", id,title,type,price,year);
    }
    
    
}
