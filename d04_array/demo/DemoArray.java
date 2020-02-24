
package demo;


public class DemoArray {

   
    public static void main(String[] args) {
        // TODO code application logic here
        DemoArray o =new DemoArray();
        o.vidu1();
        
    }
    
    void vidu1(){
        //Khai báo 1 mảng số nguyên chứa 10 phần tử - Đặt tên cho mảng là so_nguyento
        int [] so_nguyento;
        
        //Cấp phát bộ nhớ cho mảng
//        so_nguyento = new int[10];
//        
//        //Khởi tạo giá tri cho 10 pha627n tử của mảng này
//        so_nguyento[0]=2;
//        so_nguyento[1]=3;
//        so_nguyento[2]=5;
//        so_nguyento[3]=7;
//        so_nguyento[4]=11;
//        so_nguyento[5]=13;
//        so_nguyento[6]=17;
//        so_nguyento[7]=19;
//        so_nguyento[8]=23;
//        so_nguyento[9]=29;
        
        so_nguyento=new int[]{2,3,5,7,11,13,17,19,23,29};
        System.out.println("Cách 1 ");
        System.out.println("Các số nguyên tố đầu tiên:");
        
        for(int i=0;i<10;i++){
            System.out.printf("%3d",so_nguyento[i]);
        }
        
        System.out.println("\nCách 2 ");
        for(int i=0;i<so_nguyento.length;i++){    //so_nguyento.length trả về số phần tử trong mảng
            System.out.printf("%3d",so_nguyento[i]);
        }
        
        System.out.println("\nCách 3 ");
        for(int number:so_nguyento){
            System.out.printf("%3d",number);
        }
    }
}
