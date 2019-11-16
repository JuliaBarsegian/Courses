package HW_01_11_19.Task_1;

public abstract class Animals {
    protected String type;
    protected String kind;
    protected String breed;
    protected String sound;

    public Animals(String type, String kind, String breed, String sound) {
        this.type = type;
        this.kind = kind;
        this.breed = breed;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public abstract void displayInfo();
}
