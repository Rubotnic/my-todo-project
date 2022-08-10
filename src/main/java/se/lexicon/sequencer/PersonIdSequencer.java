package se.lexicon.sequencer;

public class PersonIdSequencer {

    private static int currentId;

    public static int nextId() {
        return PersonIdSequencer.currentId += 1;
    }
    public static int getCurrentId() {
        return PersonIdSequencer.currentId;
    }
    public static void setCurrentId(int id){
        PersonIdSequencer.currentId = id;
    }

}
