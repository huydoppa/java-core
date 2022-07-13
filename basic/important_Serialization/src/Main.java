import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    /**
     * Java cung cấp một cơ chế, được gọi là tuần tự hóa đối tượng trong đó một đối tượng có thể được biểu diễn dưới dạng một chuỗi các byte bao gồm dữ
     * liệu của đối tượng cũng như thông tin về kiểu của đối tượng và các kiểu dữ liệu được lưu trữ trong đối tượng.
     * <p>
     * <p>
     * <p>
     * Sau khi một đối tượng tuần tự hóa đã được ghi vào một tệp, nó có thể được đọc từ tệp và được giải mã hóa,
     * tức là thông tin kiểu và byte đại diện cho đối tượng và dữ liệu của nó có thể được sử dụng để tạo lại đối tượng trong bộ nhớ.
     * <p>
     * <p>
     * <p>
     * Ấn tượng nhất là toàn bộ quá trình này là độc lập với JVM, có nghĩa là một đối tượng có thể được tuần tự hóa trên một nền tảng và deserialized trên một nền tảng hoàn toàn khác
     *
     * @param args
     */
    /** serialize **/
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Nguyen Khac Huy";
        e.address = "Khu Pho 2";
        e.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
        boolean serialize = true;
        Desert desert = new Desert();
        if(serialize){
            desert.Serialize();
        }
        else{
            desert.Deserialize();
        }
    }
    /**desrialize **/
}