
class Print2OfTable {

    static void print2oftable() {
        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("-> " + ans);
        }
    }

    public static void main(String[] args) {
        System.out.println("hi");
        Print2OfTable obj = new Print2OfTable();

        obj.print2oftable();

        System.out.println("bye");
    }
}