package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    @Test
    public void addCdfs(){
        Money money1 = new Money(23,"CDF");
        Money money2 = new Money(20,"CDF");

        Money expected = new Money(43,"CDF");

        assertEquals(expected, money1.add(money2));
    }
}
