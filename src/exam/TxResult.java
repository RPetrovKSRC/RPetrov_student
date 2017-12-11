package exam;

public enum TxResult {
    SUCCESS(1),
    NOT_ENOUGH(2),
    UNEXPECTED(5);

    private final int code;

    TxResult(int code) {
        this.code = code;
    }

    public int geCode() {
        return code;
    }
}
