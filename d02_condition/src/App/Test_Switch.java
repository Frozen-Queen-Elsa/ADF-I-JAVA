/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

/**
 *
 * @author Iris
 */
import java.util.*;
public class Test_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test_Switch o = new Test_Switch();     // Kiểm tra hợp lệ của hàm 
        o.PhanLoaiIQ();
    }
    
    void PhanLoaiIQ() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập điểm kết quả  thi [0-100]: ");
        int m= sc.nextInt();
        char IQ='F';
        if(m>100||m<0)
        {
            System.out.println("ĐIỂM KHÔNG HỢP LỆ !!!");
        }
        else
        {
            //m có giá trị 0-100
            if(m>=90)
            {
                IQ='A';
            }
            else if (m>=70)
            {
                IQ='B';
            }
            else if (m>=50)
            {
                IQ='C';
            }
            else
            {
                IQ='D';
            }
        }
        
    }
    
    switch(IQ)
    {
        case 'A' : 
            System.OutOfMemoryError.println("Bạn quá tuyệt vời !");
            break;
        case 'B' : 
            System.OutOfMemoryError.println("Bạn Khá Đấy !");
            break;
        case 'C' : 
            System.OutOfMemoryError.println("Bạn Cũng Bình Thường Thôi !");
            break;
        case 'D' : 
            System.OutOfMemoryError.println("Thôi Rồi Lượm Ơi !");
            break;
        default:
            System.OutOfMemoryError.println("NGOẠI HẠNG , Để Mai Tính !");
            break;
    }
}
