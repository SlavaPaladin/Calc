package com.company;

import java.util.*;

public class Calc {
    enum operation {add, sub, mult, div, error}

    private int add(int a, int b) {

        return a + b;
    }

    private int subtraction(int a, int b) {

        return a - b;
    }

    private int multiplication(int a, int b) {

        return a * b;
    }

    private float division(int a, int b) {

        return (float) a / b;
    }

    private void str(String data) {

        String second = "";
        String first = "";
        operation index = operation.error;
        boolean status = true;
        char str[] = data.toCharArray();
        for (int i = 0; i < data.length(); i++) {
            if (!status) {
                break;
            }
            switch (str[i]) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    second += str[i];
                    break;
                case ' ':
                    break;
                case '+': {
                    if (index != operation.error) {
                        status = false;
                        break;
                    }
                    first = second;
                    second = "";
                    index = operation.add;
                }
                break;
                case '-': {
                    if (index != operation.error) {
                        status = false;
                        break;
                    }
                    first = second;
                    second = "";
                    index = operation.sub;
                }
                break;
                case '*': {
                    if (index != operation.error) {
                        status = false;
                        break;
                    }
                    first = second;
                    second = "";
                    index = operation.mult;
                }
                break;
                case '/': {
                    if (index != operation.error) {
                        status = false;
                        break;
                    }
                    first = second;
                    second = "";
                    index = operation.div;
                }
                break;
                default: {

                    status = false;
                }


            }

        }


        if (!status || index == operation.error) {
            System.out.println("The entered data isn`t correct");
        } else {
            int a, b;
            a = Integer.parseInt(first);
            b = Integer.parseInt(second);
            Calc result = new Calc();
            switch (index) {
                case add:
                    System.out.println("In result of add will be = " + result.add());
                    break;
                case sub:
                    System.out.println("In result of subtraction will be = " + result.subtraction(a, b));
                    break;
                case mult:
                    System.out.println("In result of multiplication will be = " + result.multiplication(a, b));
                    break;
                case div:
                    System.out.println("In result of division will be = " + result.division(a, b));
                    break;
                default:
            }

        }


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Calc task = new Calc();
        System.out.println("Enter the expression");
        String data = in.nextLine();
        task.str(data);

    }
}
