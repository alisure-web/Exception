package test.spring.exception;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import test.spring.result.Result;

import java.io.IOException;

/**
 * Created by ALISURE on 2017/3/24.
 */
@ControllerAdvice
public class RestExceptionHandler {
    //自定义异常
    @ExceptionHandler(ALISUREException.class)
    @ResponseBody
    public String AlisureExceptionHandler(ALISUREException alisureException){
        return new Result(1111,"ALISUREException").toString();
    }

    //运行时异常
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String runtimeExceptionHandler(RuntimeException runtimeException) {
        return new Result(1000, "RuntimeException").toString();
    }

    //空指针异常
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public String nullPointerExceptionHandler(NullPointerException ex) {
        return new Result(1001, "NullPointerException").toString();
    }
    //类型转换异常
    @ExceptionHandler(ClassCastException.class)
    @ResponseBody
    public String classCastExceptionHandler(ClassCastException ex) {
        return new Result(1002, "NullPointerException").toString();
    }

    //IO异常
    @ExceptionHandler(IOException.class)
    @ResponseBody
    public String iOExceptionHandler(IOException ex) {
        return new Result(1003, "IOException").toString();
    }

    //未知方法异常
    @ExceptionHandler(NoSuchMethodException.class)
    @ResponseBody
    public String noSuchMethodExceptionHandler(NoSuchMethodException ex) {
        return new Result(1004, "NoSuchMethodException").toString();
    }

    //数组越界异常
    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseBody
    public String indexOutOfBoundsExceptionHandler(IndexOutOfBoundsException ex) {
        return new Result(1005, "IndexOutOfBoundsException").toString();
    }

    //400错误
    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseBody
    public String requestNotReadable(HttpMessageNotReadableException ex){
        return new Result(400, "HttpMessageNotReadableException").toString();
    }

    //400错误
    @ExceptionHandler({TypeMismatchException.class})
    @ResponseBody
    public String requestTypeMismatch(TypeMismatchException ex){
        return new Result(400, "TypeMismatchException").toString();
    }

    //400错误
    @ExceptionHandler({MissingServletRequestParameterException.class})
    @ResponseBody
    public String requestMissingServletRequest(MissingServletRequestParameterException ex){
        ex.printStackTrace();
        return new Result(400, "MissingServletRequestParameterException").toString();
    }

    //405错误
    @ExceptionHandler({HttpRequestMethodNotSupportedException.class})
    @ResponseBody
    public String request405(){
        return new Result(405, "HttpRequestMethodNotSupportedException").toString();
    }

    //406错误
    @ExceptionHandler({HttpMediaTypeNotAcceptableException.class})
    @ResponseBody
    public String request406(){
        return new Result(406, "HttpMediaTypeNotAcceptableException").toString();
    }

    //500错误
    @ExceptionHandler({ConversionNotSupportedException.class,HttpMessageNotWritableException.class})
    @ResponseBody
    public String server500(RuntimeException runtimeException){
        return new Result(500, "RuntimeException").toString();
    }
}
