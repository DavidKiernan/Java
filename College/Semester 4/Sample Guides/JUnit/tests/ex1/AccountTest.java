package ex1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void test_settlementVoid() {
        Account c = new Account();
        assertEquals(0, c.updates());
    }

    @Test
    public void test_updates() {
        Account c = new Account();
        c.deposit(12);
        c.withdraw(-8);
        c.deposit(10);
        assertEquals(14, c.updates());
    }
    @Test
    public void test_realCaseSettlement() {
        Account c = new Account();
        for (int i=0; i <10 ; i++) {
            c.deposit(1);
            c.withdraw(-10);
        }
        assertEquals(0, c.updates());
    }
}




