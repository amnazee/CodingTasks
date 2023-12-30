package strategypattern;

public class CashbackDiscount implements DiscountStrategy{
    @Override
    public void giveDiscount() {
        System.out.println("CashBack Discount");
    }
}
