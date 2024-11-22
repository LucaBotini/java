package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os dígitos (number);
        // \D = Tudo que não for dígito;
        // \s  = Todos espaços em brancos \t \n \f \r;
        // \S  = Todos caracteres excluindo os brancos;
        // \w  = a-ZA-A, dígitos (numbers), _ (exclui todos caracteres especiais);
        // \W  = tudo que não for incluso no \w;
        // [] = o que você colocar como parametro.

//        String regex = "[a-zA-Z]";
        String regex = "0[xX][\\da-fA-F]";
//        String text = "abaaba";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((text2));
        System.out.println("text:   " + text2);
        System.out.println("index: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Positions found");
        while(matcher.find()){
            System.out.print(matcher.start()+", "+matcher.group()+"\n");
        }
        int numHex = 0X59F86A; //numbers hexa in java are recognized starting with "0x"
//        System.out.println(numHex);
    }
}
