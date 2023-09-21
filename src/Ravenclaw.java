public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String name, int powerOfMagic, int transgression, int intellect, int wisdom, int wit, int creative) {
        super(name, powerOfMagic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    @Override
    public int calculateSpecificScore() {
        return intellect + wisdom + wit + creative;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intellect=" + intellect +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creative=" + creative +
                '}';
    }
}
