/*
    Bank Account
 */
package Bank;
import java.util.*;
public class Account {
    Scanner sc=new Scanner(System.in);
    public String accNo;
    public int balance;

    public Account() {
        accNo="Acc01";
        balance=100;
    }

    public Account(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    
   
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập thông tin tài khoản");
        System.out.println("Mời bạn nhập số tài khoản");
        accNo=sc.nextLine().trim();
        System.out.println("Mời bạn nhập số dư ban đầu");
        balance=sc.nextInt();
    }
    
    public void deposit(int amount){
        if(amount<100){
            System.out.println("Xin vui lòng nhập số tiền ít nhất là 100$ !!!");
        }
        else{
            balance += amount;
            System.out.println("Bạn đã gửi vào ngân hàng %d $"+amount);
        }
    }
    
    public void withdraw(int amount){
        if(amount>=100 && amount<=balance){
            balance -= amount;
            System.out.println("Bạn đã rút từ ngân hàng %d $"+amount);
        }
        if(amount>balance){
            System.out.println("Số dư trong tài khoản không đủ đề thực hiện giao dịch");
        }
        else{
            System.out.println("Số tiền tối thiểu để rút là 100$");
        }
    }
    
    public int getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Account : %s - Số dư : %d $", accNo,balance);    }
    
    
            
}
