package chessLayer;

import bordLayer.Board;
import bordLayer.Piece;

public abstract class ChessPiece extends Piece {
	private Color color;
	private Integer moveCount;
	
	public ChessPiece() {
		super();
	}

	public ChessPiece(Board board, Color color, Integer moveCount) {
		super(board);
		this.color = color;
		this.moveCount = moveCount;
	}

	public Color getColor() {
		return color;
	}


	public Integer getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(Integer moveCount) {
		this.moveCount = moveCount;
	}
	
	
	
}
