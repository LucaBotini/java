package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos (number);
        // \D = Tudo que não for dígito;
        // \s  = Todos espaços em brancos \t \n \f \r;
        // \S  = Todos caracteres excluindo os brancos;
        // \w  = a-ZA-A, dígitos (numbers), _ (exclui todos caracteres especiais);
        // \W  = tudo que não for incluso no \w;
        // [] = o que você colocar como parametro;
        // ? zero ou uma;
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $ fim da linha

        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((text));
        System.out.println("text:   " + text);
        System.out.println("index: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Positions found");
        while(matcher.find()){
            System.out.print(matcher.start()+", "+matcher.group()+"\n");
        }
    }
}
