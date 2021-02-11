import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ControlPanelTest {

    @Test
    public  void insertControlPanel() throws ExceptionContExist, ExceptionCpfExist {

        Client client = new Client("Jardielson silva ferreiar","000.111.222-33","0000 000 000000-1",55555);

        ControlPanel controlPanel = new ControlPanel();

        controlPanel.insertClient(client);

        Client client1 = new Client("Jardiel silva ferreira","000.000.200-03","0000 000 000000-1",12000);


        try {
            controlPanel.insertClient(client1);
            fail("sould give exception");
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Test
    public  void CreateAccount() throws ExceptionContExist, ExceptionCpfExist {

        Client client = new Client("Jardielson silva ferreiar","000.111.222-33","0000 000 000000-1",55555);

        ControlPanel controlPanel = new ControlPanel();

        Client client1 = new Client("Jardiel silva ferreira","000.000.200-03","0000 000 000000-1",12000);

        Bank bank = new Bank("0000 000 000000-1", client.getName(), client.getCpf(), client.getSaldo());

        Bank bank2 = new Bank("0000 000 000000-1",client1.getName(), client1.getCpf(), client.getSaldo());

        controlPanel.createAccount(bank);
        try {
            controlPanel.createAccount(bank2);
            fail("sould give exception");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void recuperarClients() throws ExceptionContExist, ExceptionCpfExist {

        Client client = new Client("Jardielson silva ferreira","000.111.222-33","0000 000 000000-1",55555);

        ControlPanel controlPanel = new ControlPanel();

        controlPanel.insertClient(client);

        Client client1 = new Client("Jardiel silva ferreira","000.000.200-03","0900 013 000500-9",12000);

       controlPanel.insertClient(client1);

        ArrayList<Client> arrayList = new ArrayList<>();

        arrayList.addAll(controlPanel.recuperarClientes());


            Assert.assertEquals("Jardielson silva ferreira",controlPanel.recuperarClientes().get(0).getName());
            Assert.assertEquals("Jardiel silva ferreira",controlPanel.recuperarClientes().get(1).getName());

    }

    @Test
    public void recuperarAccount() throws ExceptionContExist, ExceptionCpfExist {

        Client client = new Client("Jardielson silva ferreiar","000.111.222-33","0000 000 000000-1",55555);

        ControlPanel controlPanel = new ControlPanel();

        Client client1 = new Client("Jardiel silva ferreira","000.000.200-03","1989 013 000850-1",12000);

        Bank bank = new Bank("0000 000 000000-1", client.getName(), client.getCpf(), client.getSaldo());

        Bank bank2 = new Bank("1989 013 000850-1",client1.getName(), client1.getCpf(), client1.getSaldo());

        controlPanel.createAccount(bank);
        controlPanel.createAccount(bank2);




        Assert.assertEquals("0000 000 000000-1",controlPanel.recuperarAccount().get(0).getNumber_count());
        Assert.assertEquals("1989 013 000850-1",controlPanel.recuperarAccount().get(1).getNumber_count());

    }

    @Test
    public  void TestTransferValue() throws ExceptionContExist, ExceptionCpfExist, ExceptionInsufficientFunds {

        Client client = new Client("Jardielson silva ferreira","000.111.222-33","0000 000 000000-1",55555);

        ControlPanel controlPanel = new ControlPanel();

        controlPanel.insertClient(client);

        Client client1 = new Client("Jardiel silva ferreira","000.000.200-03","0900 013 000500-9",12000);

        controlPanel.insertClient(client1);

        controlPanel.transferValue("0000 000 000000-1","Jardielson silva ferreira", "0900 013 000500-9", "Jardiel silva ferreira",10000);

        Assert.assertEquals(client.getSaldo(),45555.0,0.1);


        try {
            controlPanel.transferValue("0000 000 000000-1","Jardielson silva ferreira", "0900 013 000500-9", "Jardiel silva ferreira",100000);
            fail("should give exception");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}