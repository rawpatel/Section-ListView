package com.heynoki.uisectionlistview.section.model

import androidx.compose.ui.graphics.painter.Painter



data class Allergy(
    val title: String,
    val reaction: String,
    val onsetDate: String,
    val severityLevel: String,
    val icon1: Painter,
    val icon2: Painter,
    val icon3: Painter
)

data class AllergySection(
    val sectionTitle: String,
    val allergies: List<Allergy>
)

data class AllergyHeader(
    val headerTitle: String
)
