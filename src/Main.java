import com.google.common.primitives.Bytes;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1
        byte arr[] = { 1, 2, 3, 4, 5 };
        List<Byte> myList = Bytes.asList(arr);
        System.out.println(myList);


        // 2
        byte arr2[] = { 3, 5, 7 };
        List<Byte> myList2 = Bytes.asList(arr2);
        System.out.println(myList2);
    }
}