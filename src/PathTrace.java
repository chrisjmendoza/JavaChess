public class PathTrace {
    int sourceX;
    int sourceY;
    int destX;
    int destY;
    boolean hasValidTrace;

    PathTrace(int x, int y, int dX, int dY) {
        sourceX = x;
        sourceY = y;
        destX = dX;
        destY = dY;
    }
}
