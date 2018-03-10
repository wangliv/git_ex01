import java.util.function.Function;

/**
 * Demo02
 */
public class Demo02 {
    public static void main(String[]args){
        Function<String,String> add = (t) -> t+t;
        String rs =add.apply("wangli");
        System.out.println(rs);
    }
}
