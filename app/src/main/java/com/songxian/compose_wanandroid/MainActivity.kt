package com.songxian.compose_wanandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.songxian.compose_wanandroid.ui.theme.ComposeWanAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWanAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainAppContent()
                }
            }
        }
    }

}


@Composable
private fun MainAppContent() {
    Scaffold(
        topBar = {

        },
        content = {
            HomeScreenContent(Modifier)
        },
        bottomBar = {
            BottomNavigation(modifier = Modifier)
        }
    )
}


@Composable
fun HomeScreenContent(
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .background(Color.Red)
    ) {
        Text(text = "内容")
    }
}


@Composable
fun BottomNavigation(
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .background(Color.Red)
    ) {
        Text(text = "底部")
    }
}


@Preview
@Composable
fun PreviewMainAppContent() {
    MainAppContent()
}