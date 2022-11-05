package com.olubankeeboda.android.resume

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.olubankeeboda.android.resume.ui.theme.ResumeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ResumeApp()
        }
    }
}

@Composable
fun ResumeApp() {
    ResumeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier.verticalScroll(
                    rememberScrollState(),
                    enabled = true,
                    reverseScrolling = true
                )
            ) {
                AboutMe()
                ContactInformation()
                Skills()
            }


        }
    }
}

@Composable
fun AboutMe() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .padding(bottom = 10.dp)
                .size(200.dp)
                .clip(
                    AbsoluteRoundedCornerShape(10)
                )
        )

        Text(
            text = stringResource(id = R.string.name),
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        Text(
            text = stringResource(id = R.string.title),
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Medium),
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(id = R.string.bio),
            style = MaterialTheme.typography.bodyLarge
        )

    }
}

@Composable
fun ContactInformation() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = stringResource(id = R.string.contactHeading),
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Medium),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Row {
            Image(
                painterResource(id = R.drawable.ic_baseline_place_24),
                contentDescription = "Place"
            )
            Text(
                text = stringResource(id = R.string.location),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
            )
        }

        Row {
            Image(
                painterResource(id = R.drawable.ic_baseline_phone_24),
                contentDescription = "Phone Number"
            )
            Text(
                text = stringResource(id = R.string.phoneNumber),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
            )
        }
        Row {
            Image(
                painterResource(id = R.drawable.ic_baseline_email_24),
                contentDescription = "Phone Number"
            )
            Text(
                text = stringResource(id = R.string.emailAddress),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
            )
        }

        Row {
            Image(
                painterResource(id = R.drawable.github),
                contentDescription = "Github Link",
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = stringResource(id = R.string.github),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
            )
        }

        Row {
            Image(
                painterResource(id = R.drawable.twitter),
                contentDescription = "Twitter Link",
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = stringResource(id = R.string.twitter),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
            )
        }

        Row {
            Image(
                painterResource(id = R.drawable.linkedin),
                contentDescription = "Linkedin Link",
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = stringResource(id = R.string.linkedin),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

    }
}

@Composable
fun Skills() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = stringResource(id = R.string.skillset),
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Medium),
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(id = R.string.skill1),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(id = R.string.skill2),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(id = R.string.skill3),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = stringResource(id = R.string.skill4),
            style = MaterialTheme.typography.bodyLarge
        )

    }
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun ResumePreview() {
    ResumeApp()
}

//@Preview(showBackground = true)
//@Composable
//fun Preview() {
//    ResumeTheme {
//        AboutMe()
//    }
//}