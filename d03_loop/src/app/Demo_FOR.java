/*
    Ví dụ về vòng lặp for
 */
package app;

/**
 *
 * @author Iris
 */

import java.util.*;
public class Demo_FOR 
{
    
    public static void main(String[] args) 
    {
        Demo_FOR o = new Demo_FOR();   //Tạo 1 object trong class Demo_For để xử lý hàm TestFor
        o.TestFor();
        o.inDS();
        o.inDS2();
    }
    
    void TestFor()
    {
        //Chương trình in bảng cửu chương N
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập 1 số nguyên : ");
        int n = sc.nextInt();
        
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