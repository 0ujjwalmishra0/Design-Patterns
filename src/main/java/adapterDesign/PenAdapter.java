package adapterDesign;

public class PenAdapter implements Pen{

    PilotPen pilotPen = new PilotPen();
    @Override
    public void write(String s) {
        pilotPen.mark(s);
    }
}
