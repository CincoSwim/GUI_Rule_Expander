public class LSystemExpander {

    //Expected to come from the GUI. Hardcoded for testing and development purposes
    static String param1, param2, param3, param4, param5;
    static Character rule1, rule2, rule3, rule4, rule5, start;
    int iterations;

    public static void main(String[] args) {
        Queue list = new Queue();
        rule1 ='f' ;
        param1 = "F+F-[F+F]";
        rule2 = ' ';
        rule3 = ' ';
        rule4 = ' ';
        rule5 = ' ';
        param2 = "";
        param3 = "";
        param4 = "";
        param5 = "";





        list.enqueue(rule1);

        ExpandOnce(list);
        System.out.println(getQueueAsString(list));

    }

    public static Queue ExpandOnce(Queue list) {
        char readChar;
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
