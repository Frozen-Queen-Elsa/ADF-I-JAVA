/*
    Asignment 01
 */
package data;
import java.util.*;

public class IQTest {

    
    public static void main(String[] args) {
        IQTest o=new IQTest();
        o.menu();
    }
    
    void menu(){
        Scanner sc=new Scanner(System.in);
        DeThi dt=new DeThi();
        int opt;
        while(true){
            System.out.println("\nMENU");
            System.out.println("Đề Thì Kiểm Tra IQ");
            System.out.println("1. Đề Thi English");
            System.out.println("2. Đề Thi Aptitute");
            System.out.println("3. Đề Thi Mathematics");
            System.out.println("4. Đề Thi General Knowledge");
            System.out.println("5. Kết thúc và tính IQ {Chỉ khi bạn đã trả lời đủ 4 câu hỏi)");
            System.out.print("Vui lòng chọn số từ [1-5] : ");
            opt=sc.nextInt();
            
            switch(opt){
                case 1:
                    dt.ETest();
                    break;
                case 2:
                    dt.ATest();
                    break;
                case 3:
                    dt.MTest();
                    break;
                case 4:
                    dt.GTest();
                    break;
                case 5:
                    if(!dt.checkA || !dt.checkE || !dt.checkG || !dt.checkM){
                        System.out.println("Bạn chưa trả lời đủ 4 câu hỏi !! ");
                        System.out.println("Xin trả lời đủ 4 câu hỏi trước khi tính kết quả !!");
                        break;
                    }
                    else{
                        if(dt.mark==20){
                            dt.mark+=2;
                            System.out.println("Your mark is "+dt.mark);
                            System.out.println("Your IQ is average !!");
                        }
                        if(dt.mark==30){
                            dt.mark+=5;
                            System.out.println("Your mark is "+dt.mark);
                            System.out.println("You are inteligent");
                        }
                        if(dt.mark==40){
                            dt.mark+=10;
                            System.out.println("Your mark is "+dt.mark);
                            System.out.println("You are a genius");
                        }
                        else{
                            System.out.println("Your mark is "+dt.mark);
                            System.out.println("Your IQ id below average !!");
                        }
                        return;
                    }
                default:
                    System.out.println("Vui lòng nhập số [1-5]");
                    break;
            }
            
        }
        
        
    }
    
}
