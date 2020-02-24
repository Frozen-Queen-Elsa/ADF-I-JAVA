/*
    Lả lớp kiểm thử các đối tượng Student
 */
package app;

/**
 *
 * @author Iris
 */


   
    public class TestStudent
    {
        public static void main(String[] args) 
        {
            //Khởi tạo mã lớp học cho các sv thuộc class Student
            Student.batch="T1-1907-M0";
            
            //Tạo đối tượng là sinh viên thứ  và cấp phát bộ nhớ bằng toán tử new
            Student sv1=new Student();
            sv1.id=10001;
            sv1.name="Seo Yuhyun";
            sv1.yob=1992;
            sv1.gender=false;
            
            Student sv2=new Student();
            sv2.id=10002;
            sv2.name="Kim Taeyeon";
            sv2.yob=1990;
            sv2.gender=false;
            
            //In ra thông tin của sv1,sv2
            System.out.printf("id=%d, name=%s, batch=%s, year of birth:%d \n",sv1.id,sv1.name,Student.batch,sv1.yob);
            System.out.printf("id=%d, name=%s, batch=%s, year of birth:%d \n",sv2.id,sv2.name,Student.batch,sv2.yob);
                
            //In ra giá trị của đối tượng sv1 và sv2
            System.out.println("====");
            System.out.println(sv1);
            System.out.println(sv2);
        }
    }
    

