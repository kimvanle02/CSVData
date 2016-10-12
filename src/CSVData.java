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

	
	

}
