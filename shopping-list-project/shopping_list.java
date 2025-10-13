import java.util.ArrayList;
import java.util.Scanner;

public class shopping_list {
    public static void main(String[] args) {
            ArrayList<String> inputList = new ArrayList<>();

                    Scanner scanner = new Scanner(System.in);

                            System.out.println("Type in your Shopping List(Type \"done\" to finish.):");
                                    String line;
                                            // continuously read input, with exception for "done"
                                                    while (true) {
                                                                line = scanner.nextLine();

                                                                            if (line.equalsIgnoreCase("done")) {
                                                                                            break; // exit loop
                                                                                                        }

                                                                                                                    inputList.add(line);
                                                                                                                            }
                                                                                                                                    // count shopping list
                                                                                                                                            int count = inputList.toArray().length;

                                                                                                                                                    System.out.println("\nYou have " + count + " items in your cart");
                                                                                                                                                            // print cart
                                                                                                                                                                    for (String item : inputList) {
                                                                                                                                                                                System.out.println("- " + item);
                                                                                                                                                                                        }

                                                                                                                                                                                                System.out.print("Enter an item to search for: ");
                                                                                                                                                                                                        String searchItem = scanner.nextLine(); // read system.in

                                                                                                                                                                                                                boolean found = false;
                                                                                                                                                                                                                        for (String search : inputList) { // Iterate through the ArrayList
                                                                                                                                                                                                                                    if (search.equalsIgnoreCase(searchItem)) { // Perform case-insensitive comparison
                                                                                                                                                                                                                                                    System.out.println(searchItem + " found in your cart!");
                                                                                                                                                                                                                                                                    found = true;
                                                                                                                                                                                                                                                                                } else if (searchItem.equalsIgnoreCase("exit")) {
                                                                                                                                                                                                                                                                                                System.out.println("exiting...");
                                                                                                                                                                                                                                                                                                                found = true;
                                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                            if (!found) {
                                                                                                                                                                                                                                                                                                                                                                        System.out.println(searchItem + " was not found in your cart.");
                                                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                                                        scanner.close();
                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                            }