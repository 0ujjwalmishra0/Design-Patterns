package adapterDesign;

public class School {
    public static void main(String[] args) {
        AssignmentWork assignmentWork= new AssignmentWork();
        PenAdapter penAdapter = new PenAdapter();
        assignmentWork.setPen(penAdapter);

        assignmentWork.writeAssignment("I am bit tired to write assignment");
    }
}
