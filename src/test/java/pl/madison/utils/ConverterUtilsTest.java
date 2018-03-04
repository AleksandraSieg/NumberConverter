package pl.madison.utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ConverterUtilsTest {
    private ConverterUtils converterUtils = new ConverterUtils();

    @Test
    public void toBinarySystem17() throws Exception {
        assertEquals("10001", converterUtils.fromDecimalToBinarySystem(17));
    }

    @Test
    public void toBinarySystem32() throws Exception {
        assertEquals("100000", converterUtils.fromDecimalToBinarySystem(32));
    }

    @Test
    public void toDecimalSystem32fromBinar() throws Exception {
        List<Integer> number = Arrays.asList(1, 0, 0, 0, 0, 0);

        assertEquals(32, converterUtils.fromBinarySystemToDecimal(number));
    }

    @Test
    public void toDecimalSystem17fromBinar() throws Exception {
        List<Integer> number = Arrays.asList(1, 0, 0, 0, 1);

        assertEquals(17, converterUtils.fromBinarySystemToDecimal(number));
    }

    @Test
    public void toDecimalToOctal67() throws Exception {
        assertEquals("103", converterUtils.fromDecimalToOctal(67));
    }

    @Test
    public void toOctalToDecimal45() throws Exception {
        List<Integer> number = Arrays.asList(5, 5);
        assertEquals(45, converterUtils.fromOctalToDecimal(number));
    }

    @Test
    public void toHexadecimal3456() throws Exception {
        List<String> number = Arrays.asList("D", "8", "0");
        assertEquals(number, converterUtils.fromDecimalToHexadecimal(3456));
    }





}