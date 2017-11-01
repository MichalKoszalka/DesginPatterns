package factory.simple;

public class UnsupportedCarTypeException extends IllegalArgumentException {

    public UnsupportedCarTypeException() {
        super();
    }

    public UnsupportedCarTypeException(String s) {
        super(s);
    }


}
