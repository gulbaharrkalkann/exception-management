package com.gulkalkan.Exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Fallback;



public class BaseException extends RuntimeException{



    public BaseException() {


    }

    public BaseException(ErrorMessage errorMessage) {
        super(errorMessage.prepareErrorMessage());
    }
}

