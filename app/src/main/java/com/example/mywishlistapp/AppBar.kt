package com.example.mywishlistapp

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp


@Composable
fun AppBarView(
    title: String,
    onBackNavClicked: () -> Unit = {}
) {
    TopAppBar(title = {
        Text(
            text = title,
            color = colorResource(id = R.color.white),
            modifier = Modifier
                .padding(start = 4.dp)
                .heightIn(max = 24.dp)
        )
    },
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.app_bar_color),
        navigationIcon = {
            IconButton(onClick = onBackNavClicked) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
        }
    )
}