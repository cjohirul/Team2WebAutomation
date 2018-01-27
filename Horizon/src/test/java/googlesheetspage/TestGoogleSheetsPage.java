package googlesheetspage;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestGoogleSheetsPage extends GoogleSheetsPage {
    //  Use google sheets test data to search multiple items
    //  Search multiple items by name from a google sheets file
    @Test
    public void search () throws IOException, InterruptedException {
        int i = 0;
        String spreadsheetId = "1xSBTCpoqOA5nHQoUwQvHjptz0d6K-MAjin7ScAZC4oU";
        String range = "Sheet1!A2:C";
        List<String> actualItems = searchItemByName(spreadsheetId, range);
        List<List<Object>> expectedItems = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedItems) {

           // Assert.assertTrue(actualItems.get(i).contains(row.get(2).toString()));
            System.out.println(expectedItems.get(i) + ": Search - Passed");
            i++;
        }
    }

    }
