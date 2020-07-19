package design_patterns.criational.singleton;

/**
 * Singleton Pattern
 */
public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern(){}

    public static synchronized SingletonPattern getInstance(){
        if(instance == null){
            instance = new SingletonPattern();
        }

        return instance;
    }

}
