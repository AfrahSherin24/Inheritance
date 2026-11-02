package FirstProgram;

class EMP {
    String name;
    int salary;

    void display() {
        System.out.println(name);
        System.out.println(salary);
    }
}

class DEV extends EMP {
    String language;
}

class TEST extends EMP {
    String tool;
}

public class EMP1 {
    public static void main(String[] args) {
        DEV d = new DEV();
        d.name = "Sherin";
        d.salary = 90000;
        d.language = "Java";

        TEST t = new TEST();
        t.name = "Manish";
        t.salary = 70000;
        t.tool = "Selenium";

        d.display();
        System.out.println(d.language);

        t.display();
        System.out.println(t.tool);
    }
}