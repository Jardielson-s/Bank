import org.junit.Assert;

import static org.junit.Assert.*;

public class BankTest {


    @org.junit.Test
    public void setNumber_count() throws ExceptionContExist {
        Bank bank = new Bank("0000 000 000000-9","Jardielson silva ferreira","072.639.823-31");
        Bank bank2 = new Bank("0050 013 000000-8","Jardiel silva ferreira","072.639.803-98");

        Assert.assertEquals(bank.getNumber_count(),"0000 000 000000-9");
        Assert.assertEquals(bank2.getNumber_count(),"0050 013 000000-8");

        Assert.assertEquals(bank2.getClient().getName(),"Jardiel silva ferreira");

        try{

          bank.getClient().verify("0000 000 000000-9");
          System.out.println("kk");
          fail("deveria dar uma exception");

        }catch (Exception e){
            Assert.assertEquals(bank.getClient().verify("0000 000 000000-9"),"0000 000 000000-9");
            //e.printStackTrace();
        }

    }
}