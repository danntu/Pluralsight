package testing;

public final class Cafe {
    private int beansInstock =0;
    private int milkInStock=0;

    public Coffee brew(CoffeeType coffeeType){
        return brew(coffeeType,1);
    }

    public Coffee brew(CoffeeType coffeeType, int strength){
        requirePositive(strength);
        int requiredBeans = coffeeType.getRequiredBeans()*strength;
        int requiredMilk = coffeeType.getRequiredMilk()*strength;
        if (requiredBeans>beansInstock || requiredMilk>milkInStock){
            throw new IllegalArgumentException();
        }
        beansInstock-=requiredBeans;
        milkInStock-=requiredMilk;
        return new Coffee(coffeeType,requiredBeans,requiredMilk);
    }

    public void restockBeans(int weightInGrams){
        requirePositive(weightInGrams);
        beansInstock+=weightInGrams;
    }

    public  void restockMilk(int weightInGrams){
        requirePositive(weightInGrams);
        milkInStock+=weightInGrams;
    }

    private void requirePositive(int value){
        if (value<1) throw new IllegalArgumentException();
    }

    public int getBeansInstock() {
        return beansInstock;
    }

    public int getMilkInStock() {
        return milkInStock;
    }
}
