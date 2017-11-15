class BitDemo {

    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
        byte bits= 0b0000100;
        bits=(byte)(bits<<2);
        bits=(byte)(bits>>2);
        bits=(byte)(bits>>>2);
        byte bitsSigned=-6;
        bitsSigned=(byte)(bitsSigned>>>2);
        System.out.println(bitsSigned);
    }

}
