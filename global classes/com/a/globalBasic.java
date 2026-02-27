package javatask;

public class GlobalBasic {

    static byte b;
    static int a;
    static short c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;
    static String name = "Ram";

    public static void main(String[] args) {

        int b = 10;  // local variable MUST be initialized

        System.out.println("Local b: " + b);
        System.out.println("Static byte b: " + GlobalBasic.b);
        System.out.println("Static int a: " + a);
        System.out.println("Static short c: " + c);
        System.out.println("Static long d: " + d);
        System.out.println("Static float e: " + e);
        System.out.println("Static double f: " + f);
        System.out.println("Static char g: " + g);
        System.out.println("Static boolean h: " + h);
        System.out.println("Static String name: " + name);
    }
}