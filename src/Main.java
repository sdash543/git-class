import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Remove all duplcate words from String
        String s= "ABC DE ABC";

        Set<String> map= Arrays.stream(s.split(" ")).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(map);

    }
}