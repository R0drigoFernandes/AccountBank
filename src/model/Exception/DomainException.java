package model.Exception;

import java.io.Serial;
import java.io.Serializable;

public class DomainException extends RuntimeException implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;



    public DomainException(String msg) {
        super(msg);
    }
}
