package cap8.methodReference;

public class Duckling {
    public static void makeSound(String sound){
        LearnToSpeak learner = s -> System.out.println(s); //Bom, mas um pouco redundante.
        DuckHelper.teacher(sound, learner);
    }
}
