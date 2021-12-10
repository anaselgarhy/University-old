package MultyLevelInhet;

class One {
    public void print() {
        System.out.println("One");
    }
}

class Two extends One {
    @Override
    public void print() {
        super.print();
        System.out.println("Tow");
    }
}

class Three extends Two {
    @Override
    public void print() {
        super.print();
        System.out.println("Three");
    }
}


public class Class {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();
        Three three = new Three();

        one.print();
        two.print();
        three.print();
    }
}
