package abstractexample23;
// In real scenario, method is called by programmer or user
class TestAbstraction1 {
    public static void main(String[] args) {
        // In a real scenario, object is provided through method, eg getShape() method
        Shape s = new Circle1();
        s.draw();
    }
}
