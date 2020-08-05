package boardLayer;

public final class Position {
	private Integer row;
	private Integer column;
	
	public Position() {
	}

	public Position(Integer row, Integer column) {
		this.row = row;
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public Integer getColumn() {
		return column;
	}
	
	public void setValue(int row, int column) {
		this.column = column;
		this.row = row;
	}

	@Override
	public String toString() {
		return this.row+", "+ this.column;
	}
	
	
	
}
