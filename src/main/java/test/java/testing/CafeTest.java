package testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static testing.CoffeeType.Espresso;
import static testing.CoffeeType.Latte;

public class CafeTest {
    @Test
    public void canBrewEspresso(){
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        Coffee coffee = cafe.brew(Espresso);

        assertEquals(7,coffee.getBeans());
        assertEquals(0,coffee.getMilk());
        assertEquals(Espresso,coffee.getType());
    }

    @Test
    public void brewEspressoConsumeBeans(){
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);

        cafe.brew(Espresso);

        assertEquals(0,cafe.getBeansInstock());

    }
    @Test
    public void canBrewLatte(){
        Cafe cafe = new Cafe();
        cafe.restockBeans(7);
        cafe.restockMilk(227);

        Coffee coffee = cafe.brew(Latte);
        assertEquals(Latte,coffee.getType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void  mustRestockMilk(){
        Cafe cafe = new Cafe();
        cafe.restockMilk(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void  mustRestockBeans(){
        Cafe cafe = new Cafe();
        cafe.restockBeans(0);
    }
    @Test(expected = IllegalStateException.class)
    public void lattesRequireMilk(){
        Cafe cafe  = new Cafe();
        cafe.restockBeans(7);

        cafe.brew(Latte);
    }
}
