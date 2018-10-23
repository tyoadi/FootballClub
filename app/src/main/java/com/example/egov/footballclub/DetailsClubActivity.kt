package com.example.egov.footballclub

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.ImageView
import org.jetbrains.anko.*

class DetailsClubActivity : AppCompatActivity() {

    private val items: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailsClubActivityUI().setContentView(this)
    }

    class DetailsClubActivityUI : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {

          verticalLayout {

              padding = dip(16)

              ImageView(R.drawable.img_chelsea).
                  lparams(width = matchParent){
                  padding = dip(16)
                  margin = dip(16)
              }

              textView {
                  text = "Chelsea lknliqjhlknlka" +
                          "nlknlkvdclk" +
                          "m;lkfg;ljmb" +
                          "nlkjldkhfligvlkoisgdihlifsdf" +
                          "khlsdkhlfkhlskhdlfhsldhf" +
                          "ko;js;jd;lfj;sjd;lfjs;"
                  textColor = Color.BLACK
                  textSize = 16f
                  gravity = Gravity.CENTER
              }

          }

        }

    }
}