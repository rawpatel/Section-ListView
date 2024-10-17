package com.heynoki.uisectionlistview.section.categories




import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.heynoki.uisectionlistview.R

@Preview
@Composable
fun PreviewAllergySectionWithHeader() {
    val sampleAllergies1 = listOf(
        Allergy(
            title = "Peanut Allergy",
            reaction = "Severe itching",
            onsetDate = "12/04/2023",
            severityLevel = "high",
            icon1 = painterResource(R.drawable.green_circle),
            icon2 = painterResource(R.drawable.warningcircle),
            icon3 = painterResource(R.drawable.signal_cellular)
        )
    )

    val sampleAllergies2 = listOf(
        Allergy(
            title = "Penicillin Allergy",
            reaction = "Hives and swelling",
            onsetDate = "11/05/2022",
            severityLevel = "medium",
            icon1 = painterResource(R.drawable.green_circle),
            icon2 = painterResource(R.drawable.warningcircle),
            icon3 = painterResource(R.drawable.signal_cellular)
        )
    )

    val sampleSections = listOf(
        AllergySection(sectionTitle = "Current Allergies", allergies = sampleAllergies1),
        AllergySection(sectionTitle = "Past Allergies", allergies = sampleAllergies2)
    )

    AllergySectionWithHeader(
        header = AllergyHeader(headerTitle = "Patient Allergy Information"),
        sections = sampleSections
    )
}



/*


import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.heynoki.uisectionlistview.R

@Preview
@Composable
fun PreviewAllergySectionList() {
    val sampleAllergies1 = listOf(
        Allergy(
            title = "Food Allergy",
            reaction = "Severe itching",
            onsetDate = "12/04/2023",
            severityLevel = "high",
            icon1 = painterResource(R.drawable.green_circle),
            icon2 = painterResource(R.drawable.warningcircle),
            icon3 = painterResource(R.drawable.signal_cellular)
        )
    )

    val sampleAllergies2 = listOf(
        Allergy(
            title = "Drug Allergy",
            reaction = "Hives and swelling",
            onsetDate = "11/05/2022",
            severityLevel = "medium",
            icon1 = painterResource(R.drawable.green_circle),
            icon2 = painterResource(R.drawable.warningcircle),
            icon3 = painterResource(R.drawable.signal_cellular)
        )
    )

    val sampleSections = listOf(
        AllergySection(sectionTitle = "Recent Allergies", allergies = sampleAllergies1),
        AllergySection(sectionTitle = "Past Allergies", allergies = sampleAllergies2)
    )

    AllergySectionList(sections = sampleSections)
}

 */
