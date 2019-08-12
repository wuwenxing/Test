package lk;

import java.io.PrintWriter;

public class Foo {
	static int i;
    public static void main(String[] args) throws Exception {
    	int i = 5;
    	int j = 10;
    	System.out.println(i + ~j);
        PrintWriter out = new PrintWriter(
            new java.io.OutputStreamWriter(System.out), true);
        out.println("Hello");
    }
}
