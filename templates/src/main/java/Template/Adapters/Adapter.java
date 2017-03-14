package Template.Adapters;

public class Adapter {
    public static void main(String[] args) {
       AdapterChannel adapterChannel = new NewChannel2(new OldChannel());
       adapterChannel.convert();

       adapterChannel = new NewChannel();
       adapterChannel.convert();


    }
}


interface AdapterChannel {
    void convert();
}

class OldChannel  {
    public void someMethod() {
        System.out.println("IHAAA!");
    }

}

class NewChannel extends OldChannel implements AdapterChannel {
    public void convert() {
        someMethod();
    }
}


class NewChannel2 implements AdapterChannel {
    OldChannel oldChannel = null;

    public NewChannel2(OldChannel oldChannel) {
        this.oldChannel = oldChannel;
    }

    public void convert() {
       oldChannel.someMethod();
    }
}