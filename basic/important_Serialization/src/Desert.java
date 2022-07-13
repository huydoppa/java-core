import java.io.*;

public class Desert implements Serializable {
    private static final long serialVersionUID = 1L;
    public String name;
    public int width;
    public int height;

    public Desert(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    public Desert(){

    }

    public static void Deserialize() {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("de.ser"));
            Desert desert = (Desert) in.readObject();
            System.out.println("The desert : "+desert.name);
            System.out.println("Has a surface of : "+ String.valueOf(desert.width*desert.height));
            // closing  the stream
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void Serialize(){
        try{
            Desert e = new Desert("huykhac",12,13);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("de.ser"));
            out.writeObject(e);
            out.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
