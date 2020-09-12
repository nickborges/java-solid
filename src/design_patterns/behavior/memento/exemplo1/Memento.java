package design_patterns.behavior.memento.exemplo1;

public class Memento {

    private String state;

    public Memento(String stateToSave) {
        state = stateToSave;
    }
    public String getSavedState() {
        return state;
    }
}
