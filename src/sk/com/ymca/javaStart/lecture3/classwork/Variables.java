package sk.com.ymca.javaStart.lecture3.classwork;

public class Variables {
    public static void main(String[] args) {
        int preIncrement = 10;
        int postIncrement = 10;

        System.out.println("preIncrement - " + ++preIncrement + '\n' + "postIncrement - " + postIncrement++);

        int a = 10;
        int b = 10;

        System.out.println(--a + "\n" + b--);

        short c = 19;

        c = (short) (c + 1);
        c += 1;
        c = ++c;

        String d = "Maks";
        String e = "Maks";
        boolean f = d == e;
        boolean g = d.equals(e);

        System.out.println(f + "\n" + g);
    }
}