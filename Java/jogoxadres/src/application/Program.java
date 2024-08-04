package application;

import chess.ChessMatch;

//import boardgame.Position;

public class Program {

	public static void main(String[] args) {

		/*
		 * TESTANDO A CLASSE POSIÇÃO: 
			Position pos = new Position(3, 5);
			System.out.println(pos);
		*/
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

	}

}
