package main.com.adventure.settings;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        CommandVerb result;

        if (verbString.equalsIgnoreCase("TAKE")) {
            result = TAKE;
        } else if (verbString.equalsIgnoreCase("MOVE")) {
            result = MOVE;
        } else if (verbString.equalsIgnoreCase("USE")) {
            result = USE;
        } else if (verbString.equalsIgnoreCase("DIG")) {
            result = DIG;
        } else if (verbString.equalsIgnoreCase("EXAMINE")) {
            result = EXAMINE;
        } else if (verbString.equalsIgnoreCase("LOOK")) {
            result = LOOK;
        } else if (verbString.equalsIgnoreCase("HELP")) {
            result = HELP;
        } else if (verbString.equalsIgnoreCase("INVENTORY")) {
            result = INVENTORY;
        } else {
            result = INVALID;
        }
        return result;
    }

}
