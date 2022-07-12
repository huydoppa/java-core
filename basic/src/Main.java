import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;

public class Main {
    //Basic Syntax
    /**
     * Object - Đối tượng bao gồm trạng thái và hành vi . Ví dụ : một con chó có các trạng thái - màu sắc, tên và các hành vi như vẫy đuôi , sủa ,ăn
     * Object và một instance của class
     *Class - Một lớp có thể được định nghĩa như một khuôn mẫu / bản thiết kế mô tả hành vi / trạng thái mà đối tượng thuộc kiểu của nó hỗ trợ.
     * instance variables : Mỗi đối tượng có một tập hợp các biến thể hiện duy nhất của nó.  Trạng thái của một đối tượng được tạo bởi các giá trị được gán cho các biến cá thể này.
     *
     */

    // Object and classes
    /**
     * Class là một bản thiết kế , nơi mà các object được tạo ra
     *ex :
     */
    public class Dog{
        // thuộc tính
        String breed;
        int age;
        String color;

        //phương thức
        void barking(){//
        }
        void hungry(){//
        }
        void sleep(){//
        }
    }
    /**
     * Một class có thể bao gồm
     * Local Variables - Các biến được định nghĩa bên trong các phương thức,
     * hàm tạo hoặc khối được gọi là biến cục bộ.  Biến sẽ được khai báo và khởi tạo
     * bên trong phương thức và biến sẽ bị hủy khi phương thức hoàn thành.
     * Instance Variables - Biến cá thể là các biến bên trong một lớp nhưng bên ngoài
     * bất kỳ phương thức nào.  Các biến này được khởi tạo khi lớp được khởi tạo.
     * Các biến cá thể có thể được truy cập từ bên trong bất kỳ phương thức,
     * hàm tạo hoặc các khối nào của lớp cụ thể đó.
     * Class Variables - Biến lớp là các biến được khai báo trong một lớp, bên ngoài bất kỳ phương thức nào,
     * với từ khóa static.
     */
    /**
     * Constructors
     * là hàm tạo , có cùng tên với lớp , chức năng là khởi tạo giá trị , nếu không có hàm tạo khi viết class , trình biến
     * dịch Java sẽ xây dựng một phương thức khởi tạo mặc định cho lớp đó
     * Mỗi khi đối tượng mới được tạo thì ít nhất một constructor sẽ được gọi . Một lớp có thể nhiều hơn 1 constructor
     */
    /**
     * Creating an object
     * có 3 cách để tạo 1 đôi tượng
     *

     Declaration − A variable declaration with a variable name with an object type.

     Instantiation − The 'new' keyword is used to create the object.

     Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
ex
     */
    /**
     * Basic datatype
     * byte :
     *

     Byte data type is an 8-bit signed two's complement integer

     Minimum value is -128 (-2^7)

     Maximum value is 127 (inclusive)(2^7 -1)

     Default value is 0

     Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer.

     Example: byte a = 100, byte b = -50

     * short -32,768 (-2^15) -> 32,767
     * int -2^31 -> 2^31-1
     * long -2^63->2^63-1
     * float ,double
     * char
     * @param args
     */
    // VARIABLE

    /**
     * there are 3 types of variable:
     * Local Variable
     * Instance Variable
     * Class/Static Variable
     * Local Variable :
     * Các biến cục bộ được khai báo trong các phương thức, hàm tạo hoặc khối.
     * Biến cục bộ được tạo khi phương thức, hàm tạo hoặc khối được nhập và biến sẽ bị hủy khi nó thoát khỏi phương thức, hàm tạo hoặc khối.
     * Access Modifier cannot used for local variable
     * Các biến cục bộ chỉ hiển thị trong phương thức, hàm tạo hoặc khối đã khai báo.
     * Các biến cục bộ được triển khai ở cấp ngăn xếp trong nội bộ
     * Không có giá trị mặc định cho các biến cục bộ, vì vậy các biến cục bộ nên được khai báo và một giá trị ban đầu nên được gán trước lần sử dụng đầu tiên.
     *
     * @param args
     */
    /**
     * Instance Variable :
     * Khởi tạo ở 1 class nhưng không nằm trong phuwogn thức nào
     * Khi một không gian được cấp phát cho một đối tượng trong heap , một vị trí cho mỗi biến giá trị cá thể sẽ được tạo
     * Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.
     *
     * Instance variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class.
     *
     * Instance variables can be declared in class level before or after use.
     *
     * Access modifiers can be given for instance variables.
     *
     * The instance variables are visible for all methods, constructors and block in the class. Normally, it is recommended to make these variables private (access level). However, visibility for subclasses can be given for these variables with the use of access modifiers.
     *
     * Instance variables have default values. For numbers, the default value is 0, for Booleans it is false, and for object references it is null. Values can be assigned during the declaration or within the constructor.
     *
     * Instance variables can be accessed directly by calling the variable name inside the class. However, within static methods (when instance variables are given accessibility), they should be called using the fully qualified name. ObjectReference.VariableName.
     * @param args
     */
    /**
     * Class/Static Variables
     *
     *     Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.
     *
     *     There would only be one copy of each class variable per class, regardless of how many objects are created from it.
     *
     *     Static variables are rarely used other than being declared as constants. Constants are variables that are declared as public/private, final, and static. Constant variables never change from their initial value.
     *
     *     Static variables are stored in the static memory. It is rare to use static variables other than declared final and used as either public or private constants.
     *
     *     Static variables are created when the program starts and destroyed when the program stops.
     *
     *     Visibility is similar to instance variables. However, most static variables are declared public since they must be available for users of the class.
     *
     *     Default values are same as instance variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null. Values can be assigned during the declaration or within the constructor. Additionally, values can be assigned in special static initializer blocks.
     *
     *     Static variables can be accessed by calling with the class name ClassName.VariableName.
     *
     *     When declaring class variables as public static final, then variable names (constants) are all in upper case. If the static variables are not public and final, the naming syntax is the same as instance and local variables.
     * @param args
     */
    //MODIFIERS

    /**
     * Access-Modifier trong java
     * Private - in class
     * Default - Trong class, trong package
     * Protected - Trong lớp , Trong package , Ngoài package bởi lớp con
     * Public - trong lớp , trong package , ngoài package bởi lớp con , ngoài package
     * @param args
     */
    // FILE IO

    /**
     * 2 kind of streams :
     * Inputstream : used to read data from a source
     * OutPutStream : used to write data to a destination
     *
     * @param args
     */
    // Tính Kế Thừa

    /**
     * Sử dụng lớp đã có để tạo ra lớp mới
     * Để thực hiện kế thừa sử dụng phương thức extends
     * Lớp được kế thừa gọi là lớp cha
     * Lớp kế thừa gọi là lớp con
     * Java cho phép đơn kế thừa : Mỗi lớp con chỉ có duy nhất 1 lớp cha
     */
        public static void main(String []args){
            Puppy myPuppy = new Puppy("tommy");
            Employee employee = new Employee("Rakinsa");
            employee.setSalary(1000);
            employee.printEmp();
            IOFile o = new IOFile();
            o.doc("C:\\Users\\nguye\\Desktop\\java-core\\basic\\src\\input.txt");
            o.viet("C:\\Users\\nguye\\Desktop\\java-core\\basic\\src\\input.txt");
        }

}


class Puppy {
    public Puppy(String name) {
        //this constructor has one parameter , name
        System.out.print(name);
    }
}
class Employee{
    // this instance variable is visible for any child class
    public String name;
    //salary variable is visible in Employee class only
    private double salary;

    //Biến name được gán trong hàm tạo
    public Employee(String empName){
        name = empName;
    }
    public void setSalary(double empSal){
        salary = empSal;
    }
    public void printEmp(){
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);

    }

}
class IOFile {
    public void doc(String file) {
        try {
            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error");
            e.printStackTrace();
        }
    }
    public void viet(String file){
        try{
            FileWriter myWiter = new FileWriter(file);
            myWiter.write("Never enough");
            myWiter.close();
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}