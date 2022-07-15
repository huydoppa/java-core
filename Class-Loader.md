<h1><strong>Class Loader</strong></h1>
Khi một Java Class được khởi tạo , nó sẽ gọi ``` java.lang.ClassLoader ``` load class bytecode và ClassLoader gọi các native method của JVM 
để xác định một java.lang.class instance

<img/src="https://javasec.oss-cn-hongkong.aliyuncs.com/images/JvmSpec7.png" height=600 width=800> 

Tất cả các lớp java phải tải bởi JVM trước khi nó có thể trước khi nó có thể chạy 
JVM Class Loader bao gồm :
+ Boostrap Class Loader : Load tất cả các java core lib như java.lang
+ Extension Class Loader : load tất cả các class được định nghĩa trong jar files at $JAVA_HOME$\lib\ext
+ System Class Loader : load các classes từ CLASSPATH
Nếu không chỉ định 1 class loder trong khi load class , các class đã được load SystemClassLoader sẽ được sử
dụng mặc định 

``` ClassLoader ``` Lớp có nhưng method chính sau :
1. loadClass ( load các lớp java được chỉ định)
2. findClass ( tìm các lớp java được chỉ định)
3. findLoadedClass ( Tìm các class đã được load bởi JVM )
4. defineClass ( xác định 1 Java Class )
5. resolveClass ( Link tớ các lớp Java)

<h1><strong>Java Class Dynamic Loading Method </strong></h1>

Java class loading method thì được chia ra thành ``` rõ ràng ``` và ``` ngầm hiểu ``` , ``` rõ ràng ``` , chúng ta 
thường sử dụng ClassLoader để dynamic load 1 class object , và ``` ngầm hiểu ```  classname.methodname () hoặc new class instance 
Class.forName("tên lớp") Mặc định các thuộc tính và phương thức tĩnh của lớp được tải sẽ được khởi tạo. Nếu bạn không muốn khởi tạo lớp, bạn có thể sử dụng
Class.forName("tên lớp",có khởi tạo hay không , trình nạp lớp) nhưng CLassLoader.loadClass mặc định , phương thức lớp sẽ không được khởi tạo

<h1><strong>ClassLoader class loading process</strong></h1>

1. ClassLoaderThe method will be called public Class<?> loadClass(String name)to load com.anbai.sec.classloader.TestHelloWorldthe class.
2. Call findLoadedClassthe method to check TestHelloWorldwhether the class has been initialized, and return the class object directly if the JVM has initialized the class.
3. ClassLoaderIf the parent class loader ( ) is passed in when creating the current , new ClassLoader(父类加载器)use the parent class loader to load TestHelloWorldthe class, otherwise use the JVM Bootstrap ClassLoaderload.
4. If the class could not be loaded in the previous step TestHelloWorld, the method that calls itself findClassattempts to load the TestHelloWorldclass.
5. If the current method ClassLoaderdoes not override the findClassmethod, then directly return the class loading failure exception. If the current class overrides the method and finds the corresponding class bytecode findClassthrough the passed 6. in class name, then the method should be called to register the class in the JVM.com.anbai.sec.classloader.TestHelloWorlddefineClass
7. If the parameter passed in when calling loadClass resolveis true, then you also need to call the resolveClassmethod to link the class, the default is false.
8. Returns a java.lang.Classclass object loaded by the JVM.

<h1><strong>Custom Class Loader </strong></h1>
Java.lang.classloader là cha của các class loaders và có rất nhiều classloader con . các class loader con kế thừa ClassLoader và viết lại findClassmethod để nhận ra việc tải các tệp lớp thư mục và thậm chí cả các tệp tài nguyên từ xa.
<p>
Bây giờ ClassLoader được biết là có khả năng tải các lớp, chúng tôi cũng có thể thử viết trình tải lớp của riêng mình để tải các mã bytecodes tùy chỉnh
</p>
<p>Nếu lớp TestHelloWorld tồn tại thì có thể gọi hello method</p>
```
TestHelloWorld t = new TestHelloWorld();
String str = t.hello();
System.out.println(str);
```
Nhưng nếu mà TestHelloWorld không tồn tại ,thì chúng ta có thể sử dụng một trình nạp lớp tùy chỉnh để viết lại phương thức, rồi truyền vào bytecode của lớp khi findClass gọi method để xác định một lớp tới JVM, và cuối cùng sử dụng cơ chế phản chiếu Bạn có thể gọi phương thức của class.defineClass TestHelloWorld TestHelloWorld TestHelloWorld hello
```

