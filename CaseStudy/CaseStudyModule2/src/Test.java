import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String a = "mot hai ba bon nam sau bay";
        String[] strings = a.split(", ");
        System.out.println(Arrays.toString(strings) +"\n");
        System.out.println(strings[0]);
    }

}


