package com.olubankeeboda.android.resume

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.olubankeeboda.android.resume.ui.theme.PurpleGrey80
import com.olubankeeboda.android.resume.ui.theme.ResumeTheme

@Composable
fun ResumeDetails() {


}

@Composable
fun CareerHistory() {
    Column {
        Surface(
            color = PurpleGrey80,
            modifier = Modifier
                .size(width = 350.dp, height = 100.dp)
                .clip(RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp))
        ) {
            Text(
                text = stringResource(id = R.string.title),
                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Medium)

            )
        }


    }
}


@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun DetailsPreview() {
    ResumeTheme {
        CareerHistory()
    }
}