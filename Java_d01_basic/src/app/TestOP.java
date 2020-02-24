/*
Test các phép toán 
 */
package app;

/**
 *
 * @author Iris
 */
public class TestOP {

    
    public static void main(String[] args) {
        //Test giá trị phép toán ++
        int x=10,y=20;
        System.out.println("== Trước phép toán ++ ==");
        System.out.printf("x= %d \n", x);
        System.out.printf("y= %d \n", y);
        
        int z=++x;  //x=x+1; z=x;
        int w=y++;  //w=y; y=y+1;
        System.out.println("== Sau phép toán ++ ==");
        System.out.printf("x= %d \n", x);
        System.out.printf("y= %d \n", y);
        System.out.printf("z= %d \n", z);
        System.out.printf("w= %d \n", w);
        
        
        //Test phép toán luận lý nhị phân (bitwise logical)
        x=34;y=23;
        z=x&y;
        w=x|y;
        System.out.println("\n== Test phép toán Bitwise ===");
        System.out.printf("%d & %d= %d \n",x,y,z);
        System.out.printf("%d | %d= %d \n",x,y,w);
        System.out.printf("%d ^ %d= %d \n",x,y,x^y);
       
        System.out.printf("%d /%d =%d \n", x,y,x/y);
        System.out.printf("%d /%d =%f \n", x,y,(float)x/y);
    }
    
}
