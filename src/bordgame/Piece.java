package bordgame;

public  class  Piece {

	protected Position position; 
	private Board board;
	
	
	public Piece(Board board) {
		super();
		this.board = board;
		this.position = null;
		
	}
	
	protected Board getBoard(){
		
		return board;
		
	}
}
