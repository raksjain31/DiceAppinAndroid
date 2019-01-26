package rakshitjain.com.diceassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public ImageView ImageDice1;
    public ImageView ImageDice2;
    public Button BtnRoll;

    private Random MyRandomNumber1 = new Random();
    private Random MyRandomNumber2 = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageDice1= findViewById(R.id.Roll1);
        ImageDice2 = findViewById(R.id.Roll2);
        BtnRoll = findViewById(R.id.BtnRollDice);
        BtnRoll.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        RollBothDice();
    }
});

    }
    private void RollBothDice()
    {
        int myrannumber = MyRandomNumber1.nextInt(6)+1;
       int myrannumber2 = MyRandomNumber2.nextInt(6)+1;
        switch (myrannumber){
            case 1:
                ImageDice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                ImageDice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                ImageDice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                ImageDice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                ImageDice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                ImageDice1.setImageResource(R.drawable.dice6);
                break;
        }
        switch (myrannumber2){
        case 1:
            ImageDice2.setImageResource(R.drawable.dice1);
            break;
        case 2:
            ImageDice2.setImageResource(R.drawable.dice2);
            break;
        case 3:
            ImageDice2.setImageResource(R.drawable.dice3);
            break;
        case 4:
            ImageDice2.setImageResource(R.drawable.dice4);
            break;
        case 5:
            ImageDice2.setImageResource(R.drawable.dice5);
            break;
        case 6:
            ImageDice2.setImageResource(R.drawable.dice6);
            break;

    }


    }
}
