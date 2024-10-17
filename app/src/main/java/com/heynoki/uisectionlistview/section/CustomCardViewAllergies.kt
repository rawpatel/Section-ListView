package com.heynoki.uisectionlistview.section


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.heynoki.uisectionlistview.R


@Composable
fun CustomCardViewAllergies(
    title: String,
    reaction: String,
    onsetDate: String,
    icon1: Painter,
    icon2: Painter,
    icon3: Painter,
    severityLevel: String
) {
    // Dynamically set the icon color based on severity level
    val iconColor: Color = when (severityLevel) {
        "high" -> Color.Red
        "medium" -> Color.Yellow
        "low" -> Color.Green
        else -> Color.Gray
    }

    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .height(200.dp)
            .padding(8.dp)
            .border(width = 1.dp, color = Color.LightGray, shape = RoundedCornerShape(20.dp))

            .fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
            Row( verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(16.dp)) {
                Image(
                    painter = icon1,
                    contentDescription = "",
                    modifier = Modifier.height(24.dp),
                    colorFilter = ColorFilter.tint(iconColor)
                )

                Image(
                    painter = icon2,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                        .height(24.dp),
                    colorFilter = ColorFilter.tint(iconColor)
                )

                Image(
                    painter = icon3,
                    contentDescription = "",
                    modifier = Modifier
                        .padding(horizontal = 2.dp)
                        .height(24.dp),
                    colorFilter = ColorFilter.tint(iconColor)
                )

                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(2.dp)
                )
            }

            Row(modifier = Modifier.padding(start = 16.dp)) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color.Black
                            )
                        ) {
                            append("Reaction: ")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black
                            )
                        ) {
                            append(reaction)
                        }
                    }
                )
            }

            Row(modifier = Modifier.padding(start = 12.dp, top = 8.dp)) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = Color.Black
                            )
                        ) {
                            append("Onset Date: ")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                color = Color.Black
                            )
                        ) {
                            append(onsetDate)
                        }
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewCustomCardViewAllergies() {
    CustomCardViewAllergies(
        title = "Food Allergies",
        reaction = "Severe itching and redness after consuming peanuts",
        onsetDate = "12/04/2023",
        icon1 = painterResource(R.drawable.green_circle),
        icon2 = painterResource(R.drawable.warningcircle),
        icon3 = painterResource(R.drawable.signal_cellular),
        severityLevel = "high"
    )
}



