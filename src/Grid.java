/**
 * Grid for the game.
 */
public abstract class Grid {
    private Cell[][] cells; //cells
    private int numRows;
    private int numCols;
    private String symbol;


    public Grid(){}
    public Grid(int numCols,int numRows){
        this.numRows = numRows;
        this.numCols = numCols;
        cells = new Cell[numRows][numCols];
//        grid = new Cell[numRows][numCols];
//        grid = new legends.LOVCell[numRows][numCols];
    }

    public Cell[][] getCells() {
        return cells;
    }

    public Cell getCell(int row, int col) { return cells[row][col];}

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public void setNexusCell(int row, int col) { this.cells[row][col] = new NexusCell(row, col);}

    public void setPlainCell(int row, int col) { this.cells[row][col] = new PlainCell(row, col);}

    public void setKoulouCell(int row, int col) { this.cells[row][col] = new KoulouCell(row, col);}

    public void setCaveCell(int row, int col) { this.cells[row][col] = new CaveCell(row, col);}

    public void setInaccessibleCell(int row, int col) { this.cells[row][col] = new InaccessibleCell(row, col);}

    public void setBushCell(int row, int col) { this.cells[row][col] = new BushCell(row, col);}


    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }



}
