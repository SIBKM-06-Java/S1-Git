import controllers.RegionController;
import views.RegionView;

public class App {
    public static void main(String[] args) {
        RegionController regionController = new RegionController();
        RegionView regionView = new RegionView();

        int choice;
        do {
            regionView.showMenu();
            choice = regionView.getInput();

            switch (choice) {
                case 1:
                    regionController.getAllRegions();
                    break;
                case 2:
                    regionController.getRegionById();
                    break;
                case 3:
                    regionController.searchRegionByName();
                    break;
                case 4:
                    regionController.createRegion();
                    break;
                case 5:
                    regionController.updateRegion();
                    break;
                case 6:
                    regionController.deleteRegion();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 0);
    }
}