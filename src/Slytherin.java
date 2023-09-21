public class Slytherin extends Hogwarts {
    private int cunning;
    private int resoluteness;
    private int ambition;
    private int resourcefulness;
    private int imperiousness;

    public Slytherin (String name, int powerOfMagic, int transgression, int cunning, int resoluteness, int ambition, int resourcefulness, int imperiousness){
        super (name, powerOfMagic, transgression);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.imperiousness = imperiousness;
    }

    @Override
    public int calculateSpecificScore() {
        return cunning + resourcefulness + ambition + resoluteness + imperiousness;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getImperiousness() {
        return imperiousness;
    }

    public void setImperiousness(int imperiousness) {
        this.imperiousness = imperiousness;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", resoluteness=" + resoluteness +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", imperiousness=" + imperiousness +
                '}';
    }
}
