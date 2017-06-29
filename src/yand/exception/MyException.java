package yand.exception;

/**
 * Created by yanzz on 2017/3/31.
 * 自定义异常
 */
public class MyException extends RuntimeException {
    private String errorMegg;
    public MyException(String errorMegg){
        super(errorMegg);
        this.errorMegg = errorMegg;
    }

}
