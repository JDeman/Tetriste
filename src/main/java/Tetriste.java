/**
 * Created by julien on 01/04/16.
 */
import piecesRelated.LPiece;
import piecesRelated.Piece;


public class Tetriste {

        public static void main(String[] args){

            System.out.println("Hello World !");
            System.out.println("Yoda!");

            LPiece yo = new LPiece(4,5);
            System.out.println("position is x = " + yo.getxPos() + " Y = " + yo.getyPos());

        }

}
