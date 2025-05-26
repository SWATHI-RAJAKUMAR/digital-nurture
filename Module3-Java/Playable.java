// Playable.java
interface Playable {
    void play();
}

// Guitar.java
class Guitar implements Playable {
    public void play() {
        System.out.println("Playing the guitar.");
    }
}

// Piano.java
class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano.");
    }

    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();

        g.play();
        p.play();
    }
}