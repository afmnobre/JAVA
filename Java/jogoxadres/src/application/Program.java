package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

//import boardgame.Position;

public class Program {

	public static void main(String[] args) {

		/*
		 * TESTANDO A CLASSE POSIÇÃO: 
			Position pos = new Position(3, 5);
			System.out.println(pos);
		*/
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece  capuredPiece = chessMatch.performChessMove(source, target);
		}

	}

}
