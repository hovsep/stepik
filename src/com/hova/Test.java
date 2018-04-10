package com.hova;


public class Test {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        String caller = "";

        try {
            throw new Exception("Dummy");

        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            if (stackTrace.length < 3) {
                caller = null;
            } else {
                StackTraceElement ste = stackTrace[2];
                caller = ste.getClassName() + "#" + ste.getMethodName();
            }

        }

        return caller;
    }

}
