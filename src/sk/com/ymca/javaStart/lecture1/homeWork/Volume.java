package sk.com.ymca.javaStart.lecture1.homeWork;
/*
Створіть клас Volume.
Напишіть програму розрахунку об'єму - V та площі поверхні -S циліндра.
Об'єм V циліндра радіусом – R та висотою – h, обчислюється за формулою: V = πR2h
Площа поверхні циліндра обчислюється за формулою: S = 2πR2
 + 2πR2
 = 2πR(R+h)
Результати розрахунків виведіть на екран.
*/
public class Volume {
    public static void main(String[] args) {
        System.out.println("V = " + Math.PI * Math.pow(3,2) * 5 + "\n" + "S = " + 2 * Math.PI * 3 * (3 + 5));

        final double PI = Math.PI;
    }
}
