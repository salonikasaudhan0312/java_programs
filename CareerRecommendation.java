import java.util.Scanner;

public class CareerRecommendation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     SMART CAREER RECOMMENDATION");
        System.out.println("====================================");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println();
        System.out.println("Choose your strongest interest:");
        System.out.println("1. Coding");
        System.out.println("2. Data and Mathematics");
        System.out.println("3. Artificial Intelligence");
        System.out.println("4. Web Development");
        System.out.println("5. Cyber Security");

        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        String career = "";
        String skills = "";

        if (choice == 1) {

            career = "Software Developer";
            skills = "Java, DSA, OOP, Git and Problem Solving";

        } else if (choice == 2) {

            career = "Data Analyst";
            skills = "Python, SQL, Excel, Statistics and Power BI";

        } else if (choice == 3) {

            career = "AI/ML Engineer";
            skills = "Python, Machine Learning, Mathematics and Deep Learning";

        } else if (choice == 4) {

            career = "Full Stack Developer";
            skills = "HTML, CSS, JavaScript, React, Node.js and Database";

        } else if (choice == 5) {

            career = "Cyber Security Analyst";
            skills = "Networking, Linux and Security Fundamentals";

        } else {

            career = "Invalid Choice";
            skills = "Please enter a number between 1 and 5";
        }

        System.out.println();
        System.out.println("====================================");
        System.out.println("          CAREER RESULT");
        System.out.println("====================================");

        System.out.println("Name: " + name);
        System.out.println("Recommended Career: " + career);
        System.out.println("Skills to Learn: " + skills);

        System.out.println("====================================");

        sc.close();
    }
}