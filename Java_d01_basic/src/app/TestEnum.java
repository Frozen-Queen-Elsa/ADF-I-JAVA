/*
Test kiểu Enum
 */
package app;

/**
 *
 * @author Iris
 */


public class TestEnum {

    enum Direction {East,West,South,North};
    
    public static void main(String[] args) {
        System.out.println("Test Case Enumeration :");
        System.out.println("Phia Tay : " + Direction.West);
    }
    
}
