public class Main {
    public static void main(String[] args) {
        LifePlayerController playerController = new LifePlayerController();

        // Simulating player movements
        playerController.moveUp();
        playerController.moveRight();
        playerController.moveDown();
        playerController.moveLeft();
    }
}