import java.io.Serializable;
/** transient. khong the serialize**/
public class Employee implements Serializable {
    public String name;
    public String address;
    public int number;
    public void mailCheck(){
        System.out.println("Mailing check to "+name +" "+address+number);
    }
}
