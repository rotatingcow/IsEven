package com.rotatingcow;

import java.io.IOException;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class IsEven {
    static Integer num = 300000000;
  
    public static void main(String[] args) {
        try {
            org.openjdk.jmh.Main.main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Integer i = 0; i< 100; i++){
            System.out.println(isEven(Integer.valueOf(i.toString().substring(i.toString().length()-1))));
        }

    }


    static boolean isEven(int num){
        if(num == 0 ){
            return true;
        }else if(num == 1){
            return false;
        }else if(num < 2){
            return (isEven(-num));
        }else{
            return isEven(num-2);
        }
    }
    
    static boolean isOdd(int num){
        return(isEven(num+1));
    }


    static boolean wasEven(int num, int addend){
        num += addend;
        return(isEven(num - addend) && isDivisibleByTwo(num - addend) && isEvenAndNotOdd(num - addend) && isOddOrEven(num - addend));
    }

    static boolean wouldBeEven(int num){
       return isEven(num+1);
    }

    static boolean isOddOrEven(int num){
        return(isOdd(num) || isEven(num));
    }

    static boolean isNotOddOrNotEven(int num) {
        return(!isOdd(num) || !isEven(num));
    }

    static boolean isOddAndEven(int num){
        return(isOdd(num) && isEven(num));
    }

    static boolean isNotOddAndNotEven(int num){
        return (!isOdd(num) && !isEven(num));
    }

    static boolean isEvenAndNotOdd(int num){
        return(isEven(num) && !isOdd(num));
    }

    static boolean isOddAndNotEven(int num){
        return(isOdd(num) && !isEven( num));
    }

    static boolean isDivisibleByTwo(int num){
        return(num % 2 == 0);
    }

    static boolean isTheOriginalEven(int num){
        return (num == 2);
    }

    static boolean isNotTheOriginalEven(int num) {
        return (num != 2);
    }

    static boolean isSuperEven(int num) {
        return false;
    }

    static boolean isEven(String num){
        return false;
    }

    static boolean isOdd(String num){
        return false;
    }

    static boolean isEven(boolean num){
        return false;
    }

    static boolean isOdd(boolean num){
        return false;
    }
}
