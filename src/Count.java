import java.util.ArrayList;

public class Count extends  CountAbstract{

    public Count(String count, Client c){
      super(count,c);
    }

    public Count(int num, double s, Client c) throws   {
        super(num, s, p);
    }

    @Override
    public void debito(double val) throws ExceptionInsufficientFunds {

    }
}
