public class ExceptionInsufficientFunds extends Exception {

    public ExceptionInsufficientFunds(double saldo){
        super("you can't withdraw or send this value, because your balance is insufficient");
    }
}
