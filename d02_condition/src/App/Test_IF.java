/*
Test Case cho cấu trúc lập trình If-Else
 */
package App;

    
/**
 *
 * @author Iris
 */

import java.util.*; //Những thư viện chứa class Scanner

public class Test_IF {

   
    public static void main(String[] args) {
        Test_IF o=new Test_IF();
        o.KiemTraNamNhuan();
    }
    
    //Viết hàm kiểm tra năm nhuận
    void KiemTraNamNhuan()
    {
        //Khai báo biến đối trượng sc để thực hiện chức năng nhập dữ liệu
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập năm muốn kiếm tra: ");
        int year=sc.nextInt();
        
        //Kiểm tra giá trị của biến year
        if( (year%4==0 && year%100!=0) || (year%400==0) )
        {
            System.out.printf("%d la nam nhuan \n", year);
        }
        else
        {
            System.out.printf("%d KO PHẢI là năm nhuận \n",year);
        }
        
    }
}
