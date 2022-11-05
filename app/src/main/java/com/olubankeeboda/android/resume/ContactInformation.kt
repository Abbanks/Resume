package com.olubankeeboda.android.resume

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.SystemFontFamily
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat

/**
 * This composable displays my location, phone number, social media links, and email address
 */
@Composable
fun ContactInformation() {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = stringResource(id = R.string.contactHeading),
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Medium),
            modifier = Modifier.padding(bottom = 10.dp)
        )

        Row {
            Image(
                painterResource(id = R.drawable.ic_baseline_place_24),
                contentDescription = "Place"
            )
            Text(
                text = stringResource(id = R.string.location),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp, bottom = 10.dp)
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
                modifier = Modifier.padding(start = 8.dp, bottom = 10.dp)
            )
        }
        Row {
            Image(
                painterResource(id = R.drawable.ic_baseline_email_24),
                contentDescription = "Email"
            )

            ClickableText(
                text = AnnotatedString(text = stringResource(id = R.string.emailAddress)),
                style = MaterialTheme.typography.bodyLarge.copy(color = colorResource(id = R.color.light_blue)),
                modifier = Modifier.padding(start = 8.dp, bottom = 10.dp),
                onClick = { offset ->
                    val address = arrayOf("olubanke.eboda@gmail.com")
                    composeEmail(context = context, address)
                }
            )

        }

        Row {
            Image(
                painterResource(id = R.drawable.github),
                contentDescription = "Github Link",
                modifier = Modifier.size(24.dp)
            )

            HyperlinkText(
                fullText = "Abbanks",
                linkText = listOf("Abbanks"),
                hyperlinks = listOf("https://github.com/Abbanks"),
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 8.dp, bottom = 10.dp)
            )

        }

        Row {
            Image(
                painterResource(id = R.drawable.twitter),
                contentDescription = "Twitter Link",
                modifier = Modifier.size(24.dp)
            )

            HyperlinkText(
                fullText = "@bibi_the_muse",
                linkText = listOf("@bibi_the_muse"),
                hyperlinks = listOf("https://twitter.com/bibi_the_muse"),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp, bottom = 10.dp),
                fontSize = 16.sp
            )
        }

        Row {
            Image(
                painterResource(id = R.drawable.linkedin),
                contentDescription = "Linkedin Link",
                modifier = Modifier.size(24.dp)
            )

            HyperlinkText(
                fullText = "Banke Eboda",
                linkText = listOf("Banke Eboda"),
                hyperlinks = listOf("https://www.linkedin.com/in/banke-eboda/"),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 8.dp, bottom = 10.dp),
                fontSize = 16.sp
            )
        }

    }
}

/**
 * This composable enables a text to load a browser and go to the URL
 */
@Composable
fun HyperlinkText(
    modifier: Modifier = Modifier,
    fullText: String,
    linkText: List<String>,
    style: TextStyle,
    fontFamily: SystemFontFamily = FontFamily.Default,
    fontWeight: FontWeight = FontWeight.Normal,
    linkTextColor: Color = colorResource(id = R.color.light_blue),
    hyperlinks: List<String>,
    fontSize: TextUnit
) {
    val annotatedString = buildAnnotatedString {
        append(fullText)
        linkText.forEachIndexed { index, link ->
            val startIndex = fullText.indexOf(link)
            val endIndex = startIndex + link.length
            addStyle(
                style = SpanStyle(
                    color = linkTextColor,
                    fontSize = fontSize
                ),
                start = startIndex,
                end = endIndex
            )
            addStringAnnotation(
                tag = "URL",
                annotation = hyperlinks[index],
                start = startIndex,
                end = endIndex
            )
        }
        addStyle(
            style = SpanStyle(
                fontSize = fontSize
            ),
            start = 0,
            end = fullText.length
        )
    }

    val uriHandler = LocalUriHandler.current

    ClickableText(
        modifier = modifier,
        text = annotatedString,
        onClick = {
            annotatedString
                .getStringAnnotations("URL", it, it)
                .firstOrNull()?.let { stringAnnotation ->
                    uriHandler.openUri(stringAnnotation.item)
                }
        }
    )
}

/**
 * Sends an implicit intent to send a mail
 */
fun composeEmail(context: Context, addresses: Array<String>) {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "message/rfc822"
        putExtra(Intent.EXTRA_EMAIL, addresses)
    }
    ContextCompat.startActivity(context, Intent.createChooser(intent, "Send an email..."), null)
}