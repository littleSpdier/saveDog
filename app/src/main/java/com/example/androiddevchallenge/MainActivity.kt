/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme
import java.nio.file.WatchEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme() {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    Surface(color = MaterialTheme.colors.background) {
        MaterialTheme() {
            val typography = MaterialTheme.typography
            Column (
                modifier = Modifier.padding(16.dp)
            ) {
                Row() {
                    Image(
                        painter = painterResource(R.drawable.dangerous_dog),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(120.dp)
                            .clip(shape = RoundedCornerShape(6.dp)),
                        contentScale = ContentScale.Inside
                    )
                    Image(
                        painter = painterResource(R.drawable.sea_dog),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(6.dp)),
                        contentScale = ContentScale.Inside
                    )
                }
                Row() {
                    Image(
                        painter = painterResource(R.drawable.bigger),
                        contentDescription = null,
                        modifier = Modifier
                            .height(100.dp)
                            .width(100.dp)
                            .clip(shape = RoundedCornerShape(6.dp)),
                        contentScale = ContentScale.Inside
                    )
                }
                //        Spacer(Modifier.preferredHeight(16.dp))

//                Text("Hello, World!",
//                    style = typography.h6)
                Text("你看到上面那些狗了没, 它们很可爱, 对吧, 但其实很多狗狗没它们这么幸运, 它们没有主人没有食物, 随时有生命的威胁",
                    style = typography.body2)
                Image(
                    painter = painterResource(R.drawable.picture_dog),
                    contentDescription = null,
                    modifier = Modifier
                        .height(100.dp)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(6.dp)),
                    contentScale = ContentScale.Inside
                )
                Text("我希望有人能帮帮它们, 如果你正好想养一条狗且你还没有狗的话, 我建议你收养一条流浪狗, 看看它们, 也许你会喜欢的",
                    style = typography.body2)

                Image(
                    painter = painterResource(R.drawable.pic_save_one),
                    contentDescription = null,
                    modifier = Modifier
                        .height(140.dp)
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(6.dp)),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = painterResource(R.drawable.pic_save_two),
                    contentDescription = null,
                    modifier = Modifier
                        .height(100.dp)
                        .width(120.dp)
                        .clip(shape = RoundedCornerShape(6.dp)),
                    contentScale = ContentScale.Inside
                )
                Image(
                    painter = painterResource(R.drawable.pic_save_three),
                    contentDescription = null,
                    modifier = Modifier
                        .height(100.dp)
                        .width(120.dp)
                        .clip(shape = RoundedCornerShape(6.dp)),
                    contentScale = ContentScale.Inside
                )
                Image(
                    painter = painterResource(R.drawable.pic_save_four),
                    contentDescription = null,
                    modifier = Modifier
                        .height(100.dp)
                        .width(120.dp)
                        .clip(shape = RoundedCornerShape(6.dp)),
                    contentScale = ContentScale.Inside
                )
            }
        }
    }
}

//@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        MyApp()
    }
}

//@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        MyApp()
    }
}

@Composable
fun Greeting(name : String) {
    Column {
        Text(text = "Hello $name!")
        Text("从前有座山")
        Text("山里有个庙")
    }
//    Test()
}

@Preview
@Composable
fun Test() {
    Greeting(name = "从前有座山.")
}

@Preview
@Composable
fun newStory() {
    MaterialTheme() {
        val typography = MaterialTheme.typography
        Column (
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.dangerous_dog),
                contentDescription = null,
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(6.dp)),
                contentScale = ContentScale.Crop
            )

    //        Spacer(Modifier.preferredHeight(16.dp))

            Text("Hello, World!",
                style = typography.h6)
            Text("Queen Street.从前有座山, 山里有个庙, 庙里有个老和尚和一个小和尚, 老和尚在给小和尚讲故事",
            style = typography.body2,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis)
            Text("Spider-Man.",
            style = typography.body2)
        }
    }
}