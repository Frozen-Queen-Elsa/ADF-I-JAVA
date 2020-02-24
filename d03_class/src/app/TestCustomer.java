/*
    Test Customer
 */
package app;

/**
 *
 * @author Iris
 */
public class TestCustomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1= new Customer();
        c1.accept();
        c1.display();
        
        Customer c2= new Customer();       
        c2.display();
        
        Customer c3= new Customer("C03","Taeyeon","taeyeon@gmail.com",1990, false);
        c3.display();
    }
    
}
