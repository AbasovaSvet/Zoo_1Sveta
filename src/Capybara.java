public class Capybara extends Animal{
    @Override
    public void move() {
        System.out.println("ходит прыгает и павает");
    }

    @Override
    public String makeSound() {
        return "Издает звук свиста и стрекотание";
    }

}