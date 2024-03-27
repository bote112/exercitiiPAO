package Lab5.Singleton;

public class Application {
    public static void main(String[] args) {

        SingletonCharacter character = SingletonCharacter.getInstance();
        SingletonCharacter character2 = SingletonCharacter.getInstance();

        System.out.println(character.equals(character2));

        character.setName("Eroul Lumii");
        System.out.println("Numele caracterului: " + character.getName() + ", Nivel: " + character.getLevel());

        character.levelUp();
        System.out.println(
                "Numele caracterului: " + character.getName() + ", Nivel dupa level up: " + character.getLevel());
    }
}
