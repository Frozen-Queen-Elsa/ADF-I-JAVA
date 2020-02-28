/*
    Đây là 1 lớp cha tổng quát,
    Khai báo cách tính diện tích,chu vi của 1 đối tượng hình học 2D bất kỳ

 */
package basic;


public abstract class Shape {
    public static  final float PI=3.1415f;
    
    public abstract float area();
    public abstract float perimeter();
    
    @Override
    public String toString(){
        return String.format("Diện tích : %8.2f, Chu vi : %8.2f",area(),perimeter());
    }
}
