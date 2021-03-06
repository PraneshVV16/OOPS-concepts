class Gear {
    public void speed() {
        System.out.println("Speed limit varies according to the gear");
    }
}

class First extends Gear  {
    public void speed() {
        System.out.println("First Gear : 0 t0 20 kmph");
    }
}

class Second extends Gear {
    public void speed() {
        System.out.println("Second Gear: 20 t0 40 kmph");
    }
}
class Third extends Gear {
    public void speed() {
        System.out.println("Third Gear: 40 t0 60 kmph");
    }
}
class Fourth extends Gear {
    public void speed() {
        System.out.println("Fourth Gear: 60 t0 80 kmph");
    }
}
class Fifth extends Gear {
    public void speed() {
        System.out.println("Fifth Gear: 80 and above kmph");
    }
}

class Main {
    public static void main(String[] args) {
        Gear bikegears = new Gear();
        First gear1 = new First ();
        Second gear2 = new Second();
        Third gear3 = new Third();
        Fourth gear4 = new Fourth();
        Fifth gear5 = new Fifth();

        bikegears.speed();
        gear1.speed();
        gear2.speed();
        gear3.speed();
        gear4.speed();
        gear5.speed();

    }
}

