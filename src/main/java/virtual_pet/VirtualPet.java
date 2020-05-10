package virtual_pet;

public class VirtualPet {
    //variables/attributes
    private int Hanger;
    private int Thirst;
    private int Potty;
    private int Boredom;
    private int Tiredness;
    private int RemainingLives;

    //accessor methods
    public boolean gameOn() {
        return true;
    }

    public void restart() {
        Hanger = (int) (Math.random() * 70 + 20);
        Thirst = (int) (Math.random() * 70 + 20);
        Potty = (int) (Math.random() * 70 + 20);
        Boredom = (int) (Math.random() * 70 + 20);
        Tiredness = (int) (Math.random() * 70 + 20);
        RemainingLives = 3;
        return;
    }

    public boolean alive() {
        if (RemainingLives > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int updateLives() {
        if (Hanger == 100 || Thirst == 100 || Potty == 100 || Boredom == 100 || Tiredness == 100) {
            RemainingLives -= 1;
        }
        return RemainingLives;
    }

    public void tick() {
        if (Hanger < 100)
            Hanger += 14;
        if (Hanger > 90)
            Hanger = 100;
        if (Thirst < 100)
            Thirst += 8;
        if (Thirst > 100)
            Thirst = 100;
        if (Potty < 100)
            Potty += 10;
        if (Potty > 100)
            Potty = 100;
        if (Boredom < 100)
            Boredom += 10;
        if (Boredom > 100)
            Boredom = 100;
        if (Tiredness < 100)
            Tiredness += 13;
        if (Tiredness > 100)
            Tiredness = 100;
    }

    public int feedHanger() {
        if (Hanger < 43) {
            Hanger = 0;
        } else {
            Hanger -= 43;
        }
        return Hanger;
    }

    public int feedTiredness() {
        if (Tiredness < 14) {
            Tiredness = 0;
        } else {
            Tiredness -= 14;
        }
        return Tiredness;
    }

    public int feedPotty() {
        if (Potty < 90) {
            Potty += 10;
        } else {
            Potty = 100;
        }
        return Potty;
    }

    public int drankThirst() {
        if (Thirst < 65) {
            Thirst = 0;
        } else {
            Thirst -= 65;
        }
        return Thirst;
    }

    public int drankTiredness() {
        if (Tiredness < 10) {
            Tiredness = 0;
        } else {
            Tiredness -= 10;
        }
        return Tiredness;
    }

    public int drankPotty() {
        if (Potty < 90) {
            Potty += 10;
        } else {
            Potty = 100;
        }
        return Potty;
    }

    public int takeoutPotty() {
        if (Potty < 90) {
            Potty = 0;
        } else {
            Potty -= 90;
        }
        return Potty;
    }

    public int takeoutThirst() {
        if (Thirst < 90) {
            Thirst += 10;
        } else {
            Thirst = 100;
        }
        return Thirst;
    }

    public int takeoutHanger() {
        if (Hanger < 85) {
            Hanger += 15;
        } else {
            Hanger = 100;
        }
        return Hanger;
    }

    public int gameBoredom() {
        if (Boredom < 80) {
            Boredom = 0;
        } else {
            Boredom -= 80;
        }
        return Boredom;
    }

    public int gameTiredness() {
        if (Tiredness < 90) {
            Tiredness += 10;
        } else {
            Tiredness = 100;
        }
        return Tiredness;
    }

    public int gameHanger() {
        if (Hanger < 90) {
            Hanger += 10;
        } else {
            Hanger = 100;
        }
        return Hanger;
    }

    public int nightTiredness() {
        if (Tiredness <= 100) {
            Tiredness = 0;
        }
        return Tiredness;
    }

    public int nightHanger() {
        if (Hanger < 90) {
            Hanger += 10;
        } else {
            Hanger = 100;
        }
        return Hanger;
    }

    public int nightThirst() {
        if (Thirst < 90) {
            Thirst += 10;
        } else {
            Thirst = 100;
        }
        return Thirst;
    }

    //constructors
    public VirtualPet() {
        this.Hanger = (int) (Math.random() * 70 + 20);
        this.Thirst = (int) (Math.random() * 70 + 20);
        this.Potty = (int) (Math.random() * 70 + 20);
        this.Boredom = (int) (Math.random() * 70 + 20);
        this.Tiredness = (int) (Math.random() * 70 + 20);
        this.RemainingLives = 3;
    }

    public int getHanger() {
        return this.Hanger;
    }

    public int getThirst() {
        return this.Thirst;
    }

    public int getPotty() {
        return this.Potty;
    }

    public int getBoredom() {
        return this.Boredom;
    }

    public int getTiredness() {
        return this.Tiredness;
    }

    public int getRemainingLives() {
        return this.RemainingLives;
    }
}