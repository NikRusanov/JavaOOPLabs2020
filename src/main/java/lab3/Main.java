package lab3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringFragmentsReplaces fragmentsReplaces = new StringFragmentsReplaces("sadasdssss",3);
        List<String> result = fragmentsReplaces.separate();
        System.out.println(result.toString());
    }
}
