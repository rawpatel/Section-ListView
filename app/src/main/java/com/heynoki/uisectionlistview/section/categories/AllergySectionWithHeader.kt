package com.heynoki.uisectionlistview.section.categories



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.heynoki.uisectionlistview.section.CustomCardViewAllergies
import com.heynoki.uisectionlistview.ui.theme.Purple80

@Composable
fun AllergySectionWithHeader(
    header: AllergyHeader,
    sections: List<AllergySection>
) {
    LazyColumn(modifier = Modifier.padding(8.dp)) {
        // Add header
        item {
            AllergyHeaderView(header.headerTitle)
        }

        // Add sections
        sections.forEach { section ->
            item {
                Text(
                    text = section.sectionTitle,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier

                        .fillMaxWidth()
                        .background(Purple80)
                        .padding( 12.dp)
                )
            }

            itemsIndexed(section.allergies) { _, allergy ->
                CustomCardViewAllergies(
                    title = allergy.title,
                    reaction = allergy.reaction,
                    onsetDate = allergy.onsetDate,
                    severityLevel = allergy.severityLevel,
                    icon1 = allergy.icon1,
                    icon2 = allergy.icon2,
                    icon3 = allergy.icon3
                )
            }
        }
    }
}

