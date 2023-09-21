public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgression;

    public Hogwarts(String  name, int powerOfMagic, int transgression) {
        this.name=name;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    abstract public int calculateSpecificScore();
    public void compare (Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareSpecificScore(hogwarts);
        } else {compareGeneralScore(hogwarts);
        }
    }
    private void compareSpecificScore (Hogwarts hogwarts) {
        int thisScore = this.calculateSpecificScore();
        int otherScore = hogwarts.calculateSpecificScore();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " сильнее чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println("Ученики равны по силе");
        }
    }


    private void compareGeneralScore (Hogwarts hogwarts) {
        int thisScore = this.getPowerOfMagic() + this.getTransgression();
        int otherScore = hogwarts.getPowerOfMagic() + hogwarts.getTransgression();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " сильнее чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + "сильнее чем " + this.getName());
        } else {
                System.out.println(this.getName() + " и " + hogwarts.getName() + " равны по силе ");
            }
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
       return "Hogwarts{" +
             "name='" + name + '\'' +
           ", powerOfMagic=" + powerOfMagic +
         ", transgression=" + transgression +
       '}';
    }
}

