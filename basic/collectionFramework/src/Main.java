import java.net.SocketOption;
import java.util.*;
public class Main {
    /**
     * Java Collection Framework cung cấp một kiến trúc để lưu trữ và thao tác với một nhóm đối tượng. Một Java Collection Framework bao gồm:
     *
     *     Interfaces: Interface trong Java đề cập đến các kiểu dữ liệu trừu tượng. Chúng cho phép Java collections
     *     được thao tác độc lập với các biểu diễn của chúng.
     *     Ngoài ra, chúng tạo thành một hệ thống phân cấp trong ngôn ngữ lập trình hướng đối tượng.
     *     Classes: Các lớp trong Java là sự triển khai của collection interface. Nó đề cấp đến các cấu trúc dữ liệu được sử dụng lặp đi lặp lại.
     *     Algorithm: Thuật toán đề cập đến các phương pháp được sử dụng để thực hiện các hoạt động như tìm kiếm và sắp xếp trên đối tượng triển khai của collection interface.
     *     Các thật toán có bản chất đa hình vì cùng một phương pháp có thể sử dụng được nhiều dạng hoặc bạn có thể nói có nhiều cách triển khai khác nhau của java collection interface
     * @param args
     */
    /**
     * Generic method : method chung viết một hàm dùng cho nhiều kiểu đối tượng
     *Có thể có những lúc bạn muốn hạn chế các loại kiểu được phép chuyển cho một tham số kiểu.
     * Ví dụ: một phương thức hoạt động trên các số có thể chỉ muốn chấp nhận các thể hiện của Số hoặc các lớp con của nó.
     * Đây là những gì các tham số kiểu bị giới hạn dành cho.
     *  Để khai báo một tham số kiểu có giới hạn, hãy liệt kê tên của tham số kiểu,
     *  theo sau là từ khóa expand, tiếp theo là giới hạn trên của nó.
     * @param args
     */
    //generic func
    public static < E > void printArray( E[] inputArray ) {
        // Display array elements
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("A1");
        list.add("A2");
        list.add("A3");
        // xoa phan tu
        list.remove(0);
        //weap phan tu
        String tmp=list.get(2);
        list.set(2,list.get(3));
        list.set(3,tmp);
        //duyet phan tu
        for(String i:list){
            System.out.println(i);
        }

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }
        //Vector
    //generic method


    }
}