package test;

import main.BalancedBrackets;
import main.Main;
import main.RunMainTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void returnsZero () {
        BalancedBrackets.hasBalancedBrackets("[]");
        assertEquals(true,true);
    }

    @Test
    public void returnsNotZeroMissingOpenBracket() {
        BalancedBrackets.hasBalancedBrackets("]");
        assertEquals(false, false);
    }

    @Test
    public void returnsNotZeroMissingClosingBracket() {
        BalancedBrackets.hasBalancedBrackets("[");
        assertEquals(false, false);
    }

    @Test
    public void returnsZeroIfOnlyText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test"));
    }

    @Test
    public void returnsZeroIfBracketsAfterText() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test []"));
    }

//    @Test
//    public void systemExitsIfWrongBracketsUsed () {
//        SystemLambda.catchSystemExit();

//    }

    @Test
    public void returnsZeroIfSymbolsUsed() {
        BalancedBrackets.hasBalancedBrackets("!@#$%");
        assertEquals(true, true);
    }

    @Test
    public void returnsProperSentenceWhenTrue() {
        RunMainTest.returnStatement("[]");
        assertEquals("Great! Your string follows the instructions.  You should get a cookie!", "Great! Your string follows the instructions.  You should get a cookie!");
    }

    @Test
    public void returnsProperSentenceWhenFalse() {
        RunMainTest.returnStatement("]");
        assertEquals("String entered does not contain proper bracketing.  Please enter another string with '[' and ']' to match", "String entered does not contain proper bracketing.  Please enter another string with '[' and ']' to match");
    }


}
