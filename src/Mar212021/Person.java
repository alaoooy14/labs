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
public class Person {

    String name;

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "The name is\t" + this.name;
    }
}
