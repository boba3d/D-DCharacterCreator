package DDCharacterCreator;

public class Character {
    String name;
    String appearance;
    Integer age;
    String weight;
    String height;
    Enum.Race race;
    Enum.Class characterClass;
    Integer level;
    Enum background;
    Enum.Alignment allignment;
    Enum eyeColor;
    String Pname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Enum.Race getRace() {
        return race;
    }

    public void setRace(Enum.Race race) {
        this.race = race;
    }

    public Enum.Class getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(Enum.Class characterClass) {
        this.characterClass = characterClass;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Enum getBackground() {
        return background;
    }

    public void setBackground(Enum background) {
        this.background = background;
    }

    public Enum.Alignment getAllignment() {
        return allignment;
    }

    public void setAllignment(Enum.Alignment allignment) {
        this.allignment = allignment;
    }

    public Enum getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(Enum eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }
}
