package piecesRelated;

/**
 * Created by julien on 01/04/16.
 */
public class LPiece extends Piece {

    private int[][] bluePrintTop = new int[][]{{0,1,0},{0,1,0},{0,1,1}};
    private int[][] bluePrintRight = new int[][]{{0,0,0},{1,1,1},{1,0,0}};
    private int[][] bluePrintDown = new int[][]{{1,1,0},{0,1,0},{0,1,0}};
    private int[][] bluePrintLeft = new int[][]{{0,0,1},{1,1,1},{0,0,0}};

    public LPiece(int x, int y){
        super(x,y);
        setBlockSymbol('L');
        orientations.add(bluePrintTop);
        orientations.add(bluePrintRight);
        orientations.add(bluePrintDown);
        orientations.add(bluePrintLeft);
        setAngle(bluePrintTop);
    }
}