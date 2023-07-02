public class People {
    private String name;
    private int x = 2;

    public void update(int x) {
        System.out.println("Before set method " + x);//2
        x = 4;
        System.out.println("After set method " + x);//4
    }
    public static void main(String[] args) {
        People p = new People("Nam");
        int x = p.x;
        System.out.println(x);//2
        p.update(x);
        System.out.println(x);//2
    }

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
