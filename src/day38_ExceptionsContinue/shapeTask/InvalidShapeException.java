package day38_ExceptionsContinue.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){
        super(message);
    }
}
