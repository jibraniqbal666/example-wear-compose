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

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.example.android.wearable.composeforwearos.theme.WearAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF056835))
            ) {
                WearApp()
            }
        }
    }
}

@Composable
fun WearApp() {
    WearAppTheme {
        val listState = rememberScalingLazyListState()
        Scaffold(
            timeText = {
                if (!listState.isScrollInProgress) {
                    TimeText()
                }
            },
            vignette = {
                Vignette(vignettePosition = VignettePosition.TopAndBottom)
            },
            positionIndicator = {
                PositionIndicator(
                    scalingLazyListState = listState
                )
            }
        ) {
            val navController = rememberSwipeDismissableNavController()

            SwipeDismissableNavHost(
                navController = navController,
                startDestination = "main"
            ) {
                val weekData = WidgetData.FakeData
                composable("main") {
                    val contentModifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)

                    ScalingLazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        autoCentering = AutoCenteringParams(itemIndex = 0),
                        state = listState
                    ) {

                        item { DeliveryText() }
                        item { HXDCalendarIconWidget(timeInMillis = weekData.weeks.first().date) }

                        itemsIndexed(weekData.weeks.first().recipes) { index, item ->
                            RecipeCard(uiModel = item, index, contentModifier) {
                                navController.navigate("detail/$it")
                            }
                        }
                    }
                }

                composable("detail/{index}") {
                    val index = it.arguments?.getString("index")?.toInt() ?: 0
                    RecipeDetail(uiModel = weekData.weeks.first().recipes[index], index = index)
                }
            }
        }
    }
}

// Note: Preview in Android Studio doesn't support the round view yet (coming soon).
@Preview(
    widthDp = WEAR_PREVIEW_DEVICE_WIDTH_DP,
    heightDp = WEAR_PREVIEW_DEVICE_HEIGHT_DP,
    apiLevel = WEAR_PREVIEW_API_LEVEL,
    uiMode = WEAR_PREVIEW_UI_MODE,
    backgroundColor = WEAR_PREVIEW_BACKGROUND_COLOR_BLACK,
    showBackground = WEAR_PREVIEW_SHOW_BACKGROUND
)
@Composable
fun WearAppPreview() {
    WearApp()
}
