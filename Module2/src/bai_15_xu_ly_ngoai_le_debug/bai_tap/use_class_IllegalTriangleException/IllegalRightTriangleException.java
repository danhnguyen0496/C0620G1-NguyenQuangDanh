package bai_15_xu_ly_ngoai_le_debug.bai_tap.use_class_IllegalTriangleException;

public class IllegalRightTriangleException extends Exception {
    public IllegalRightTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Cạnh nhập vào chưa hợp lệ " + super.getMessage();
    }
}

