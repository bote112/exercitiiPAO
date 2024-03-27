package Lab5.Singleton;

public class SingletonCharacter {
    private static SingletonCharacter characterInstance;
    private String name;
    private int level;

    private SingletonCharacter() {
        name = "Unknown";
        level = 1;
    }

    public static SingletonCharacter getInstance() {
        if (characterInstance == null) {
            characterInstance = new SingletonCharacter();
        }
        return characterInstance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        this.level++;
    }
}
