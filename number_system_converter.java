import java.util.*;
public class number_system_converter {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Select an option:");
            System.out.println("1. Convert from binary systems, 3,4,5,6,8,9,10, hexadecimal to decimal system");
            System.out.println("2. Convert from decimal system to binary systems, 3,4,5,6,8,9,10, hexadecimal");
            System.out.println("3. Add two numbers (both from any of the above systems)");
            System.out.println("4. Subtract two numbers (both from any of the above systems)");
            System.out.println("5. Multiply two numbers (both from any of the above systems)");
            System.out.println("6. Divide two numbers (both from any of the above systems)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter a number: ");
                    int number1 = input.nextInt();
                    System.out.print("Enter its base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base1 = input.nextInt();
                    int decimal_num = 0;
                    int i= 0;
                    while (number1 > 0) {
                        if (number1 % 10 == 1) {
                            decimal_num += (1 << i);
                        }
                        i++;
                        number1 = number1 / 10;
                    }
                    System.out.println(number1 + " (base " + base1 + ") = " + decimal_num + " (base 10)");



                    break;

                case 2:

                    System.out.print("Enter a decimal number: ");
                    int decimal = input.nextInt();
                    System.out.print("Enter the desired base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base2 = input.nextInt();

                    System.out.println(decimal + " (base 10) = " + Integer.toString(decimal, base2)+ " (base " + base2 + ")");

                    break;

                case 3:

                    System.out.print("Enter the first binary number : ");
                    int  num2 = input.nextInt();
                    System.out.print("Enter its base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base3 = input.nextInt();

                    int binary = 0;
                    int k= 0;
                    while (num2 > 0) {
                        if (num2 % 10 == 1) {
                            binary += (1 << k);
                        }
                        k++;
                        num2 = num2 / 10;
                    }

                    System.out.print("Enter the second number: ");
                    int num3 = input.nextInt();
                    System.out.print("Enter its base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base4 = input.nextInt();

                    int binary2 = 0;
                    int power= 0;
                    while (num3 > 0) {
                        if (num3 % 10 == 1) {
                            binary2 += (1 << power);
                        }
                        power++;
                        num3 = num3 / 10;
                    }
                    int sum = binary2+ binary;
                    System.out.println(num2 + " (base " + base3 + ") + " + num3 + " (base " + base4 + ") = " + sum);
                    break;

                case 4:

                    System.out.print("Enter the first binary number : ");
                    int  num4 = input.nextInt();
                    System.out.print("Enter its base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base5 = input.nextInt();

                    int binary_sub = 0;
                    int a= 0;
                    while (num4 > 0) {
                        if (num4 % 10 == 1) {
                            binary_sub += (1 << a);
                        }
                        a++;
                        num4 = num4 / 10;
                    }

                    System.out.print("Enter the second number: ");
                    int num5 = input.nextInt();
                    System.out.print("Enter its base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base6 = input.nextInt();

                    int binary_sub2 = 0;
                    int p= 0;
                    while (num5 > 0) {
                        if (num5 % 10 == 1) {
                            binary_sub2 += (1 << p);
                        }
                        p++;
                        num5 = num5 / 10;
                    }
                    int subtraction = binary_sub2 - binary_sub;
                    System.out.println(num4 + " (base " + base5 + ") + " + num5 + " (base " + base6 + ") = " + subtraction);
                    break;

                case 5:

                    System.out.print("Enter the first binary number : ");
                    int  num6 = input.nextInt();
                    System.out.print("Enter its base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base7 = input.nextInt();

                    int binary_5 = 0;
                    int pow= 0;
                    while (num6 > 0) {
                        if (num6 % 10 == 1) {
                            binary_5 += (1 << pow);
                        }
                        pow++;
                        num6 = num6 / 10;
                    }

                    System.out.print("Enter the second number: ");
                    int num7 = input.nextInt();
                    System.out.print("Enter its base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base8 = input.nextInt();

                    int binary_6 = 0;
                    int y= 0;
                    while (num7 > 0) {
                        if (num7 % 10 == 1) {
                            binary_6 += (1 << y);
                        }
                        y++;
                        num7 = num7 / 10;
                    }
                    int multiplication = binary_6 * binary_5;
                    System.out.println(num6 + " (base " + base7 + ") + " + num7 + " (base " + base8 + ") = " + multiplication);
                    break;
                case 6:

                    System.out.print("Enter the first binary number : ");
                    int  num8 = input.nextInt();
                    System.out.print("Enter its base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base9 = input.nextInt();

                    int binary_multi = 0;
                    int t= 0;
                    while (num8 > 0) {
                        if (num8 % 10 == 1) {
                            binary_multi += (1 << t);
                        }
                        t++;
                        num8 = num8 / 10;
                    }



                    System.out.print("Enter the second number: ");
                    int num9 = input.nextInt();
                    System.out.print("Enter its base (2, 3, 4, 5, 6, 8, 9, 10, or 16): ");
                    int base10 = input.nextInt();

                    int binary_multi2 = 0;
                    int r= 0;
                    while (num9 > 0) {
                        if (num9 % 10 == 1) {
                            binary_multi2 += (1 << r);
                        }
                        r++;
                        num3 = num9 / 10;
                    }
                    int division = binary_multi/ binary_multi2;
                    System.out.println(num8 + " (base " + base9 + ") + " + num9 + " (base " + base10 + ") = " + division);
                    break;
                default:
                    break;
            }

        }while(choice != 7);
    }
}
