package com.company;

import java.util.*;

public class Main {

    private void add(int a, int b) {

        int add = a + b;
        System.out.println("В результате суммирования получилось = " + add);
    }

    private void del(int a, int b) {

        int del = a - b;
        System.out.println("В результате вычитания получилось = " + del);
    }

    private void mnog(int a, int b) {

        int mnog = a * b;
        System.out.println("В результате умножения получилось = " + mnog);
    }

    private void dilen(int a, int b) {

        float dilen = (float) a / b;
        System.out.println("В результате деления получилось = " + dilen);
    }

    private void str(String data) {

        String s = "";
        String m = "";
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
                    s += data.substring(0 + i, 1 + i);
                    break;
                case ' ':
                    break;
                case '+': {
                    if (index != 0) {
                        i = data.length() - 1;
                        m = "";
                    }
                    m = s;
                    s = "";
                    index = 1;
                }
                break;
                case '-': {
                    if (index != 0) {
                        i = data.length() - 1;
                        m = "";
                    }
                    m = s;
                    s = "";
                    index = 2;
                }
                break;
                case '*': {
                    if (index != 0) {
                        i = data.length() - 1;
                        m = "";
                    }
                    m = s;
                    s = "";
                    index = 3;
                }
                break;
                case '/': {
                    if (index != 0) {
                        i = data.length() - 1;
                        m = "";
                    }
                    m = s;
                    s = "";
                    index = 4;
                }
                break;
                default: {

                    i = data.length() - 1;
                    s = "";
                    m = "";

                }


            }

        }

        //Обрати внимание правильное ли отрицание?
        if (!s.equals("") && !m.equals("") && index != 0) {
            int a, b;
            a = Integer.parseInt(m);
            b = Integer.parseInt(s);
            Main result = new Main();
            switch (index) {
                case 1:
                    result.add(a, b);
                    break;
                case 2:
                    result.del(a, b);
                    break;
                case 3:
                    result.mnog(a, b);
                    break;
                case 4:
                    result.dilen(a, b);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Введеные даннные не верны");
        }



    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Main task = new Main();
        System.out.println("Введите выражение");
        String data = in.nextLine();
        task.str(data);

    }
}
