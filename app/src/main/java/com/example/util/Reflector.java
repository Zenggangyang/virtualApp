package com.example.util;

import androidx.annotation.NonNull;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * create by wan
 * 一个 伟大的 反射封装类
 */
public class Reflector {

    public static class RefectedException extends Exception{
        public RefectedException(String message,Throwable e){
            super(message,e);
        }
    }

    protected Field mField = null;
    protected Method mMethod = null;
    protected Class<?> mType = null;

    public Reflector(){

    }

    public static Reflector on(@NonNull String name) throws RefectedException{
        try {
            return on(Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RefectedException("",e);
        }
    }

    public static Reflector on(Class<?> mType){
        Reflector reflector = new Reflector();
        reflector.mType = mType;
        return reflector;
    }

    public Reflector findField(@NonNull String fieldName) throws NoSuchFieldException{
        try {
            mField = this.mType.getDeclaredField(fieldName);
            mField.setAccessible(true);
            return this;
        } catch (NoSuchFieldException e) {
            throw e;
        }
    }

    public Object getInstanceField(@NonNull Object caller) throws IllegalAccessException{

        try {
            return this.mField.get(caller);
        } catch (IllegalAccessException e) {
            throw e;
        }
    }

    public Object getStaticField() throws IllegalAccessException{

        try {
            return this.mField.get(null);
        } catch (IllegalAccessException e) {
            throw e;
        }
    }

    public Reflector findMethod(@NonNull String methodName,Class<?>...parameterTypes) throws NoSuchMethodException{
        try {
            mMethod = this.mType.getDeclaredMethod(methodName,parameterTypes);
            mMethod.setAccessible(true);
            return this;
        } catch (NoSuchMethodException e) {
            throw e;
        }
    }

    public Reflector setStaticField(Object object,Object value){

        try {
            mField.set(object,value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }

    public Reflector setInstanceField(@NonNull Object caller,Object value){

        try {
            mField.set(caller,value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return this;
    }










}
