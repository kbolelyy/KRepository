package Template.Facade;

public class Facade {
    public static void main(String[] args) {
        Man man = new Man();
        man.life();
    }
}


class Man {
    private Hearth hearth = new Hearth();
    private Brain brain = new Brain();
    private Foot foot = new Foot();

    void life() {
        hearth.BitHearth();
        brain.BrainThink();
        foot.Hodit();
    }
}

class Hearth {
    void BitHearth() {
        System.out.println("Serdce bietsja");
    }
}

class Brain {
    void BrainThink() {
        System.out.println("Mozg dumaet");
    }
}

class Foot {
    void Hodit() {
        System.out.println("Nogi Idut");
    }
}