package test;
import main.BalancedBrackets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    @Test
    public void OneBracketAtStartAndEndReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launchCode]"));
    }

    @Test
    public void bracketsAtBeginningReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]launchCode"));
    }

    @Test
    public void bracketsAtEndReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("launchCode[]"));
    }

    @Test
    public void multipleBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launch][Code]"));
    }

    @Test
    public void backwardsBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyClosedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void oddNumberOfBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][]]"));
    }

}
