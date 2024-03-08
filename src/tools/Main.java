package tools;
import java.sql.SQLException;

import controllers.RegionController;
import daos.RegionDAO;
import models.Region;
import views.RegionView;

public class Main {
    public static void main(String[] args) throws SQLException {
        DbConnections connection = new DbConnections();
        RegionController regionController = new RegionController(connection.getConnection());
        RegionView regionView = new RegionView(regionController);

        regionView.processUserInput();

        // Menutup scanner setelah selesai
        regionView.closeScanner();

        // Menutup koneksi setelah selesai
        connection.close();
    }
}
