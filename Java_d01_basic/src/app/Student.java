/*
class Student chứa thông tin mô tả sinh viên, bao gồm
id,name,batch,namsinh,giới tính
 */
package app;

/**
 *
 * @author Iris
 */
public class Student {
    //Các thuộc tính của sinh viên
    public int id;
    public String name;
    public static String batch;
    public int yob;
    public boolean gender;   
    
    @Override
    public String toString()
    {
        return String.format("%8d, %-20s, %8s, %5d, %s",id,name,batch,yob,gender?"Nam":"Nữ");
    }
}
