package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

//Esse construtor inicializa a Torre chamando o construtor da classe base com o tabuleiro e a cor
	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R"; // Rook = Torre em ingles
	}

	@Override
	public boolean[][] possibleMoves() {
		// Matriz temporária
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
