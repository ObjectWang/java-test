import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        int c = a;
        int res = 0;
        for (int i = 0; i < b; i++) {
            res += c;
            c = c*10 + a;
        }
    }

    static class  d{
        interface  e{}
    }

    abstract class a{
        abstract  class b{};
    }

    public class inner{
        public  inner(){};
        abstract class c{}
        int a;
    }

}

