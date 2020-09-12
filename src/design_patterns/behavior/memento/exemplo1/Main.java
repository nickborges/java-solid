package design_patterns.behavior.memento.exemplo1;

public class Main {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.set("State1");
        caretaker.addMemento(originator.saveToMemento());

        originator.set("State2");
        caretaker.addMemento(originator.saveToMemento());

        originator.set("State3");
        caretaker.addMemento(originator.saveToMemento());

        originator.set("State4");
        caretaker.addMemento(originator.saveToMemento());

        originator.restoreFromMemento(caretaker.getMemento(1));

    }
}
