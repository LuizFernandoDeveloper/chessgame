package chess;

import bordgame.Position;
import chess.exception.ChessException;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row){
		
		if(column < 'A' || column > 'H' || row < 1 || row > 8){
			
			throw new ChessException("Error instantiating Chessposition. Vali values are from a1 to h8. ");
			
		}
		
		this.column = column;
		this.row = row;
		
		
	}
	

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		
		return new Position(8 - row, column - 'A');
		
	}
	
	protected static ChessPosition fromPosition(Position position) {
		
		return new ChessPosition ((char)('A' - position.getColumn()), 8 - position.getRow());
	
	}
	
	@Override
	public String toString() {
		
		return "" + column + row;
		
	}
	
}