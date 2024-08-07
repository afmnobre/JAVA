package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
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
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				//source
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				//target
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece  capuredPiece = chessMatch.performChessMove(source, target);
			}catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
