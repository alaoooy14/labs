/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mar212021;

/**
 *
 * @author Marshal
 */
public class Example {

    public Example() {
        //https://www.w3schools.com/java/java_type_casting.asp
        //https://www.javatpoint.com/object-class
        /**
         * Widening Casting (automatically) - converting a smaller type to a
         * larger type size byte -> short -> char -> int -> long -> float ->
         * double
         */
        int var = 10;
        float var2 = var;
        double var3 = var;
        
        //up-cast
        Person obj = new Student();
        obj.setName("Hani");
        Person obj2 = new Student();
        obj2.setName("Hani");
        Person obj3 = obj;
        Object obj5 = new Student();

        //test above lines
        System.out.println(obj.toString());
        System.out.println(obj.equals(obj));
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
        /**
         * Narrowing Casting (manually) - converting a larger type to a smaller
         * size type double -> float -> long -> int -> char -> short -> byte
         */
        var = (int) var3;
        var = (int) var2;
        byte var4 = (byte) var;
        //down-cast
        Student obj4 = (Student) new Person();
    }
}
