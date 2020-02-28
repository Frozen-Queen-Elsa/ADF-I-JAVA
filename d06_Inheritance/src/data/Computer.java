/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.*;

public class Computer {
    public String id, desc;
    public int price;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        id=sc.nextLine().trim();
        System.out.println("Nhập mô tả: ");
        desc=sc.nextLine().trim();
        System.out.println("Nhập giá: ");
        price=Integer.parseInt(sc.nextLine().trim());
    }
    
    @Override
    public String toString(){
        return String.format("%s - %s - %d",id,desc,price);
    }
            
}
