public class Gryffindor extends Hogwarts {
    private int nobleness;
    private int honor;
    private int bravery;

    public Gryffindor (String name, int powerOfMagic, int transgression, int nobleness, int honor, int bravery) {
       super(name, powerOfMagic,transgression);
       this.nobleness = nobleness;
       this.honor = honor;
       this.bravery = bravery;
    }

    @Override
    public int calculateSpecificScore() {
        return nobleness + honor + bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobleness=" + nobleness +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "}" + super.toString();
    }
}
