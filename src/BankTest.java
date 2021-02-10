import org.junit.Assert;

import static org.junit.Assert.*;

public class BankTest {


    @org.junit.Test
    public void setNumber_count() throws ExceptionContExist {
        Client client = new Client("Jardielson silva ferreira","000.111.222-33","0000 000 000000-1");
        Client client1 = new Client("Jardiel silva ferreira","000.000.200-03","0110 013 000000-1");

        Bank bank = new Bank("0000 000 000000-9", client.getName(), client.getCpf());

        Bank bank2 = new Bank("0050 013 000000-8",client1.getName(), client1.getCpf());

        Assert.assertEquals(bank.getNumber_count(),"0000 000 000000-9");
        Assert.assertEquals(bank2.getNumber_count(),"0050 013 000000-8");

        Assert.assertEquals(bank2.getClient().getName(),"Jardiel silva ferreira");


    }
}