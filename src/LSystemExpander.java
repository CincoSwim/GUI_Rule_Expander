/**
 * This class expands a string using a set of rules to create an expanded L-System string, using Queue.java
 * <p>
 * Each rule is stored as a single character, and is paired with a parameter, stored as a string.
 * </P><p>
 * When a character matching a rule is retrieved from the queue, the corresponding parameter is passed
 * in character by character. Otherwise, the character is re-queued in the queue as is.
 * </p><p>
 * At the start of expansion, a '#' character is enqueued at the end of the list. This allows the queue to mark where it
 * should start and stop iterating.
 * </p>
 *
 *
 * @author Christopher Pucko
 */
public class LSystemExpander {


    static String param1, param2, param3, param4, param5;
    static Character rule1, rule2, rule3, rule4, rule5, start;
    int iterations;


    /**
     * This method takes in a list, and expands it for one iteration. Note- for this project, the parameters and rules
     * are set by the GUI before running this expansion according to the text field's contents.
     * @param list - the string to be expanded. Each object in the list is a character for the string.
     * @return This returns the list queue, expanded upon once
     */
    public static Queue ExpandOnce(Queue list) {

        list.enqueue('#');
        list.printAll();
        while (list.peek() != '#') {
            if (list.peek() == rule1) {
                for (int i = 0; i<= param1.length() -1; i++ ){
                    list.enqueue(param1.charAt(i));

                }

            }else if (list.peek() == rule2) {
                for (int i = 0; i <= param2.length() - 1; i++) {
                    list.enqueue(param2.charAt(i));

                }
            }else if (list.peek() == rule3) {
                for (int i = 0; i <= param3.length() - 1; i++) {
                    list.enqueue(param3.charAt(i));

                }
            }else if (list.peek() == rule4) {
                for (int i = 0; i <= param4.length() - 1; i++) {
                    list.enqueue(param4.charAt(i));

                }
            }else if (list.peek() == rule5) {
                for (int i = 0; i <= param5.length() - 1; i++) {
                    list.enqueue(param5.charAt(i));

                }
            }
            else
                list.enqueue(list.peek());
            list.dequeue();
        }
        System.out.println();
        list.dequeue();

        list.printAll();
        System.out.println();

        return list;
    }

    /**
     * This takes in a list queue fo characters, and returns it as a single string.
     * @param list - queue containing a list of characters.
     * @return This returns the characters of the queue in order enqueued as a string.
     */
    public static String getQueueAsString(Queue list){
        String testString = "";
        list.enqueue('#');
        while (list.peek() != '#'){
            testString += list.dequeue();
        }
        System.out.println(testString + " is testString's value");
        return testString;
    }

    public static String getParam1() {
        return param1;
    }

    public static void setParam1(String param1) {
        LSystemExpander.param1 = param1;
    }

    public static String getParam2() {
        return param2;
    }

    public static void setParam2(String param2) {
        LSystemExpander.param2 = param2;
    }

    public static String getParam3() {
        return param3;
    }

    public static void setParam3(String param3) {
        LSystemExpander.param3 = param3;
    }

    public static String getParam4() {
        return param4;
    }

    public static void setParam4(String param4) {
        LSystemExpander.param4 = param4;
    }

    public static String getParam5() {
        return param5;
    }

    public static void setParam5(String param5) {
        LSystemExpander.param5 = param5;
    }

    public static Character getRule1() {
        return rule1;
    }

    public static void setRule1(Character rule1) {
        LSystemExpander.rule1 = rule1;
    }

    public static Character getRule2() {
        return rule2;
    }

    public static void setRule2(Character rule2) {
        LSystemExpander.rule2 = rule2;
    }

    public static Character getRule3() {
        return rule3;
    }

    public static void setRule3(Character rule3) {
        LSystemExpander.rule3 = rule3;
    }

    public static Character getRule4() {
        return rule4;
    }

    public static void setRule4(Character rule4) {
        LSystemExpander.rule4 = rule4;
    }

    public static Character getRule5() {
        return rule5;
    }

    public static void setRule5(Character rule5) {
        LSystemExpander.rule5 = rule5;
    }

    public static Character getStart() {
        return start;
    }

    public static void setStart(Character start) {
        LSystemExpander.start = start;
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }
}