package org.example;

public class NumComplexo {
        private double real;
        private double imaginario;

        public double getReal() {return real;}

        public void setReal(double real) {this.real = real;}

        public double getImaginario() {return imaginario;}

        public void setImaginario(double imaginario) {this.imaginario = imaginario;}

        public NumComplexo(double parteReal, double parteImaginaria) {
            this.real = parteReal;
            this.imaginario = parteImaginaria;
        }
        /////

    public static NumComplexo subtrair(NumComplexo num1, NumComplexo num2) {
        return new NumComplexo(num1.real - num2.real, num1.imaginario - num2.imaginario);
    }
        public static NumComplexo somar(NumComplexo num1, NumComplexo num2) {
            return new NumComplexo(num1.real + num2.real, num1.imaginario + num2.imaginario);
        }

        public double modulo() {
            return Math.sqrt(real * real + imaginario * imaginario);
        }

        public String toString() {
            if (imaginario >= 0) {
                return real + " + " + imaginario + "i";
            } else {
                return real + " - " + Math.abs(imaginario) + "i";
            }
        }
    }


