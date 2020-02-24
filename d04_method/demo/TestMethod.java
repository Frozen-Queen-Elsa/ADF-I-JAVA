
package demo;

/**
 *
 * @author Iris
 */
public class TestMethod {

    void add(int...x){
        int tong=0;
        for(int i:x){
            tong+=i;
        }
        System.out.println("Tong so : "+tong);
    }
    
    void add(float x,float y){
        float kq=x+y;
        System.out.printf("%f+%f=%f\n",x,y,kq);
        x=x*2;
        y=y+10;
    }
    
    void add(){
        System.out.println("Test ham so ");
    }
    
    void add(String s1,String s2){
        System.out.println(s1+s2);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TestMethod o = new TestMethod();
        o.add(10,20,30);
        o.add(3,28,9,12,90,78);
    }
    
}
