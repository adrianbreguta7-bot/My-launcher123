package com.movtery.zalithlauncher.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color

fun ColorScheme.toGlass(): ColorScheme = copy(
    background = Color(0xFF0F0B28),
    surface = Color(0xFF15103A),
    surfaceDim = Color(0xFF0F0B28),
    surfaceBright = Color(0xFF2E2468).copy(alpha = 0.85f),
    surfaceContainerLowest = Color(0xFF0C0922),
    surfaceContainerLow = Color(0xFF1A1448).copy(alpha = 0.72f),
    surfaceContainer = Color(0xFF241C5C).copy(alpha = 0.68f),
    surfaceContainerHigh = Color(0xFF2E2470).copy(alpha = 0.66f),
    surfaceContainerHighest = Color(0xFF3A2E85).copy(alpha = 0.64f),
    surfaceVariant = Color(0xFF2B2260).copy(alpha = 0.7f),
    onSurface = Color(0xFFEDEBFF),
    onBackground = Color(0xFFEDEBFF),
    onSurfaceVariant = Color(0xFFC9C3F0),
    outline = Color(0xFFB9B0F5).copy(alpha = 0.55f),
    outlineVariant = Color(0xFFB9B0F5).copy(alpha = 0.28f)
)
