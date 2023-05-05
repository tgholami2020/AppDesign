package com.example.mydesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mydesign.ui.theme.MydesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MydesignTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    mainScreen()

                }
            }
        }
    }
}
@Composable
fun mainScreen(){
    Surface(modifier = Modifier.fillMaxSize(),

        color= Color(0xFFFFE5E8)
    ) {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally

            ) {
            appVeiw(resource = R.drawable.pic1)

            Text(text = "توسط این اپلیکشن ما به شما کمک می کنیم تا تاریخ احتمالی پریود خود را با خبر شوید و اگر قصد بارداری دارید زمان مناسب تخمک گذاری برایتان مشخص میشود ",
            color = Color.Black,
                textAlign = TextAlign.Right,

                )

            Button(onClick = {},
            colors= ButtonDefaults.buttonColors(backgroundColor = Color(0xFFD22931)),
                modifier = Modifier
                    .height(40.dp)
                    .width(250.dp)
                ) {
                Text(text = "شروع کن",
                color = Color.White,
                    )
            }
        }
    }
}
@Composable
fun appVeiw(resource: Int){
    Surface(modifier = Modifier
        .height(300.dp)
        .width(300.dp),
        border = BorderStroke(.5.dp, color = Color.White),
        elevation = 1.dp,
        shape = RectangleShape
    ) {
    Image(painter = painterResource(id = resource) , contentDescription =null)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MydesignTheme {
        mainScreen()
    }
}