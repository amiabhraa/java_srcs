import java.util.LinkedHashMap;
import java.util.Scanner;
import java.io.PrintStream;
import java.lang.StringBuilder;

public class Project1 {
    public static void main(String[] args){

        //Making LinkedHashMap object
        LinkedHashMap<String,String> hm = new LinkedHashMap<>();
        //Making Scanner object
        Scanner sc = new Scanner(System.in);
        //Making printStream class
        PrintStream ps = System.out;
        int codeLen = 8;
        //Making code generator package
        alphaNumericCodeGen code = new alphaNumericCodeGen();
        alphaNumericCodeGen.Generator(codeLen);

        StringBuilder sb = new StringBuilder();

        ps.println("Enter URL: ");
        String urlLoca = sc.next();
        hm.put("cdjhgdwuyUYG24","Hello");


    }
}

class alphaNumericCodeGen{
    public static void Generator(int codeLen){
        String pool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder sb = new StringBuilder(pool);

    }
}
