
package Question2and3;


public class CSVReaderDriver {
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("C:/Personal/MSDA/CPSC 5000/Assignemnt 6/att2007.csv");
        int totalRows = csvReader.numberOfRows();
        System.out.println("Total Rows: " + totalRows);
        int totalColumns = csvReader.numberOfColumns();
        System.out.println("Total Columns: " + totalColumns);
        System.out.println("Value at Row 1 and Columns 6: " + csvReader.fields(1, 6));
        System.out.println("Value at Row 3 and Columns 1: " + csvReader.fields(3, 1));
        System.out.println("Value at Row 4 and Columns 2: " + csvReader.fields(4, 2));
        System.out.println("Value at Row 2 and Columns 4: " + csvReader.fields(2, 4));
        System.out.println("\n The Average, Minimum, Maximum, and Sum are given below:");
        int max = Integer.parseInt(csvReader.fields(1, 6));
        int min = Integer.parseInt(csvReader.fields(1, 6));
        double total = 0, avg = 0;
        for (int i = 1; i <= totalRows; i++) {
            if (Integer.parseInt(csvReader.fields(i, 6)) > max) {
                max = Integer.parseInt(csvReader.fields(i, 6));
            }
            if (Integer.parseInt(csvReader.fields(i, 6)) < min) {
                min = Integer.parseInt(csvReader.fields(i, 6));
            }
            total = total + Integer.parseInt(csvReader.fields(i, 6));
        }
        avg = total / totalRows;
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
        System.out.println("Sum: " + total);
        System.out.println("Average: " + avg);
    }
}