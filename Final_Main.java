import java.util.*;

public class Final_Main {

    public static void main(String[] args) {

        Integer[] listValues = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        ArrayList<Integer> listValues2 = new ArrayList<>();

        String Choose_option;

        int desired_value;

        while(true) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Menu of Searching and Sorting Testbed. \n");

            System.out.println("1)  Linear searching");

            System.out.println("2)  Binary Searching");

            System.out.println("3)  O(n^2) type of sorting");

            System.out.println("4)  O(n*log(n)) type of sorting");

            System.out.println("5)  Sorting performance");

            System.out.println("q/Q Quit");

            System.out.print("Your choice:");

            Choose_option = sc.nextLine();

            if(!(Choose_option.equals ("1")|| (Choose_option.equals ("2") || (Choose_option.equals ("3") || (Choose_option.equals ("4")|| (Choose_option.equals ("5") ||
                    (Choose_option.equals ("q") || Choose_option.equals ("Q") || Choose_option.equals ("quit") || Choose_option.equals("Quit"))))))))

            {
                System.out.println("\nNo option found.");

                break;

            }
            System.out.println("\n");

            switch (Choose_option) {

                case "1":

                    System.out.print("In the list are values 0, .... ,9; which value would you like to search with linear search? " );
                    desired_value = sc.nextInt();

                    if ((Linear_Search.linear_search(listValues, 0, 9, desired_value)))
                        System.out.print("Found\n");

                    else System.out.println("Not found\n");

                    System.out.println("\n");
                    break;

                case "2":

                    System.out.print("In the list are values 0, .... ,9; which value would you like to search with linear search? " );
                    desired_value = sc.nextInt();

                    if ((Binary_Search.binarySearch(listValues, 0, 9, desired_value)))
                        System.out.print("Value found\n");

                    else System.out.println("Value not found\n");

                    System.out.println("\n");
                    break;


                case "3":

                    System.out.println("Data set before insertion sort:");
                    for (int i = 0; i < 9; i++) {
                        listValues2.add((int) (Math.random() * (201) - 100));
                        System.out.print(listValues2.get(i) + " ");
                    }

                    System.out.println("\n Data set after insertion sort:");

                        Integer[] Array_values = listValues2.toArray(new Integer[0]);
                        Insertion_Sort.insertionSort(Array_values);

                        for (int i = 0; i < 9; i++) {
                            System.out.print(Array_values[i]+" ");
                        }

                        System.out.println(" \n");

                        listValues2.clear();

                        break;

                case "4":

                    System.out.println("Data set before quick sort:");
                    for (int i = 0; i < 9; i++) {
                        listValues2.add((int) (Math.random() * (201) - 100));
                        System.out.print(listValues2.get(i) + " ");
                    }

                    System.out.println("\n Data set after quick sort:");

                    Integer[] Array_values_2 = listValues2.toArray(new Integer[0]);
                    Quick_Sort.quickSort(Array_values_2);

                    for (int i = 0; i < 9; i++) {
                        System.out.print(Array_values_2[i]+" ");
                    }

                    System.out.println(" \n");

                    listValues2.clear();

                    break;

                case "5":

                    System.out.println("\n");


                    }


            }


        }


    }

