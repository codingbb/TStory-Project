package site.metacoding.blogv3._core.handler.ex;

// SSR 오류
public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }
}
