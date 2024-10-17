package com.heynoki.uisectionlistview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.res.painterResource
import com.heynoki.uisectionlistview.section.categories.Allergy
import com.heynoki.uisectionlistview.section.categories.AllergyHeader
import com.heynoki.uisectionlistview.section.categories.AllergySection
import com.heynoki.uisectionlistview.section.categories.AllergySectionWithHeader
import com.heynoki.uisectionlistview.ui.theme.UiSectionListViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UiSectionListViewTheme {

                val sampleAllergies1 = listOf(
                    Allergy(
                        title = "Peanut Allergy",
                        reaction = "Severe itching, swelling, Diarrhea, Conjunctivitis, Dizziness/Lightheadedness, Cough, Facial swelling",
                        onsetDate = "12/04/2023",
                        severityLevel = "high",
                        icon1 = painterResource(R.drawable.green_circle),
                        icon2 = painterResource(R.drawable.warningcircle),
                        icon3 = painterResource(R.drawable.signal_cellular)
                    ),
                    Allergy(
                        title = "Dust Allergy",
                        reaction = "Sneezing, coughing",
                        onsetDate = "15/06/2021",
                        severityLevel = "medium",
                        icon1 = painterResource(R.drawable.green_circle),
                        icon2 = painterResource(R.drawable.warningcircle),
                        icon3 = painterResource(R.drawable.signal_cellular)
                    ),

                    Allergy(
                        title = "Dust Allergy",
                        reaction = "Sneezing, coughing, Diarrhea, Conjunctivitis, Dizziness/Lightheadedness, Cough, Facial swelling",
                        onsetDate = "15/06/2021",
                        severityLevel = "high",
                        icon1 = painterResource(R.drawable.green_circle),
                        icon2 = painterResource(R.drawable.warningcircle),
                        icon3 = painterResource(R.drawable.signal_cellular)
                    ),

                    Allergy(
                        title = "Dust Allergy",
                        reaction = "Sneezing, coughing, Diarrhea, Conjunctivitis, Dizziness/Lightheadedness, Cough, Facial swelling",
                        onsetDate = "15/06/2021",
                        severityLevel = "medium",
                        icon1 = painterResource(R.drawable.green_circle),
                        icon2 = painterResource(R.drawable.warningcircle),
                        icon3 = painterResource(R.drawable.signal_cellular)
                    )
                )

                val sampleAllergies2 = listOf(
                    Allergy(
                        title = "Penicillin Allergy, Diarrhea, Conjunctivitis, Dizziness/Lightheadedness, Cough, Facial swelling",
                        reaction = "Hives, swelling",
                        onsetDate = "11/05/2022",
                        severityLevel = "low",
                        icon1 = painterResource(R.drawable.green_circle),
                        icon2 = painterResource(R.drawable.warningcircle),
                        icon3 = painterResource(R.drawable.signal_cellular)
                    )
                )



                    Allergy(
                        title = "Dust Allergy",
                        reaction = "Sneezing, coughing",
                        onsetDate = "15/06/2021",
                        severityLevel = "medium",
                        icon1 = painterResource(R.drawable.green_circle),
                        icon2 = painterResource(R.drawable.warningcircle),
                        icon3 = painterResource(R.drawable.signal_cellular),
                    )

                Allergy(
                    title = "Dust Allergy",
                    reaction = "Sneezing, coughing",
                    onsetDate = "15/06/2021",
                    severityLevel = "medium",
                    icon1 = painterResource(R.drawable.green_circle),
                    icon2 = painterResource(R.drawable.warningcircle),
                    icon3 = painterResource(R.drawable.signal_cellular)
                )


                val sampleSections = listOf(
                    AllergySection(sectionTitle = "Current Allergies", allergies = sampleAllergies1),
                    AllergySection(sectionTitle = "Past Allergies", allergies = sampleAllergies1)
                )
                AllergySectionWithHeader(
                    header = AllergyHeader(headerTitle = "Patient Allergy Information"),
                    sections = sampleSections
                )



            }
        }
    }
}
