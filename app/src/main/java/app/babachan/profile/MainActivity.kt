package app.babachan.profile

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tittleTextView:TextView = findViewById(R.id.tittle)
        val textTextView:TextView = findViewById(R.id.text)

        nameButton.setOnClickListener {
            imageView.setImageResource(R.drawable.randy_image)
            tittleTextView.setText("名前")
            textTextView.setText("Androidメンターのランディだよ")
        }

        sportsButton.setOnClickListener{
            imageView.setImageResource(R.drawable.baseball_image)
            tittleTextView.setText("スポーツ")
            textTextView.setText("野球観戦が好きでスタジアムに通っている")
        }

        foodButton.setOnClickListener {
            imageView.setImageResource(R.drawable.donut_image)
            tittleTextView.setText("好きな食べ物")
            textTextView.setText("ドーナツやキャンディが大好き")
        }

        hobbyButton.setOnClickListener {
            imageView.setImageResource(R.drawable.gadget_image)
            tittleTextView.setText("趣味")
            textTextView.setText("ガジェットを集めて動かすこと")
        }

    }
}