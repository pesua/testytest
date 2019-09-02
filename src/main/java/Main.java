import static com.google.common.base.Strings.repeat;

public class Main{
    public static void main(String[] args) {
       String str = new String("hello WORLD !!!");
       if (str.contains("WORLD")) {
          System.out.println(str.toLowerCase());
       }
       System.out.println("Use some method of StringUtils class(GUAVA):");
       System.out.println(repeat("My text in new line !!! \n",3));

    }
}