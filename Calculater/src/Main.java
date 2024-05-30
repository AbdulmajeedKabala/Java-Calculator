import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Welcome to the Calculator. This calculator can solve basic arithmetic expressions, square root, exponents, and geometric equations such as the area, surface area, volume, and circumference of certain shapes.");
        System.out.println("To get started, please enter the corresponding letter in the brackets for the type of expression you");
        System.out.println("-   [A] for Arithmetic (addition, subtraction, division, multiplication)");
        System.out.println("-   [S] for Square Root");
        System.out.println("-   [E] for Exponent");
        System.out.println("-   [G] for Geometric Equation");

        String userChoice = scan.nextLine();
        try {
            switch (userChoice) {
                case "A":
                    try {
                        System.out.println("Please enter your arithmetic problem: ");
                        String userProblem = scan.nextLine();

                        if (userProblem.contains("+")) {
                            String[] additionParts = userProblem.split("\\+");
                            int answer = Integer.parseInt(additionParts[0]) + Integer.parseInt(additionParts[1]);
                            System.out.println("The answer is: " + answer);
                        } else if (userProblem.contains("-")) {
                            String[] additionParts = userProblem.split("-");
                            int answer = Integer.parseInt(additionParts[0]) - Integer.parseInt(additionParts[1]);
                            System.out.println("The answer is: " + answer);
                        } else if (userProblem.contains("*")) {
                            String[] additionParts = userProblem.split("\\*");
                            int answer = Integer.parseInt(additionParts[0]) * Integer.parseInt(additionParts[1]);
                            System.out.println("The answer is: " + answer);
                        } else if (userProblem.contains("/")) {
                            String[] additionParts = userProblem.split("/");
                            int answer = Integer.parseInt(additionParts[0]) / Integer.parseInt(additionParts[1]);
                            System.out.println("The answer is: " + answer);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid problem in the following format: 9+9");
                    }
                case "S":
                    try {
                        System.out.println("Please enter your number to find the square root: ");
                        String userProblem = scan.nextLine();
                        int takeRoot = Integer.parseInt(userProblem);
                        double answer = Math.sqrt(takeRoot);
                        System.out.println("The answer is: " + answer);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }

                case "E":
                    try {
                        System.out.println("Please enter your exponent problem: ");
                        String userProblem = scan.nextLine();
                        String[] exponentParts = userProblem.split("\\^");
                        int answer = (int) Math.pow(Integer.parseInt(exponentParts[0]),Integer.parseInt(exponentParts[1]));
                        System.out.println("The answer is: " + answer);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }

                case "G":
                    try{
                    System.out.println("Do you want to solve for area, surface area, volume, or circumference?: ");
                    String userChoice2 = scan.nextLine();
                    switch (userChoice2) {
                        case "area":
                            System.out.println("Please enter the shape to find the area of: ");
                            String userShape = scan.nextLine();
                            switch (userShape) {
                                case "square":
                                    System.out.println("Please enter the length of the sides of your square: ");
                                    String sideLength = scan.nextLine();
                                    int answer = Integer.parseInt(sideLength) * Integer.parseInt(sideLength);
                                    System.out.println("The area is: " + answer);
                                case "circle":
                                    System.out.println("Please enter the radius: ");
                                    String radius = scan.nextLine();
                                    double answer2 = Integer.parseInt(radius) * Integer.parseInt(radius) * 3.14;
                                    System.out.println("The area is: " + answer2);
                                case "rectangle":
                                    System.out.println("Please enter the width of the rectangle: ");
                                    String width = scan.nextLine();
                                    System.out.println("Please enter the height of the rectangle: ");
                                    String height = scan.nextLine();
                                    double answer3 = Integer.parseInt(width) * Integer.parseInt(height) * 3.14;
                                    System.out.println("The area is: " + answer3);
                                case "triangle":
                                    System.out.println("Please enter the length of the base of the triangle: ");
                                    String baseTriangle = scan.nextLine();
                                    System.out.println("Please enter the height of the triangle: ");
                                    String heightTriangle = scan.nextLine();
                                    double answer4 = (Double.parseDouble(baseTriangle) / 2) * Integer.parseInt(heightTriangle);
                                    System.out.println("The area is: " + answer4);
                                    break;

                            }
                        case "surface area":
                            System.out.println("Please enter the shape you want to find the surface area of: ");
                            String userShape2 = scan.nextLine();
                            switch (userShape2) {
                                case "cube":
                                    System.out.println("Please enter the length of your cube: ");
                                    String sideLength = scan.nextLine();
                                    int answer2 = Integer.parseInt(sideLength) * Integer.parseInt(sideLength) * 6;
                                    System.out.println("The area is: " + answer2);
                                case "sphere":
                                    System.out.println("Please enter the radius of the sphere: ");
                                    String radius = scan.nextLine();
                                    double answer3 = Integer.parseInt(radius) * Integer.parseInt(radius) * 4 * 3.14;
                                    System.out.println("The area is: " + answer3);
                                case "rectangular prism":
                                    System.out.println("Please enter the length of the prism: ");
                                    String rectPrismLength = scan.nextLine();
                                    System.out.println("Please enter the width of the prism: ");
                                    String rectPrismWidth = scan.nextLine();
                                    System.out.println("Please enter the height of the prism: ");
                                    String rectPrismHeight = scan.nextLine();
                                    double answer4 = 2 * (Double.parseDouble(rectPrismLength) * Integer.parseInt(rectPrismWidth) + Double.parseDouble(rectPrismHeight) * Double.parseDouble(rectPrismLength) + Double.parseDouble(rectPrismWidth) * Double.parseDouble(rectPrismHeight));
                                    System.out.println("The surface area is: " + answer4);
                                case "cylinder":
                                    System.out.println("Please enter the radius of the cylinder: ");
                                    String cylinderRadius = scan.nextLine();
                                    System.out.println("Please enter the height of the cylinder: ");
                                    String cylinderHeight = scan.nextLine();
                                    double answer5 = 2 * 3.14 + Double.parseDouble(cylinderRadius) * Double.parseDouble(cylinderHeight) + 2 * 3.14 * Double.parseDouble(cylinderRadius) * Double.parseDouble(cylinderRadius);
                                    System.out.println("The cylinder surface area is: " + answer5);
                                    break;
                            }
                        case "volume":
                            System.out.println("Please enter the shape you want to find the volume of: ");
                            String userShape3 = scan.nextLine();
                            switch (userShape3) {
                                case "rectangular prism":
                                    System.out.println("Please enter the length of the prism: ");
                                    String rectPrismLength = scan.nextLine();
                                    System.out.println("Please enter the width of the prism: ");
                                    String rectPrismWidth = scan.nextLine();
                                    System.out.println("Please enter the height of the prism: ");
                                    String rectPrismHeight = scan.nextLine();
                                    double answer = Double.parseDouble(rectPrismHeight) * Double.parseDouble(rectPrismWidth) * Double.parseDouble(rectPrismLength);
                                    System.out.println("The volume is: " + answer);
                                case "cylinder":
                                    System.out.println("Please enter the radius of the cylinder: ");
                                    String cylinderRadius = scan.nextLine();
                                    System.out.println("Please enter the height of the cylinder: ");
                                    String cylinderHeight = scan.nextLine();
                                    double answer2 = 3.14 * Double.parseDouble(cylinderRadius) * Double.parseDouble(cylinderRadius) * Double.parseDouble(cylinderHeight);
                                    System.out.println("The volume is: " + answer2);
                                case "sphere":
                                    System.out.println("Please enter the radius of the sphere: ");
                                    String sphereRadius = scan.nextLine();
                                    double answer3 = ((double) 4 / 3) * 3.14 * Double.parseDouble(sphereRadius) * Double.parseDouble(sphereRadius) * Double.parseDouble(sphereRadius);
                                    System.out.println("The volume is: " + answer3);
                                case "cube":
                                    System.out.println("Please enter the length of the cube: ");
                                    String cubeLength = scan.nextLine();
                                    double answer4 = Double.parseDouble(cubeLength) * Double.parseDouble(cubeLength) * Double.parseDouble(cubeLength);
                                    System.out.println("The volume is: " + answer4);
                                    break;
                            }
                        case "circumference":
                            System.out.println("Please enter the length of the radius: ");
                            String circumference = scan.nextLine();
                            double answer = 2 * 3.14 * Double.parseDouble(circumference);
                            System.out.println("The circumference is: " + answer);
                    }
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    }