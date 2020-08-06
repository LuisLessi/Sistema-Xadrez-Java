package chessLayer.pieces;

import boardLayer.Board;
import boardLayer.Position;
import chessLayer.ChessPiece;
import chessLayer.Color;

public class King extends ChessPiece {
	
	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != p.getColor();
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//Acima
		p.setValues(position.getRow()- 1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)){
			mat[p.getRow()][p.getColumn()] = true; 
		}
		
		//Abaixo
				p.setValues(position.getRow() + 1, position.getColumn());
				if (getBoard().positionExists(p) && canMove(p)){
					mat[p.getRow()][p.getColumn()] = true; 
				}
				
		//direita
				p.setValues(position.getRow(), position.getColumn()  + 1);
				if (getBoard().positionExists(p) && canMove(p)){
					mat[p.getRow()][p.getColumn()] = true; 
			}
		//esquerda
				p.setValues(position.getRow(), position.getColumn()  - 1);
				if (getBoard().positionExists(p) && canMove(p)){
					mat[p.getRow()][p.getColumn()] = true; 
				}
				
		//diagonal direita acima
				p.setValues(position.getRow()+1, position.getColumn()  + 1);
				if (getBoard().positionExists(p) && canMove(p)){
					mat[p.getRow()][p.getColumn()] = true; 
				}	
				
		//diagonal esquerda acima
				p.setValues(position.getRow()-1, position.getColumn()  + 1);
				if (getBoard().positionExists(p) && canMove(p)){
					mat[p.getRow()][p.getColumn()] = true; 
				}			
		//diagonal direita abaixo
				p.setValues(position.getRow()+1, position.getColumn()  - 1);
				if (getBoard().positionExists(p) && canMove(p)){
					mat[p.getRow()][p.getColumn()] = true; 
				}			
		//diagonal esquerda abaixo
				p.setValues(position.getRow()-1, position.getColumn()  - 1);
				if (getBoard().positionExists(p) && canMove(p)){
					mat[p.getRow()][p.getColumn()] = true; 
				}			
		return mat;
	}
	
	
}
