
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    
    public Money plus (Money added) {
        int plusEuros = this.euros + added.euros;
        int plusCents = this.cents + added.cents;
        return new Money (plusEuros, plusCents);
    }
    
    public boolean less (Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    public Money minus (Money decremented) {
        
        if (this.less(decremented)) {
            int differenceEuros = 0;
            int differenceCents = 0;
            
            return new Money (differenceEuros, differenceCents);
        } else {
        int differenceEuros = this.euros - decremented.euros;
        int differenceCents = this.cents - decremented.cents;
        if (this.cents < decremented.cents) {
            differenceEuros--;
            differenceCents = 100 - decremented.cents;
        }
        
        return new Money (differenceEuros, differenceCents);
    }
    }
}
