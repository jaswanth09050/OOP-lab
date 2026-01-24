class Protected {
    protected int marks = 75;

    protected void showMarks() {
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Protected obj = new Protected();
        obj.showMarks();
    }
}
