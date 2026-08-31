import java.util.Scanner;
class Student {
    String name;
    int age;
    String address;
    String qualification;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter address: ");
        address = sc.nextLine();

        System.out.print("Enter qualification: ");
        qualification = sc.nextLine();
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Qualification: " + qualification);
    }
}

class Calling {
    public static void main(String[] args) {

        Student obj = new Student();

        obj.input();
        obj.display();
    }
}
  

