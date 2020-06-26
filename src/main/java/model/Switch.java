package model;

@SuppressWarnings("ALL")
public class Switch implements Emitter {
    private boolean signal;

    public Switch() {
        signal = false;
    }

    public void turnOn() {
        signal = true;
    }

    public void turnOff() {
        signal = false;
    }

    @Override
    public boolean read() {
        return signal;
    }
}
