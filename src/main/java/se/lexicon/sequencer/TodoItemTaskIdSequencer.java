package se.lexicon.sequencer;

public class TodoItemTaskIdSequencer {

    private static int currentId;

    public static int nextId;

    public static int getCurrentId;

    public static void setCurrentId(int id){
        TodoItemTaskIdSequencer.currentId = currentId;
    }

}
