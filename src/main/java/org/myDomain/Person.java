package com.myDomain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author chaonengquan
 * This code demostrate override hashCode() equals() and toString() methods
 */
public class Person {

    public int age;
    public String firstName;

    @Override
    public int hashCode() {
        // final int prime = 31;
        // return prime+age;
        return Objects.hash(age, firstName);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person anotherUser = (Person)o;
        // if(anotherUser.age!=this.age) return false;
        return anotherUser.firstName.equals(this.firstName);
    }

    @Override
    public String toString(){
        return this.firstName;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 36;
        p1.firstName = "Alex";
        Person p2 = new Person();
        p2.age = 20;
        p2.firstName = "Bryan";
        Person p3 = new Person();
        p3.age = 36;
        p3.firstName = "Chris";

        Map<Person, Integer> m = new HashMap();
        m.put(p1, 100);
        m.put(p2, 50);
        m.put(p3, 101);
        System.out.println(m);

    }

}
