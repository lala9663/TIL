package me.java.datatype;

public class Main {
    public static void main(String[] args) {
        // 리터럴 (literal): 데이터 수
        // 자료형 (datatype)
        //--------------------------
        // 원시형 (primitive type) : 스택 공간
        // int(4byte == 32bit)
        // float(4byte == 32bit)    2^32 -> -2^31 ~ 2^31
        // double(8byte == 64bit)
        // char(2byte == 16bit)
        // 1byte = 8 bit
        // -------------------------
        // 참조형 (reference type)
        // String

        byte b = (byte) 100000; // type casting (명시적 형변환)
        short s = (short) 100000; // type casting
        int i = 10; // 정수의 기본 단위
        long l = 10;    // promotion (자동 형변환)
        float f = 3.14f;
        double d = 3.14;    // 실수의 기본 단위


    }
}
