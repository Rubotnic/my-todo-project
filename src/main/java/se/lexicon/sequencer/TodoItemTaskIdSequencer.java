package se.lexicon.sequencer;

public class TodoItemTaskIdSequencer {

    private static int currentId;

    public static int nextId(){
        return ++currentId;
    }

    public static int getCurrentId(){
        return currentId;
    }

    public static void setCurrentId(int id){
        TodoItemTaskIdSequencer.currentId = currentId;
    }

}
