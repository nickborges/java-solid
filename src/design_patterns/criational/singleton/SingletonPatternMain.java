package design_patterns.criational.singleton;

public class SingletonPatternMain {

    public static void main(String args[]){
        SingletonPattern s = SingletonPattern.getInstance();

        SingletonPattern s2 = SingletonPattern.getInstance();

        System.out.println(s);
        System.out.println(s2);
    }
}
