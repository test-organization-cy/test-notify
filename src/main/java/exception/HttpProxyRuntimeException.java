package exception;

/**
 * Created by weibi on 2018/6/4.git
 *
 * @author weibi
 * @date 2018/06/04
 */
public class HttpProxyRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -148541217700174436L;

    public HttpProxyRuntimeException() {
    }

    public HttpProxyRuntimeException(String message) {
        super(message);
    }

    public HttpProxyRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpProxyRuntimeException(Throwable cause) {
        super(cause);
    }

    public HttpProxyRuntimeException(String message, Throwable cause, boolean enableSuppression,
        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
