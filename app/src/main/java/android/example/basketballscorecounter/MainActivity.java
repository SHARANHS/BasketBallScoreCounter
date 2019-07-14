package android.example.basketballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAScore = 0;
    int TeamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view)
    {
        TeamAScore+=3;
        displayForTeamA(TeamAScore);
    }
    public void addTwoForTeamA(View view)
    {
        TeamAScore+=2;
        displayForTeamA(TeamAScore);
    }

    public void addOneForTeamA(View view) {
        TeamAScore += 1;
        displayForTeamA(TeamAScore);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View view)
    {
        TeamBScore+=3;
        displayForTeamB(TeamBScore);
    }
    public void addTwoForTeamB(View view)
    {
        TeamBScore+=2;
        displayForTeamB(TeamBScore);
    }

    public void addOneForTeamB(View view) {
        TeamBScore += 1;
        displayForTeamB(TeamBScore);
    }
    public  void resetScore(View view)
    {
        TeamAScore = 0;
        TeamBScore = 0;
        displayForTeamA(TeamAScore);
        displayForTeamB(TeamBScore);
    }

}
