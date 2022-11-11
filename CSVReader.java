
package Question2and3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class CSVReader {
    private int rows;
    private int columns;
    private LinkedHashMap<Integer,LinkedHashMap<Integer,String>> csvData;
    public CSVReader(String fileName) {
        this.rows = 0;
        this.columns = 0;
        csvData = new LinkedHashMap<Integer,LinkedHashMap<Integer,String>>();
        readFile(fileName);
    }
    private void readFile(String inputFileName) {
        Scanner sacnnerReader = null;
        try {
            File file = new File(inputFileName);
            if (file.exists()) {
                sacnnerReader = new Scanner(file);
                while (sacnnerReader.hasNextLine()) {
                    rows++;
                    String line = sacnnerReader.nextLine();
                    String array[] = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                    LinkedHashMap<Integer,String> data = new LinkedHashMap<Integer,String>();
                    columns = array.length;
                    for (int i=0;i<columns;i++) {
                        data.put((i+1), array[i]);
                    }
                    csvData.put(rows, data);
                }
            } else {
                System.out.println("The File is not found");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sacnnerReader != null) {
                try {
                    sacnnerReader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public int numberOfRows() {
        return rows;
    }
    public int numberOfColumns() {
        return columns;
    }
    public String fields(int row,int column) {
        LinkedHashMap<Integer,String> data = csvData.get(row);
        return data.get(column).trim();
    }
}

