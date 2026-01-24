class Static {
    static int count = 5;

    static void show() {
        System.out.println("Count is: " + count);
    }

    public static void main(String[] args) {
        show();   // direct call (no object needed)
    }
}
