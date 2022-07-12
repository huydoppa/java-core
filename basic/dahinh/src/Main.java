/**
 * Tính đa hình là khả năng của một đối tượng có nhiều dạng.
 * Việc sử dụng đa hình phổ biến nhất trong OOP xảy ra khi một
 * tham chiếu lớp cha được sử dụng để tham chiếu đến một đối tượng lớp con.
 *
 */








public class Main {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 360);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 240);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailcheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailcheck();

    }
}