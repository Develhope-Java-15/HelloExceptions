public class PowerException extends Exception {
    private boolean isBaseZero;

    public PowerException(boolean isBaseZero) {
        this.isBaseZero = isBaseZero;
    }

    public boolean isBaseZero() {
        return isBaseZero;
    }
}
