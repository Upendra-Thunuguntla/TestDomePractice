package accountTest;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);
        
        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);
    }
    
    @Test
    public void depositAndWithdrawCannotAcceptNegativeIntegers() {
    	Account acc = new Account(-20);
    	Assert.assertEquals(acc.deposit(-20),acc.withdraw(-25));
    }
    @Test
    public void depositAmount() {
    	Account acc = new Account(-20);
    	acc.deposit(250);
    	Assert.assertEquals(acc.getBalance(),250,epsilon);
    }
    @Test
    public void withdrawAmount() {
    	Account acc = new Account(-20);
    	acc.deposit(250);
    	acc.withdraw(100);
    	Assert.assertEquals(acc.getBalance(),150,epsilon);
    }
    
    @Test
    public void wihdrawAndDepositAmountTest() {
    	Account acc = new Account(-20);
    	
    	Assert.assertEquals(acc.deposit(250),acc.withdraw(250));
    }
    
    @Test
    public void overstepTest() {
    	Account acc = new Account(-20);
    	acc.deposit(250);
    	Assert.assertFalse(acc.withdraw(500));
    }
}
