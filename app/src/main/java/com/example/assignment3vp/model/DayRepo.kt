package com.example.assignment3vp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.assignment3vp.R

data class Day(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descRes: Int
)

object DayRepo {
    val days = listOf(
        Day(R.drawable.hokusai, R.string.title0, R.string.desc0),
        Day(R.drawable.toyohara, R.string.title1, R.string.desc1),
        Day(R.drawable.kuniyoshi, R.string.title2, R.string.desc2),
        Day(R.drawable.hiroaki, R.string.title3, R.string.desc3),
        Day(R.drawable.goyo, R.string.title4, R.string.desc4),
        Day(R.drawable.hiroshige, R.string.title5, R.string.desc5),
        Day(R.drawable.kitagawa, R.string.title6, R.string.desc6),
        Day(R.drawable.michelangelo, R.string.title7, R.string.desc7),
        Day(R.drawable.leonardo, R.string.title8, R.string.desc8),
        Day(R.drawable.raphael, R.string.title9, R.string.desc9),
        Day(R.drawable.botticelli, R.string.title10, R.string.desc10),
        Day(R.drawable.vangogh, R.string.title11, R.string.desc11),
        Day(R.drawable.vermeer, R.string.title12, R.string.desc12),
        Day(R.drawable.monet, R.string.title13, R.string.desc13),
        Day(R.drawable.munch, R.string.title14, R.string.desc14),
        Day(R.drawable.blake, R.string.title15, R.string.desc15),
        Day(R.drawable.bonnard, R.string.title16, R.string.desc16),
        Day(R.drawable.bruno, R.string.title17, R.string.desc17),
        Day(R.drawable.camille, R.string.title18, R.string.desc18),
        Day(R.drawable.colin, R.string.title19, R.string.desc19),
        Day(R.drawable.eugene, R.string.title20, R.string.desc20),
        Day(R.drawable.greco, R.string.title21, R.string.desc21),
        Day(R.drawable.gustave, R.string.title22, R.string.desc22),
        Day(R.drawable.johann, R.string.title23, R.string.desc23),
        Day(R.drawable.jones, R.string.title24, R.string.desc24),
        Day(R.drawable.louis, R.string.title25, R.string.desc25),
        Day(R.drawable.maurice, R.string.title26, R.string.desc26),
        Day(R.drawable.mignon, R.string.title27, R.string.desc27),
        Day(R.drawable.renoir, R.string.title28, R.string.desc28),
        Day(R.drawable.thayer, R.string.title29, R.string.desc29)
    )
}