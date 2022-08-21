package com.example.refactoring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test(){
        Customer customer = new Customer("小明");
        Customer customer2 = new Customer("小发");

        Movie movie = new Movie("卧虎藏龙",2);
        Movie movie2 = new Movie("小羊肖恩",1);

        Rental rental = new Rental(movie,2);
        Rental rental2 = new Rental(movie2,3);

        customer.addRental(rental);
        customer.addRental(rental2);

        System.out.println(customer.statement());
        System.out.println("==========================");

        customer2.addRental(rental2);
        String statement = customer2.statement();
        System.out.println(statement);
    }
}