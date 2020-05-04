import java.util.ArrayList;

public class PuzzleMaster extends LivingCreature {


    private ArrayList<String> questions;
    private ArrayList<String> answers;

    /**
     * Class Constructor
     * **/
    public PuzzleMaster (String name, String description){
        super(name, description);
    }


    /**
     * SETTERS & GETTERS
     */
    public ArrayList<String> getQuestions() {
        return questions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }


    /**
     * CLASS METHODS
     */
    public void startQuiz(){
        /** Method that starts the Quiz **/
        System.out.println("**************************************************************************************************************************************************************************************************************\n");
        System.out.println("Welcome traveller! \n");
        System.out.println("Wondering around these parts without a shield is brave, or foolish! \n");
        System.out.println("Answer my question correctly and I will give you a shield! \n");
        System.out.println("-------------\n");

        q_and_a();

        System.out.println("**************************************************************************************************************************************************************************************************************\n");
    }

    public void q_and_a(){
        /** Method that simulates asking a question and matching response against correct answer - RIGGED TO GUARANTEE A WIN SCENARIO**/
        String a = "traffic lights";
        String input = "Traffic lights";
        System.out.println("\"Three eyes have I, all in a row; when the red one opens, all freeze ... What am i?\"");
        System.out.println("-> You answer with - \"Traffic lights\"\n");
        if(a.equals(input.toLowerCase())){
            Win();
        } else {
            Lose();
        }
    }

    public void Win(){
        /** Method that simulates a puzzle game over (Win) scenario **/
        System.out.println("\"That is correct! Well done!\"\n");
        System.out.println("\"As i promised, here you go!\"\n");
        System.out.println("-> " +getName() + " hands over an old shield.\n");
    }

    public void Lose(){
        /** Method that simulates a puzzle game over (Lose) scenario **/
        System.out.println("\"That is incorrect!\"\n");
        System.out.println("\"You may still pass but no shield for you!\"\n");
    }
}