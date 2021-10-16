package src.basic.SOLID;

/**
 * The principle states that the larger interfaces split into smaller ones.
 * Because the implementation classes use only the methods that are required.
 * We should not force the client to use the methods that they do not want to use.
 */

public class ISP_4 implements ConvertCharToString, ConvertIntToDouble, ConvertIntToChar {

    @Override
    public void intToDouble() {

    }

    @Override
    public void intToChar() {

    }

    @Override
    public void charToString() {

    }
}


interface ConvertIntToDouble {
    public void intToDouble();
}

interface ConvertIntToChar {
    public void intToChar();
}

interface ConvertCharToString {
    public void charToString();
}