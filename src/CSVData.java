/***
 * this is a class to read / write CSV files and allow easy access
 * @author vle772
 *
 */
public class CSVData {
	
	private String[] columnNames;
	private double[][] data;
	
	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] columnNames){
		return null;
	}
	
	/***
	 * returns a new CSVData object for a file, ignoring lines at the top
	 * it uses the first row as column names. all other data is stored as doubles
	 * @param filename the file to read
	 * @param numLinesToIgnore number of lines at the top to ignore
	 * @return a CSVData object for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore){
		return null;
	}
	

	public double[] getRow(int row){
		return null;
	}
	
	public double[] getColumn(String name){
		return null;
	}
	
	public double[][] getRows(int startRow, int endRow){
		return null;
	}
	
	public double[][] getRows(int[] rowIndexes){
		return null;
	}
	
	public double[][] getColumns(int startCol, int endCol){
		return null;
	}
	
	public double[][] getColumns(int[] colIndexes){
		return null;
	}
	
	public double[][] getColumns(String[] colNames){
		return null;
	}
	
	public void setValue(int rowIndex, int colIndex, double newValue){
		
	}
	
	public void setRow(int row){
		
	}
	
	public void setCol(int col){
		
	}
	
	public String[] getColumnNames(){
		return null;
	}
	
	
	public void saveToFile(String filename){
		
	}
	
	

}
