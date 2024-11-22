package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos (number);
        // \D = Tudo que não for dígito;
        // \s  = Todos espaços em brancos \t \n \f \r;
        // \S  = Todos caracteres excluindo os brancos;
        // \w  = a-ZA-A, dígitos (numbers), _ (exclui todos caracteres especiais);
        // \W  = tudo que não for incluso no \w;


        String regex = "\\S";
        String text = "abaaba";
        String text2 = "1we12 3e32e";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((text2));
        System.out.println("text:   " + text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Positions found");
        while(matcher.find()){
            System.out.print(matcher.start()+", "+matcher.group()+"\n");

        }
    }
}
