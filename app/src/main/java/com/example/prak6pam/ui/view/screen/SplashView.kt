package com.example.prak6pam.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak6pam.R


@Composable
fun SplashView(
    onMulaiButton: ()-> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(
                id = R.drawable.logouemye
            ),
            modifier = Modifier.size(300.dp),
            contentDescription = "",
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Universitas Muhammadiyah Yogyakarta",
                color = Color.White, fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Teknologi Informasi",
                color = Color.White,
                fontWeight = FontWeight.Light
            )
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = { onMulaiButton() }, modifier = Modifier
            .fillMaxWidth()
            .padding(25.dp),
        ) {
            Text(text = "Mulai")
        }

    }
}

