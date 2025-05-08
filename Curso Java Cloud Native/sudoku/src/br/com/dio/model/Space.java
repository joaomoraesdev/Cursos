package br.com.dio.model;

public class Space {
    private Integer actual;
    private final int EXPECTED;
    private final boolean FIXED;

    public Space(final int expected, final boolean fixed) {
        EXPECTED = expected;
        FIXED = fixed;
        if (FIXED)
            actual = expected;
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) {
        if (FIXED)
            return;
        this.actual = actual;
    }

    public void clearSpace() {
        setActual(null);
    }

    public int getEXPECTED() {
        return EXPECTED;
    }

    public boolean isFIXED() {
        return FIXED;
    }

}
