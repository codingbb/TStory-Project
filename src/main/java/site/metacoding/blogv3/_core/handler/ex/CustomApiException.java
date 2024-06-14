package site.metacoding.blogv3._core.handler.ex;

// Ajax 오류
public class CustomApiException extends RuntimeException {
    public CustomApiException(String message) {
        super(message);
    }
}
