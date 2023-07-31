
    class InterfaceImplemented extends MyFirstInterface {
        @Override
        public void display() {
            // Cannot modify the value of x; it is implicitly final
            // x = 20; // This will result in a compilation error
            System.out.println("Value of x: " + x);
        }
    }


