package piecesRelated;

/**
 * Created by julien on 01/04/16.
 */
public class OPiece extends Piece {

    private int[][] bluePrintTop = new int[][]{{1,1,0},{1,1,0},{0,0,0}};
    private int[][] bluePrintRight = new int[][]{{1,1,0},{1,1,0},{0,0,0}};
    private int[][] bluePrintDown = new int[][]{{1,1,0},{1,1,0},{0,0,0}};
    private int[][] bluePrintLeft = new int[][]{{1,1,0},{1,1,0},{0,0,0}};

    public OPiece(int x, int y){
        super(x,y);
        setBlockSymbol('O');
        orientations.add(bluePrintTop);
        orientations.add(bluePrintRight);
        orientations.add(bluePrintDown);
        orientations.add(bluePrintLeft);
        setAngle(bluePrintTop);
    }
}
