package Util;

/**
 * @author Globalcode
 * 
 */
public class JavaWebExceptionCapture extends Exception {

    public JavaWebExceptionCapture(String mensagem, Exception e) {
        super(mensagem, e);
    }

    public JavaWebExceptionCapture(String mensagem) {
        super(mensagem);
    }
}
