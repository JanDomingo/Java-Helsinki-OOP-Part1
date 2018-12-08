
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
        // at start the register has 1000 euros 
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.50) {
            this.economicalSold += 1;
            this.cashInRegister += 2.50;
            return (cashGiven - 2.50);
        }
        if (cashGiven < 2.50) {
            return cashGiven;
        }
        
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
        return -1;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4.00) {
            this.gourmetSold += 1;
            this.cashInRegister += 4;
            return (cashGiven - 4.00);
        }
        
        if (cashGiven < 4.00) {
            return cashGiven;
        }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        return -1;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= 2.50) {
            this.economicalSold += 1;
            card.pay(2.50);
            return true;
        } else {
        return false;
        }
    }
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    
    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4.00) {
            this.gourmetSold += 1;
            card.pay(4.00);
            return true;
        } else {
            return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
        card.loadMoney(sum);
        this.cashInRegister += sum;
        }
    }
    
    
    
    
    
    
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}

