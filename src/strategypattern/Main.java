package strategypattern;

public class Main {
    public static void main(String[] arg){
        ApplyDiscount applyDiscount=new ApplyDiscount(new FlatDiscount());
        applyDiscount.getDiscount();

        applyDiscount.setStrategy(new CashbackDiscount());
        applyDiscount.getDiscount();
    }
}
