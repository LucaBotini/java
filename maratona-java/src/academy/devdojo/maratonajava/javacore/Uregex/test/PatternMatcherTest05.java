package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3 (começa com tal e termina com tal)
        // [^a] negação, procura tudo que não for a condição (nesse caso, tudo que não for "a")

//        String regex = "0[xX]([\\da-fA-F])+(\\s|$)";
//        String regex = "(\\w)+@(\\D)+\\.com";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "botini@hotmail.com, mih@gmail.com,#@!zoro@mail.br, test@gmail.com, sakura@mail, test@gmail.com.br";
        System.out.println("Adress valid:");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(text.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((text));
        System.out.println("text:   " + text);
        System.out.println("index: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Positions found");
        while (matcher.find()) {
            System.out.print(matcher.start() + ", " + matcher.group() + "\n");
        }
    }
}