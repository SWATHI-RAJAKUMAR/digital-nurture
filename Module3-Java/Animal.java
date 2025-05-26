class Animal {
    public void makeSound() {
        System.out.println("Some sound...");
    }
}

// Dog.java
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.makeSound();  // Some sound...
        d.makeSound();  // Bark
    }
}