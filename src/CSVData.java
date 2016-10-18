import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/***
 * this is a class to read / write CSV files and allow easy access
 * 
 * @author vle772
 *
 */
public class CSVData {

	private String[] columnNames;
	private double[][] data;

	public CSVData(String filepath, String[] columnNames, int startRow) {
		this.filePathToCSV = filepath;

		String dataString = readFileAsString(filepath);
		String[] lines = dataString.split("\n");

		// number of data points
		int n = lines.length - startRow;
		this.numRows = n;
		int numColumns = columnNames.length;

		// create storage for column names
		this.columnNames = columnNames;

		// create storage for data
		this.data = new double[n][numColumns];
		for (int i = 0; i < lines.length - startRow; i++) {
			String line = lines[startRow + i];
			String[] coords = line.split(",");
			for (int j = 0; j < numColumns; j++) {
				if (coords[j].endsWith("#"))
					coords[j] = coords[j].substring(0, coords[j].length() - 1);
				double val = Double.parseDouble(coords[j]);
				data[i][j] = val;
			}
		}
	}

	private String readFileAsString(String filepath) {
		StringBuilder output = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(filepath))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				output.append(line + System.getProperty("line.separator"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output.toString();
	}

	/***
	 * returns a new CSVData object for a file, ignoring lines at the top it
	 * uses the first row as column names. all other data is stored as doubles
	 * 
	 * @param filename
	 *            the file to read
	 * @param numLinesToIgnore
	 *            number of lines at the top to ignore
	 * @return a CSVData object for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore) {

		return null;
	}

	/***
	 * returns a row
	 * 
	 * @param row
	 *            index of the row to return
	 * @return the row we're returning
	 */
	public double[] getRow(int row) {
		double[] dataRow = new double[data[0].length];
		for (int i = 0; i < dataRow.length; i++){
			dataRow[i] = data[row][i];
		}
		return dataRow;
	}

	/***
	 * returns a column
	 * 
	 * @param name
	 *            name of the column to return
	 * @return the column we're returning
	 */
	public double[] getColumn(int col) {
		double[] dataColumn = new double[data.length];
		for (int i = 0; i < dataColumn.length; i++){
			dataColumn[i] = data[i][col];
		}
		return dataColumn;
	}

	/***
	 * returns adjacent rows
	 * 
	 * @param startRow
	 *            index of row to start returning from
	 * @param endRow
	 *            index of row to stop returning from
	 * @return a 2d double array of the adjacent rows we're returning
	 */
	public double[][] getRows(int startRow, int endRow) {
		double[][] dataRows = new double[endRow-startRow+1][data[0].length];
		for (int row = startRow; row < endRow+1; row++){
			double[] singleRow = getRow(row);
			for (int i = 0; i < singleRow.length; i++){
				dataRows[row][i] = singleRow[i];
			}
		}
		return dataRows;
	}

	/***
	 * returns adjacent rows
	 * 
	 * @param rowIndexes
	 *            int array of indexes of rows to return
	 * @return a 2d double array of the adjacent rows we're returning
	 */
	public double[][] getRows(int[] rowIndexes) {
		return null;
	}

	/***
	 * returns adjacent columns
	 * 
	 * @param startCol
	 *            index of column to start returning from
	 * @param endCol
	 *            index of column to stop returning from
	 * @return a 2d double array of the adjacent columns we're returning
	 */
	public double[][] getColumns(int startCol, int endCol) {
		return null;
	}

	/***
	 * returns adjacent columns
	 * 
	 * @param colIndexes
	 *            int array of indexes of the columns to return
	 * @return a 2nd double array of the adjacent columns we're returning
	 */
	public double[][] getColumns(int[] colIndexes) {
		return null;
	}

	/***
	 * returns adjacent columns
	 * 
	 * @param colNames
	 *            String array of names of columns to return
	 * @return a 2d double array of the adjacent columns we're returning
	 */
	public double[][] getColumns(String[] colNames) {
		return null;
	}

	/***
	 * sets a new value for an individual entry
	 * 
	 * @param rowIndex
	 *            row in which individual entry is located
	 * @param colIndex
	 *            col in which individual entry is located
	 * @param newValue
	 *            new value that replaces the original value
	 */
	public void setValue(int rowIndex, int colIndex, double newValue) {

	}

	/***
	 * sets a new amount of rows
	 * 
	 * @param row
	 *            new amount of rows we want to set the original amount to
	 */
	public void setRow(int row) {

	}

	/***
	 * sets a new amount of columns
	 * 
	 * @param col
	 *            new amount of columns we want to set the original amount to
	 */
	public void setCol(int col) {

	}

	/***
	 * returns a String array of the column names
	 * 
	 * @return a String array of column names
	 */
	public String[] getColumnNames() {
		return null;
	}

	/***
	 * saves the current state of the object back into a CSV file
	 * 
	 * @param filename
	 *            name of file that CSV file will be saved into
	 */
	public void saveToFile(String filename) {

	}

}
