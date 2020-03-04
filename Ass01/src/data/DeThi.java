/*
    Đề thi 
 */
package data;
import java.util.*;

public class DeThi {
    Scanner sc=new Scanner(System.in);
    public int mark=0;
    public boolean ansE,ansA,ansM,ansG;
    public boolean checkE = false;
    public boolean checkA = false;
    public boolean checkM = false;
    public boolean checkG = false;
    
    
    void ETest(){        
        if(checkE){
            System.out.println("Bạn đã trả lời câu này !!! Vui lòng trả lời câu khác");            
        }
        else{
            checkE=true;
        
            System.out.println("== Đề thi English ==");
            System.out.println("1. Rhythm nghĩa là giai điệu ? [ Yes / No ]");
            ansE=sc.nextLine().trim().equalsIgnoreCase("Yes");
            if(ansE){
                System.out.println("Bạn đã trả lời chính xác");      
                mark+=10;
            }
            else{
                System.out.println("Bạn đã trả lời sai rồi nhé !!");
            }
        }
        
        
    }
    
    void ATest(){
        if(checkA){
            System.out.println("Bạn đã trả lời câu này !!! Vui lòng trả lời câu khác");            
        }
        else{
            checkA=true;

            System.out.println("== Đề thi Aptitute ==");
            System.out.println("2. Teamleader có phải là 1 kỹ năng hay không ? [ Yes / No ]");
            ansA=sc.nextLine().trim().equalsIgnoreCase("Yes");
            if(ansA){
                System.out.println("Bạn đã trả lời chính xác");     
                mark+=10;
            }
            else{
                System.out.println("Bạn đã trả lời sai rồi nhé !!");
            }
        }
    }
    
    void MTest(){
        if(checkM){
            System.out.println("Bạn đã trả lời câu này !!! Vui lòng trả lời câu khác");
        }
        else{
            checkM=true;

            System.out.println("== Đề thi Mathematics ==");
            System.out.println("3. 5*5=10 ? [ Yes / No ]");
            ansM=sc.nextLine().trim().equalsIgnoreCase("No");
            if(ansM){
                System.out.println("Bạn đã trả lời chính xác");     
                mark+=10;
            }
            else{
                System.out.println("Bạn đã trả lời sai rồi nhé !!");
            }
        }
    }
    
    void GTest(){
        if(checkG){
            System.out.println("Bạn đã trả lời câu này !!! Vui lòng trả lời câu khác");
        }
        else{
            checkG=true;

            System.out.println("== Đề thi General Knowledge ==");
            System.out.println("4. Cá heo là 1 loài cá ? [ Yes / No ]");
            ansG=sc.nextLine().trim().equalsIgnoreCase("No");
            if(ansG){
                System.out.println("Bạn đã trả lời chính xác");   
                mark+=10;
            }
            else{
                System.out.println("Bạn đã trả lời sai rồi nhé !!");
            } 
        }
    }
}
