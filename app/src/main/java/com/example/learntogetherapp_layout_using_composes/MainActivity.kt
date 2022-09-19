package com.example.learntogetherapp_layout_using_composes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogetherapp_layout_using_composes.ui.theme.LearnTogetherApp_layout_using_composesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherApp_layout_using_composesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AddImage(text1 = "Jetpack Compose tutorial", text2 = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", text3 ="In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name." )
                }
            }
        }
    }
}

@Composable
fun AddImage(text1:String,text2:String,text3:String)
{
    val image= painterResource(id = R.drawable.composes)
    Column()
    {
        Image(painter = image, contentDescription =null,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.Start)
                .padding(start = 5.dp, end = 5.dp, top = 5.dp)
        )
        Text1(text1=text1)
        Text2(text2 = text2)
        Text3(text3 = text3)
    }

}



@Composable
fun Text1(text1:String)
{
    Text(text=text1, fontSize = 24.sp, modifier = Modifier.padding(start=16.dp,end=16.dp, bottom = 16.dp,top=16.dp))
}

@Composable
fun Text2(text2:String)
{
    Text(text=text2,fontSize = 12.sp, maxLines = 3, modifier = Modifier.padding(start=16.dp,end=16.dp, bottom = 16.dp,top=16.dp))
}

@Composable
fun Text3(text3:String)
{
    Text(text=text3,fontSize = 12.sp, maxLines = 7, modifier = Modifier.padding(start=16.dp,end=16.dp, bottom = 16.dp,top=16.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LearnTogetherApp_layout_using_composesTheme {
        AddImage(text1 = "Jetpack Compose tutorial", text2 = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", text3 ="In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name." )
    }
}