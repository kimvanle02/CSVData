/***
 * this is a class to read / write CSV files and allow easy access
 * @author vle772
 *
 */
public class CSVData {
	
	public CSVData(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	
	private int row, col;

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	
	

}
