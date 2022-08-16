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
package com.example.android.wearable.composeforwearos

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Message
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.*
import coil.compose.rememberAsyncImagePainter
import com.example.android.wearable.composeforwearos.theme.WearAppTheme
import java.text.SimpleDateFormat
import java.util.*
import com.example.android.wearable.composeforwearos.theme.Green_300

/* Contains individual Wear OS demo composables for the code lab. */

@Composable
fun RecipeCard(
    uiModel: RecipeUiModel,
    modifier: Modifier = Modifier
) {

    TitleCard(
        modifier = modifier.wrapContentSize(),
        onClick = {  },
        title = { Text(uiModel.title, maxLines = 1, overflow = TextOverflow.Ellipsis) },
        backgroundPainter = CardDefaults.imageWithScrimBackgroundPainter(
            backgroundImagePainter = rememberAsyncImagePainter(uiModel.imageUrl)
        ),
        contentColor = MaterialTheme.colors.onSurface,
        titleColor = MaterialTheme.colors.onSurface,
        content = {
            Text(text = uiModel.description,
                fontSize = 12.sp, maxLines = 2, overflow = TextOverflow.Ellipsis)
        }
    )
}

@Composable
fun DeliveryText() {
    Text(
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center,
        color = Green_300,
        style = TextStyle(fontWeight = FontWeight.Bold),
        text = "Upcoming Delivery!"
    )
}

@Composable
fun HXDCalendarIconWidget(modifier: Modifier = Modifier, timeInMillis: Long) {
    val backgroundColor = Color(0xFFE4FABF)
    val foregroundColor = Color(0xFF067A46)
    val locale = Locale.getDefault()

    Card(
        modifier = modifier
            .width(64.dp),
        backgroundPainter = CardDefaults.cardBackgroundPainter(
            startBackgroundColor = backgroundColor,
            endBackgroundColor = backgroundColor
        ),
        shape = RoundedCornerShape(20),
        onClick = { })
    {

        Column(
            Modifier.align(Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val dayOfWeek = timeInMillis.toFormattedDayOfWeek(locale)
            Text(
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    lineHeight = 16.sp
                ),
                color = foregroundColor,
                text = dayOfWeek,
            )

            val dayOfMonth = timeInMillis.toFormattedDayOfMonth(locale)
            Text(
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    lineHeight = 26.sp,
                ),
                color = foregroundColor,
                text = dayOfMonth,
            )
        }
    }
}

@Preview
@Composable
fun CalendarExamplePreview() {
    WearAppTheme {
        HXDCalendarIconWidget(
            modifier = Modifier,
            timeInMillis = Date().time
        )
    }
}


fun Long.toFormattedDayOfMonth(locale: Locale): String {
    val formatterDay = SimpleDateFormat("dd", locale)
    return formatterDay.format(this)
}

fun Long.toFormattedDayOfWeek(locale: Locale): String {
    val formatterWeek = SimpleDateFormat("EEE", locale)
    return formatterWeek.format(this).uppercase()
}