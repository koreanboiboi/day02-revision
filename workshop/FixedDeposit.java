package workshop;

public class FixedDeposit extends BankAccount {

    private float interest =0.03f;
    private int duration = 0;

    public FixedDeposit(String name, float initialBal){
        super(name,initialBal);
    }

    public FixedDeposit(String name, float initialBal, float interest) {
        super(name, initialBal);
        this.interest = interest;
    }
    public FixedDeposit(String name, float initialBal, float interest, int duration) {
        this(name, initialBal, initialBal);
        this.duration = duration;
    }

    @Override
    public float getBalance() {
       return super.getBalance() * .1f; 
    }
    
}
