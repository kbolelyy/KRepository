package Template.Delegation;

public class Delegate {
    public static void main(String[] args) {
        B b = new B();
        b.f();


        Stadion stadion = new Stadion();
        stadion.setRunnning(new Man());
        stadion.runFast();
        stadion.runSlow();

        stadion.setRunnning(new Woman());
        stadion.runFast();
        stadion.runSlow();
    }

}

class A {
    void f() {
        System.out.println("A");
    }
}

class B {
    A a = new A();

    void f() {
        a.f();
    }
}


interface Runnning {
    void runFast();
    void runSlow();
}

class Man implements Runnning {

    public void runFast() {
        System.out.println(this.getClass().getName() + " бежит быстро");
    }

    public void runSlow() {
        System.out.println(getClass().getName() + " бежит медленно");
    }
}

class Woman implements Runnning {

    public void runFast() {
        System.out.println(this.getClass().getName() + " бежит быстро");
    }

    public void runSlow() {
        System.out.println(this.getClass().getName() + " бежит медленно");
    }
}

class Stadion {
    Runnning runnning;

    public void setRunnning(Runnning r) {
        runnning = r;
    }
    void runFast(){
        runnning.runFast();
    }
    void runSlow(){
        runnning.runSlow();
    }
}
