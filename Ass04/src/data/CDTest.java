
/*
Tạo Java Main Class CDTest, để thực hiện chức năng quản lý hệ thống kho dữ liệu CD, có nội dung như sau:
i. Dữ liệu (fields – variable): - cdList (mảng chứa CD), - counter (biến đếm số lượng dĩa CD hiện đang lưu trữ trong danh sách cdList), - max (hằng, kích thước tối đa của mảng cdList).
ii. Hàm dựng không tham số: khởi tạo mảng cdList (có kích thước theo hằng max), và reset biến counter về 0
iii. Phương thức (Methods):
1. void add(): thêm 1 CD mới vô cdList, nếu mảng không còn chổ trống in ra thông báo lỗi.
2. void search(String cid): tìm kiếm CD trong danh sách theo mã số (cid) và in chi tiết cúa CD đó ra nếu tìm thấy, ngược lại thông báo lỗi.
3. void displayAll (): In ra bảng danh sách các CD đang lưu trữ trong kho. Lưu ý sẽ in thông báo lỗi nếu kho chưa có dữ liệu
4. void menu (): xây dựng hệ thống thực đơn cho phép thêm, tìm kiếm và in danh sách các CD có trong kho.
5. static void main (): tạo 1 đối tượng kiểu CDTest, gọi phương thức menu() trên đối tượng này để thi hành chương trình.
 */
package data;
import java.util.*;

public class CDTest {
    
    int max=10;
    int counter=0;
    CD[] cdlist;

    public CDTest() {
        int max=10;
        int counter=0;
        cdlist=new CD[max];
    }

    public CDTest(int max, int counter, CD[] cdlist) {
        this.max = max;
        this.counter = counter;
        this.cdlist = cdlist;
    }
    
    public void add(){
        if(counter==max){
            System.out.println("Hệ thống hết chỗ lưu trữ . Từ chối thêm CD mới");
            return;
        }
        CD cd=new CD();
        cd.input();
        
        cdlist[counter]=cd;
        counter++;
    }
    
    public void search(String cid){
        if(counter==0){
            System.out.println("Hệ thống chưa có dữ liệu !!!");
            return;
        }
        
        int cntid=0;
        for(int i=0;i<counter;i++){
            if(cdlist[i].id.equalsIgnoreCase(cid)){
                cdlist[i].print();
                cntid++;
            }
        }    
            if(cntid==0){
                System.out.println("Hệ thống không tim được CD có id là "+cid);
            }
            else{
                System.out.printf("Hệ thống tìm thấy %d CD có id là %s\n",cntid,cid);
            }
        
    }
    
    public void displayAll(){
        if(counter==0){
            System.out.println("Hệ thống chưa có dữ liệu !!!");
            return;
        }
        
        System.out.println(">>Danh sách CD<<");
        for(int i=0;i<counter;i++){
            System.out.println(cdlist[i].toString());
        }
    }
    
    void menu(){
        while(true){
            Scanner sc=new Scanner(System.in);        
            int opt;
            System.out.println("\n>>MENU<<");
            System.out.println("1. Thêm CD");
            System.out.println("2. Tìm kiếm CD theo ID");
            System.out.println("3. Hiển thị toàn bộ danh sách CD");
            System.out.println("4. Thoát");
            System.out.println("Chọn các số theo mong muốn của bạn [1-4]");
            opt=sc.nextInt();

            switch(opt){
                case 1:
                    add();
                    break;
                case 2:
                    Scanner sc3=new Scanner(System.in);
                    String cid;
                    System.out.println("Nhập ID của CD bạn cần tìm : ");
                    cid=sc3.nextLine().trim();
                    search(cid);
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Xin vui lòng nhập lại !! [1-4]");
                    break;
            }
        }
        
    }
    
    public static void main(String[] args) {
        CDTest test=new CDTest();
        test.menu();
        
    }
    
}
