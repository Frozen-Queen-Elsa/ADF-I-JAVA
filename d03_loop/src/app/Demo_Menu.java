/*
    Kiểm tra cấu trúc vòng lặp while , do while
 */
package app;

import java.util.Scanner;

/**
 *
 * @author Iris
 */
public class Demo_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Demo_Menu o= new Demo_Menu();
        o.Menu();
    }
    
    //Thiết kế menu cho phép chọn chức năng muốn chạy trong chương trình 
    void Menu()
    {
        Scanner sc=new Scanner(System.in);
        String op ="";
        do
        {
            System.out.println("\n >>Menu<<");
            System.out.println("1. In bảng cửu chương");
            System.out.println("2. In danh sách sinh viên [For-i]");
            System.out.println("3. In danh sach sinh vien [For-Each]");
            System.out.println("4. Dừng chương trình");
            System.out.println(" Vui lòng chọn chức năng từ [1-4]: ");
            op=sc.nextLine();   //Cho user nhập 1 chuỗi và lưu giá trị vô option
            
            switch(op)
            {
                case "1":TestFor();break;
                case "2":inDS();break;
                case "3":inDS2();break;
                case "4":
                    System.out.println("Cám ơn bạn đã sử dụng chương trình của tôi !!");
                    return;   //Dừng hàm Menu()
                default:
                    System.out.println("Chọn sai chức năng rồi !!!");
                    break;
            }
        }
        while(true);
    }
    
    
    void TestFor()
    {
        //Chương trình in bảng cửu chương N
        Scanner sc = new Scanner(System.in);
        
        int n=0;
        while(true)
        {
            System.out.println("Vui lòng nhập 1 số nguyên [2-9]: ");
            n = sc.nextInt();
            if(n>=2&&n<=9)
            {
                break;  //Thoát khỏi vòng lặp nếu n là 1 giá trị đúng !
            }
            System.out.println("Giá trị ko hợp lệ !!! Vui lòng nhập lại !!!");
        }

        System.out.println("== Bảng cửu chương "+ n + "==");
        for (int i = 0; i < 10; i++) 
        {
             System.out.printf("%2d * %2d =%3d \n", n,i,n*i);
        }        
    }
    
    //Khai báo 1 mảng chứa danh sách tên các sinh viên
    String[] ds = {"Seohyun","Taeyeon","Yoona","Jessica","TIffany","Sunny","Hyoyeon","Yuri","Sooyoung"};
    void inDS()
    {
        System.out.println("\n>> Bảng danh sách sinh viên <<");
        for (int i = 0; i < ds.length; i++) 
        {
            System.out.printf("%s  ",ds[i]);
        }
        System.out.printf("\nTổng cộng %d sinh viên \n",ds.length);
    }
    
    void inDS2()
    {
        System.out.println("\n>> Bảng danh sách sinh viên <<");
        for (String tenSV : ds) {
            System.out.println(tenSV);
        }        
        System.out.printf("Tổng cộng %d sinh viên \n",ds.length);
    }

}
