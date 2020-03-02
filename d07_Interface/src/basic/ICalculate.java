/*
    Đây là Interface , Khai báo các phương thức tính lương
 */
package basic;

public interface ICalculate {
    public int getSalary();
    public int getAllowance();
    
    
    //Khai báo hệ số tăng ca
    public static final int OT = 3;
    
    //Khai báo số ngày làm chuẩn trong tháng của nhân viên văn phòng
    public static final int days = 24;
}
