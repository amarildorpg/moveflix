package br.com.moveflix.exception;

public class UsernameOrPasswordInvalidException extends RuntimeException{
    public UsernameOrPasswordInvalidException(String message){
        super(message);
    }
}
