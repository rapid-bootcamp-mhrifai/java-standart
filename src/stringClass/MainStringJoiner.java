package stringClass;

import java.util.StringJoiner;

public class MainStringJoiner {
    public static void main(String[] args) {
        String[] names = {"Muhamad", "Rifai", "Abdullah"};
        StringJoiner joiner = new StringJoiner(" - ","{","}");

        System.out.println("Sebelum add:");
        System.out.println(joiner.toString());

        for (String name: names){
            joiner.add(name);
        }

        System.out.println("Setelah di Add:");
        System.out.println(joiner.toString());
    }
}
