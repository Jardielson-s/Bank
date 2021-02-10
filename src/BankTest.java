import org.junit.Assert;

import static org.junit.Assert.*;

public class BankTest {


    @org.junit.Test
    public void setNumber_count() throws ExceptionContExist {
        Client client = new Client("Jardielson silva ferreira","000.111.222-33","0000 000 000000-1");
        Client client1 = new Client("Jardiel silva ferreira","000.000.200-03","0110 013 000000-1");

        Bank bank = new Bank("0000 000 000000-9");
        Bank bank2 = new Bank("0050 013 000000-8");
        bank2.insertClient(client1);

        Assert.assertEquals(bank.getNumber_count(),"0000 000 000000-9");
        Assert.assertEquals(bank2.getNumber_count(),"0050 013 000000-8");

        Assert.assertEquals(bank2.getClient().getName(),"Jardiel silva ferreira");

        try{

          bank.getClient().verify("0000 000 000000-9");
          fail("deveria dar uma exception");

        }catch (Exception e){
            //Assert.assertEquals(bank.getClient().verify("0000 000 000000-9"),"0000 000 000000-9");
            //e.printStackTrace();
        }

    }
}