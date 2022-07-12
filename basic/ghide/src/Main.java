/**
 * cho phép lớp con định nghĩa lại phương thức lớp cha theo lớp con muốn
 * các kiểu trả về  thì ko đc thay đổi
 */

/**
 * Rule:
 * Danh sách đối số phải giống hoàn toàn với danh sách của phương thức được ghi đè.
 * kiểu trả về phải giống phuông thức lớp cha
 * Nếu phương thức lớp cha được khai báo là public thì phương thức ghi đè trong lớp con không thể là private hoặc protected.
 * method có final thì không thể ghi đè
 * không kế thừa sẽ ko đc ghi đè
 * không thể ghi đè static method nhưng có thể khai báo lại
 *  lớp con cùng package với lớp cha có thể ghi đè bất cứ phương thức nào mà không phải private hoặc final
 *  một lớp con trong một gói khác
 *  không thể ghi đè constructor
 */
class Animal{
    public void move(){
        System.out.println("Animals can move");
    }
}

class Dog extends Animal{
    @Override
    public void move() {
        System.out.println("Dog can walk");
    }
    public void bark(){
        System.out.println("Dog cos the sua");
    }
}


public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
        dog.bark();
    }
}