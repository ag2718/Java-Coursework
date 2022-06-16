public class IntegerDataTypes {
    public static void main(String[] args) {

        // int has a width of 32
        int minInt = -2_147_483_648;
        int maxInt = 2_147_483_647;

        // byte has a width of 8
        byte minByte = -128;
        byte maxByte = 127;

        // short has a width of 16
        short minShort = -32768;
        short maxShort = 32767;

        //long has a width of 64
        long minLong = -9_223_372_036_854_775_808L;
        long maxLong = 9_223_372_036_854_775_807L;

        //Combining data types
        byte myByteValue = 54;
        short myShortValue = 1000;
        int myIntValue = 1546;
        long myLongValue = (long) (50000 + 10 * myByteValue + myShortValue + myIntValue);
        System.out.println(myLongValue);

    }
}
