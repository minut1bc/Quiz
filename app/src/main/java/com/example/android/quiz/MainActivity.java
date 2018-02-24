package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    EditText name;

    RadioGroup firstRadio;
    RadioButton firstFirst;
    RadioButton firstSecond;
    RadioButton firstThird;
    TextView firstWrong;
    boolean checkedFirst = false;

    RadioGroup secondRadio;
    RadioButton secondFirst;
    RadioButton secondSecond;
    RadioButton secondThird;
    TextView secondWrong;
    boolean checkedSecond = false;

    RadioGroup thirdRadio;
    RadioButton thirdFirst;
    RadioButton thirdSecond;
    RadioButton thirdThird;
    TextView thirdWrong;
    boolean checkedThird = false;

    RadioGroup fourthRadio;
    RadioButton fourthFirst;
    RadioButton fourthSecond;
    RadioButton fourthThird;
    TextView fourthWrong;
    boolean checkedFourth = false;

    RadioGroup fifthRadio;
    RadioButton fifthFirst;
    RadioButton fifthSecond;
    RadioButton fifthThird;
    TextView fifthWrong;
    boolean checkedFifth = false;

    CheckBox sixthFirst;
    CheckBox sixthSecond;
    CheckBox sixthThird;
    CheckBox sixthFourth;
    TextView sixthWrong;
    String sixthWrongMessage;
    boolean checkedSixth = false;

    CheckBox seventhFirst;
    CheckBox seventhSecond;
    CheckBox seventhThird;
    CheckBox seventhFourth;
    TextView seventhWrong;
    String seventhWrongMessage;
    boolean checkedSeventh = false;

    RadioGroup eightRadio;
    RadioButton eightFirst;
    RadioButton eightSecond;
    RadioButton eightThird;
    TextView eightWrong;
    boolean checkedEight = false;

    RadioGroup ninthRadio;
    RadioButton ninthFirst;
    RadioButton ninthSecond;
    RadioButton ninthThird;
    TextView ninthWrong;
    boolean checkedNinth = false;

    RadioGroup tenthRadio;
    RadioButton tenthFirst;
    RadioButton tenthSecond;
    RadioButton tenthThird;
    TextView tenthWrong;
    boolean checkedTenth = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);

        firstRadio = findViewById(R.id.firstRadioGroup);
        firstFirst = findViewById(R.id.firstRadioFirst);
        firstSecond = findViewById(R.id.firstRadioSecond);
        firstThird = findViewById(R.id.firstRadioThird);
        firstWrong = findViewById(R.id.firstWrong);

        secondRadio = findViewById(R.id.secondRadioGroup);
        secondFirst = findViewById(R.id.secondRadioFirst);
        secondSecond = findViewById(R.id.secondRadioSecond);
        secondThird = findViewById(R.id.secondRadioThird);
        secondWrong = findViewById(R.id.secondWrong);

        thirdRadio = findViewById(R.id.thirdRadioGroup);
        thirdFirst = findViewById(R.id.thirdRadioFirst);
        thirdSecond = findViewById(R.id.thirdRadioSecond);
        thirdThird = findViewById(R.id.thirdRadioThird);
        thirdWrong = findViewById(R.id.thirdWrong);

        fourthRadio = findViewById(R.id.fourthRadioGroup);
        fourthFirst = findViewById(R.id.fourthRadioFirst);
        fourthSecond = findViewById(R.id.fourthRadioSecond);
        fourthThird = findViewById(R.id.fourthRadioThird);
        fourthWrong = findViewById(R.id.fourthWrong);

        fifthRadio = findViewById(R.id.fifthRadioGroup);
        fifthFirst = findViewById(R.id.fifthRadioFirst);
        fifthSecond = findViewById(R.id.fifthRadioSecond);
        fifthThird = findViewById(R.id.fifthRadioThird);
        fifthWrong = findViewById(R.id.fifthWrong);

        sixthFirst = findViewById(R.id.sixthCheckFirst);
        sixthSecond = findViewById(R.id.sixthCheckSecond);
        sixthThird = findViewById(R.id.sixthCheckThird);
        sixthFourth = findViewById(R.id.sixthCheckFourth);
        sixthWrong = findViewById(R.id.sixthtWrong);

        seventhFirst = findViewById(R.id.seventhCheckFirst);
        seventhSecond = findViewById(R.id.seventhCheckSecond);
        seventhThird = findViewById(R.id.seventhCheckThird);
        seventhFourth = findViewById(R.id.seventhCheckFourth);
        seventhWrong = findViewById(R.id.seventhWrong);

        eightRadio = findViewById(R.id.eightRadioGroup);
        eightFirst = findViewById(R.id.eightRadioFirst);
        eightSecond = findViewById(R.id.eightRadioSecond);
        eightThird = findViewById(R.id.eightRadioThird);
        eightWrong = findViewById(R.id.eightWrong);

        ninthRadio = findViewById(R.id.ninthRadioGroup);
        ninthFirst = findViewById(R.id.ninthRadioFirst);
        ninthSecond = findViewById(R.id.ninthRadioSecond);
        ninthThird = findViewById(R.id.ninthRadioThird);
        ninthWrong = findViewById(R.id.ninthWrong);

        tenthRadio = findViewById(R.id.tenthRadioGroup);
        tenthFirst = findViewById(R.id.tenthRadioFirst);
        tenthSecond = findViewById(R.id.tenthRadioSecond);
        tenthThird = findViewById(R.id.tenthRadioThird);
        tenthWrong = findViewById(R.id.tenthWrong);

    }


    /**
     * Called upon when pushing the Submit Answers button. Shows a single Toast, different depending on the player's score.
     *
     * @param view Submit Answers Button
     */
    public void submitScore(View view) {
        if (name.getText().toString().equals(""))
            Toast.makeText(this, R.string.enter_name, Toast.LENGTH_LONG).show();
        else {
            int score = calculateScore();
            if (checkedFirst && checkedSecond && checkedThird && checkedFourth && checkedFifth && checkedSixth && checkedSeventh && checkedEight && checkedNinth && checkedTenth) {     //makes sure all questions were answered
                if (score == 0)
                    Toast.makeText(this, getString(R.string.zero_points, name.getText().toString()), Toast.LENGTH_LONG).show();
                else if (score <= 4)
                    Toast.makeText(this, getString(R.string.four_points, name.getText().toString(), score), Toast.LENGTH_LONG).show();
                else if (score == 5)
                    Toast.makeText(this, getString(R.string.five_points, name.getText().toString()), Toast.LENGTH_LONG).show();
                else if (score <= 7)
                    Toast.makeText(this, getString(R.string.seven_points, name.getText().toString(), score), Toast.LENGTH_LONG).show();
                else if (score <= 9)
                    Toast.makeText(this, getString(R.string.nine_points, name.getText().toString(), 10 - score), Toast.LENGTH_LONG).show();
                if (score == 10)
                    Toast.makeText(this, getString(R.string.ten_points, name.getText().toString(), score), Toast.LENGTH_LONG).show();
            } else
                Toast.makeText(this, R.string.answer_all, Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Used to calculate the player's current score, or show a personalized text on wrong answers.
     *
     * @return the player's score
     */
    public int calculateScore() {
        score = 0;
        if (firstFirst.isChecked() || firstSecond.isChecked() || firstThird.isChecked())
            checkedFirst = true;

        if (secondFirst.isChecked() || secondSecond.isChecked() || secondThird.isChecked())
            checkedSecond = true;

        if (thirdFirst.isChecked() || thirdSecond.isChecked() || thirdThird.isChecked())
            checkedThird = true;

        if (fourthFirst.isChecked() || fourthSecond.isChecked() || fourthThird.isChecked())
            checkedFourth = true;

        if (fifthFirst.isChecked() || fifthSecond.isChecked() || fifthThird.isChecked())
            checkedFifth = true;

        if (sixthFirst.isChecked() || sixthSecond.isChecked() || sixthThird.isChecked() || sixthFourth.isChecked()) {
            checkedSixth = true;
        } else {        //clears hint when all checkboxes were unchecked
            sixthWrong.setText("");
            sixthWrong.setVisibility(View.GONE);
            sixthWrongMessage = "";
            checkedSixth = false;
        }

        if (seventhFirst.isChecked() || seventhSecond.isChecked() || seventhThird.isChecked() || seventhFourth.isChecked()) {
            checkedSeventh = true;
        } else {        //clears hint when all checkboxes were unchecked
            seventhWrong.setText("");
            seventhWrong.setVisibility(View.GONE);
            seventhWrongMessage = "";
            checkedSeventh = false;
        }

        if (eightFirst.isChecked() || eightSecond.isChecked() || eightThird.isChecked())
            checkedEight = true;

        if (ninthFirst.isChecked() || ninthSecond.isChecked() || ninthThird.isChecked())
            checkedNinth = true;

        if (tenthFirst.isChecked() || tenthSecond.isChecked() || tenthThird.isChecked())
            checkedTenth = true;

        if (checkedFirst && checkedSecond && checkedThird && checkedFourth && checkedFifth && checkedSixth && checkedSeventh && checkedEight && checkedNinth && checkedTenth) {
            calculateFirst();

            calculateSecond();

            calculateThird();

            calculateFourth();

            calculateFifth();

            calculateSixth();

            calculateSeventh();

            calculateEight();

            calculateNinth();

            calculateTenth();
        }

        return score;
    }

    /**
     * Used to calculate the player's score for the first question
     */
    public void calculateFirst() {
        if (firstFirst.isChecked()) {
            score++;
            firstWrong.setText("");
            firstWrong.setVisibility(View.GONE);
        } else if (firstSecond.isChecked()) {
            firstWrong.setText(R.string.sorry_first_second);
            firstWrong.setVisibility(View.VISIBLE);
        } else if (firstThird.isChecked()) {
            firstWrong.setText(R.string.sorry_first_third);
            firstWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to calculate the player's score for the second question
     */
    public void calculateSecond() {
        if (secondSecond.isChecked()) {
            score++;
            secondWrong.setText("");
            secondWrong.setVisibility(View.GONE);
        } else if (secondFirst.isChecked()) {
            secondWrong.setText(R.string.sorry_second_first);
            secondWrong.setVisibility(View.VISIBLE);
        } else if (secondThird.isChecked()) {
            secondWrong.setText(R.string.sorry_second_third);
            secondWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to calculate the player's score for the third question
     */
    public void calculateThird() {
        if (thirdThird.isChecked()) {
            score++;
            thirdWrong.setText("");
            thirdWrong.setVisibility(View.GONE);
        } else if (thirdFirst.isChecked()) {
            thirdWrong.setText(R.string.sorry_third_first);
            thirdWrong.setVisibility(View.VISIBLE);
        } else if (thirdSecond.isChecked()) {
            thirdWrong.setText(R.string.sorry_third_second);
            thirdWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to calculate the player's score for the fourth question
     */
    public void calculateFourth() {
        if (fourthFirst.isChecked()) {
            score++;
            fourthWrong.setText("");
            fourthWrong.setVisibility(View.GONE);
        } else if (fourthSecond.isChecked()) {
            fourthWrong.setText(R.string.sorry_fourth_second);
            fourthWrong.setVisibility(View.VISIBLE);
        } else if (fourthThird.isChecked()) {
            fourthWrong.setText(R.string.sorry_fourth_third);
            fourthWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to calculate the player's score for the fifth question
     */
    public void calculateFifth() {
        if (fifthSecond.isChecked()) {
            score++;
            fifthWrong.setText("");
            fifthWrong.setVisibility(View.GONE);
        } else if (fifthFirst.isChecked()) {
            fifthWrong.setText(R.string.sorry_fifth_first);
            fifthWrong.setVisibility(View.VISIBLE);
        } else if (fifthThird.isChecked()) {
            fifthWrong.setText(R.string.sorry_fifth_third);
            fifthWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to calculate the player's score for the sixth question
     */
    public void calculateSixth() {
        if (sixthFirst.isChecked() && sixthThird.isChecked() && sixthFourth.isChecked() && !sixthSecond.isChecked()) {
            score++;
            sixthWrong.setText("");
            sixthWrong.setVisibility(View.GONE);
        } else {
            sixthWrong.setText("");
            sixthWrongMessage = "";

            if (!sixthFirst.isChecked())
                sixthWrongMessage += getString(R.string.sorry_sixth_first);

            if (sixthSecond.isChecked()) {
                if (!sixthWrongMessage.equals(""))
                    sixthWrongMessage += "\n";
                sixthWrongMessage += getString(R.string.sorry_sixth_second);
            }

            if (!sixthThird.isChecked()) {
                if (!sixthWrongMessage.equals(""))
                    sixthWrongMessage += "\n";
                sixthWrongMessage += getString(R.string.sorry_sixth_third);
            }

            if (!sixthFourth.isChecked()) {
                if (!sixthWrongMessage.equals(""))
                    sixthWrongMessage += "\n";
                sixthWrongMessage += getString(R.string.sorry_sixth_fourth);
            }

            sixthWrong.setText(sixthWrongMessage);
            sixthWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to calculate the player's score for the seventh question
     */
    public void calculateSeventh() {
        if (seventhFirst.isChecked() && seventhThird.isChecked() && !seventhSecond.isChecked() && !seventhFourth.isChecked()) {
            score++;
            seventhWrong.setText("");
            seventhWrong.setVisibility(View.GONE);
        } else {
            seventhWrong.setText("");
            seventhWrongMessage = "";

            if (!seventhFirst.isChecked())
                seventhWrongMessage += getString(R.string.sorry_seventh_first);

            if (seventhSecond.isChecked()) {
                if (!seventhWrongMessage.equals(""))
                    seventhWrongMessage += "\n";

                seventhWrongMessage += getString(R.string.sorry_seventh_second);
            }

            if (!seventhThird.isChecked()) {
                if (!seventhWrongMessage.equals(""))
                    seventhWrongMessage += "\n";

                seventhWrongMessage += getString(R.string.sorry_seventh_third);
            }

            if (seventhFourth.isChecked()) {
                if (!seventhWrongMessage.equals(""))
                    seventhWrongMessage += "\n";

                seventhWrongMessage += getString(R.string.sorry_seventh_fourth);
            }

            seventhWrong.setText(seventhWrongMessage);
            seventhWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to calculate the player's score for the eight question
     */
    public void calculateEight() {
        if (eightSecond.isChecked()) {
            score++;
            eightWrong.setText("");
            eightWrong.setVisibility(View.GONE);
        } else if (eightFirst.isChecked()) {
            eightWrong.setText(R.string.sorry_eight_first);
            eightWrong.setVisibility(View.VISIBLE);
        } else if (eightThird.isChecked()) {
            eightWrong.setText(R.string.sorry_eight_third);
            eightWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to calculate the player's score for the ninth question
     */
    public void calculateNinth() {
        if (ninthFirst.isChecked()) {
            score++;
            ninthWrong.setText("");
            ninthWrong.setVisibility(View.GONE);
        } else if (ninthSecond.isChecked()) {
            ninthWrong.setText(R.string.sorry_ninth_second);
            ninthWrong.setVisibility(View.VISIBLE);
        } else if (ninthThird.isChecked()) {
            ninthWrong.setText(R.string.sorry_ninth_third);
            ninthWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to calculate the player's score for the tenth question
     */
    public void calculateTenth() {
        if (tenthSecond.isChecked()) {
            score++;
            tenthWrong.setText("");
            tenthWrong.setVisibility(View.GONE);
        } else if (tenthFirst.isChecked()) {
            tenthWrong.setText(R.string.sorry_tenth_first);
            tenthWrong.setVisibility(View.VISIBLE);
        } else if (tenthThird.isChecked()) {
            tenthWrong.setText(R.string.sorry_tenth_third);
            tenthWrong.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Used to reset the whole quiz
     *
     * @param view = Reset Quiz button
     */
    public void resetQuiz(View view) {
        score = 0;

        name.setText("");

        firstRadio.clearCheck();
        firstWrong.setText("");
        firstWrong.setVisibility(View.GONE);
        checkedFirst = false;

        secondRadio.clearCheck();
        secondWrong.setText("");
        secondWrong.setVisibility(View.GONE);
        checkedSecond = false;

        thirdRadio.clearCheck();
        thirdWrong.setText("");
        thirdWrong.setVisibility(View.GONE);
        checkedThird = false;

        fourthRadio.clearCheck();
        fourthWrong.setText("");
        fourthWrong.setVisibility(View.GONE);
        checkedFourth = false;

        fifthRadio.clearCheck();
        fifthWrong.setText("");
        fifthWrong.setVisibility(View.GONE);
        checkedFifth = false;

        sixthFirst.setChecked(false);
        sixthSecond.setChecked(false);
        sixthThird.setChecked(false);
        sixthFourth.setChecked(false);
        sixthWrong.setText("");
        sixthWrong.setVisibility(View.GONE);
        sixthWrongMessage = "";
        checkedSixth = false;

        seventhFirst.setChecked(false);
        seventhSecond.setChecked(false);
        seventhThird.setChecked(false);
        seventhFourth.setChecked(false);
        seventhWrong.setText("");
        seventhWrong.setVisibility(View.GONE);
        seventhWrongMessage = "";
        checkedSeventh = false;

        eightRadio.clearCheck();
        eightWrong.setText("");
        eightWrong.setVisibility(View.GONE);
        checkedEight = false;

        ninthRadio.clearCheck();
        ninthWrong.setText("");
        ninthWrong.setVisibility(View.GONE);
        checkedNinth = false;

        tenthRadio.clearCheck();
        tenthWrong.setText("");
        tenthWrong.setVisibility(View.GONE);
        checkedTenth = false;
    }

}
