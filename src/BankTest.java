import org.junit.Assert;

public class BankTest {


    @org.junit.Test
    public void setNumber_count() throws ExceptionContExist {
        Count count = new Count("Jardielson silva ferreira","000.111.222-33","0000 000 000000-1", 55555);
        Count count1 = new Count("Jardiel silva ferreira","000.000.200-03","0110 013 000000-1",12000);

        Bank bank = new Bank("0000 000 000000-9", count.getName(), count.getCpf(), count.getSaldo());

        Bank bank2 = new Bank("0050 013 000000-8", count1.getName(), count1.getCpf(), count1.getSaldo());

        Assert.assertEquals(bank.getNumber_count(),"0000 000 000000-9");
        Assert.assertEquals(bank2.getNumber_count(),"0050 013 000000-8");

        Assert.assertEquals(bank2.getClient().getName(),"Jardiel silva ferreira");


    }
}