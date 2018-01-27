package googlesheetspage;

        import base.CommonAPI;
        import com.google.api.services.sheets.v4.model.*;
        import com.google.api.services.sheets.v4.Sheets;
        import java.io.IOException;
        import java.util.ArrayList;
        import java.util.List;

        import static googleapis.GoogleSheetReader.getSheetsService;

public class GoogleSheetsPage extends CommonAPI {
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    // Use google sheets test data to search multiple items
    //  Search multiple items by name from a google sheets file
    public List<String> searchItemByName(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : values) {
            sleepFor(1);
            System.out.println("this 1st search" + row.get(1).toString());
            typeByIdNEnter("textfield", row.get(1).toString());
            sleepFor(1);
            //actual.add(getCurrentPageTitle());
            clearInputFieldById("textfield");
            sleepFor(1);
        }
        return actual;
    }
}
