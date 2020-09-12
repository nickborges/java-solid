package design_patterns.behavior.memento.exemplo1;

public class Originator {

    private String state;

    /* lots of memory using private data that does not have to be saved. Instead we use a small memento object. */
    public void set(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }

    public Object saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }

    public void restoreFromMemento(Object m) {
        if (m instanceof Memento) {
            Memento memento = (Memento) m;
            state = memento.getSavedState();
            System.out.println("Originator: State after restoring from Memento: " + state);
        }
    }

}
