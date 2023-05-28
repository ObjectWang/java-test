import jdk.internal.dynalink.beans.StaticClass;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main extends Outer{

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count =0;
        int e = s.charAt(s.length()-1)-'0';
        for (int i = 0;i<s.length()-1;i++){
            int b = s.charAt(i)-'0';
            if ((b+e)%2==0){
                count++;
            }
        }
        System.out.println(count);


    }

}

