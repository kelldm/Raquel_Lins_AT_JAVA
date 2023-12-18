package org.example;

public class Calculadora {
        public static String somar(NumComplexo num1, NumComplexo num2) {
            return NumComplexo.somar(num1, num2).toString();
        }

        public static String subtrair(NumComplexo num1, NumComplexo num2) {
            return NumComplexo.subtrair(num1, num2).toString();
        }

        public static String modulo(NumComplexo num) {
            return String.valueOf(num.modulo());
        }
    }


