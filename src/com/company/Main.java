package com.company;

import java.util.*;

public class Main {

    private int add(int a, int b) {

        int add = a + b;
        return add;
    }

    private int subtraction(int a, int b) {

        int subtraction = a - b;
        return subtraction;

    }

    private int multiplication(int a, int b) {

        int multiplication = a * b;
        return multiplication;
    }

    private float segmentation(int a, int b) {

        float segmentation = (float) a / b;
        return segmentation;

    }

    private void str(String data) {

        String second = "";
        String first = "";
        int index = 0;

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
                    if (index != 0) {
                        first = "";
                        break;
                    }
                    first = second;
                    second = "";
                    index = 1;
                }
                break;
                case '-': {
                    if (index != 0) {
                        first = "";
                        break;
                    }
                    first = second;
                    second = "";
                    index = 2;
                }
                break;
                case '*': {
                    if (index != 0) {
                        first = "";
                        break;
                    }
                    first = second;
                    second = "";
                    index = 3;
                }
                break;
                case '/': {
                    if (index != 0) {
                        first = "";
                        break;
                    }
                    first = second;
                    second = "";
                    index = 4;
                }
                break;
                default: {

                    second = "";
                    first = "";
                    break;
                }


            }

        }


        if (second.equals("") || first.equals("") || index == 0) {
            System.out.println("The entered data isn`t correct");
        }

        else {
            int a, b;
            a = Integer.parseInt(first);
            b = Integer.parseInt(second);
            Main result = new Main();
            switch (index) {
                case 1:
                    int add = result.add(a, b);
                    System.out.println("In result of add will be = " + add);
                    break;
                case 2:
                    int subtraction = result.subtraction(a, b);
                    System.out.println("In result of subtraction will be = " + subtraction);
                    break;
                case 3:
                    int multiplication = result.multiplication(a, b);
                    System.out.println("In result of multiplication will be = " + multiplication);
                    break;
                case 4:
                    float segmentation = result.segmentation(a, b);
                    System.out.println("In result of segmentation will be = " + segmentation);
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
