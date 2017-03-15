package com.company;

import java.util.*;

public class Main {
    enum oparator {add, sub, mult, div, error}


    private int add(int a, int b) {

        int result = a + b;
        return result;
    }

    private int subtraction(int a, int b) {

        int result = a - b;
        return result;

    }

    private int multiplication(int a, int b) {

        int result = a * b;
        return result;
    }

    private float division(int a, int b) {

        float result = (float) a / b;
        return result;

    }

    private void str(String data) {

        String second = "";
        String first = "";
        oparator index = oparator.error;
        boolean status = true;
        char str[] = data.toCharArray();
        for (int i = 0; i < data.length(); i++) {

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
                    if (index != oparator.error) {
                        status = false;
                        break;
                    }
                    first = second;
                    second = "";
                    index = oparator.add;
                }
                break;
                case '-': {
                    if (index != oparator.error) {
                        status = false;
                        break;
                    }
                    first = second;
                    second = "";
                    index = oparator.sub;
                }
                break;
                case '*': {
                    if (index != oparator.error) {
                        status = false;
                        break;
                    }
                    first = second;
                    second = "";
                    index = oparator.mult;
                }
                break;
                case '/': {
                    if (index != oparator.error) {
                        status = false;
                        break;
                    }
                    first = second;
                    second = "";
                    index = oparator.div;
                }
                break;
                default: {

                    status = false;
                    break;
                }


            }

        }


        if (status == false || index == oparator.error) {
            System.out.println("The entered data isn`t correct");
        } else {
            int a, b;
            a = Integer.parseInt(first);
            b = Integer.parseInt(second);
            Main result = new Main();
            switch (index) {
                case add:
                    int add = result.add(a, b);
                    System.out.println("In result of add will be = " + add);
                    break;
                case sub:
                    int subtraction = result.subtraction(a, b);
                    System.out.println("In result of subtraction will be = " + subtraction);
                    break;
                case mult:
                    int multiplication = result.multiplication(a, b);
                    System.out.println("In result of multiplication will be = " + multiplication);
                    break;
                case div:
                    float division = result.division(a, b);
                    System.out.println("In result of division will be = " + division);
                    break;
                default:
                    break;
            }

        }


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Main task = new Main();
        System.out.println("Enter the expression");
        String data = in.nextLine();
        task.str(data);

    }
}
