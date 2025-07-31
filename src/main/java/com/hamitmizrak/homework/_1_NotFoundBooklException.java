package com.hamitmizrak.homework;


// 3- Customise Exception : Kitap bulunmazsa
public class _1_NotFoundBooklException extends RuntimeException {
    public _1_NotFoundBooklException(String message) {
        super(message);
    }
}
