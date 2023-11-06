package com.yhrjfj.newsapp.presentation.onboarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.loc.newsapp.R
import com.yhrjfj.newsapp.presentation.Dimens.MediumPadding1
import com.yhrjfj.newsapp.presentation.Dimens.MediumPadding2
import com.yhrjfj.newsapp.presentation.onboarding.Page
import com.yhrjfj.newsapp.presentation.onboarding.pages
import com.yhrjfj.newsapp.ui.theme.NewsAppTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(modifier = Modifier) {

        // Image from news
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f),
            painter = painterResource(id = page.image),
            contentDescription = "onBoarding",
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(MediumPadding1))

        // Title of a news
        Text(
            text = page.title,
            modifier = Modifier.padding(MediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )

        // Description of a news
        Text(
            text = page.description,
            modifier = Modifier.padding(MediumPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun OnBoardingPagePreview(){
    NewsAppTheme {
        OnBoardingPage(page = pages[0])
    }
}