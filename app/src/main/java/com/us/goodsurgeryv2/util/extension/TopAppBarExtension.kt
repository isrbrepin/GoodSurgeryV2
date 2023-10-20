package com.us.goodsurgeryv2.util.extension

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.us.goodsurgeryv2.R
import com.us.goodsurgeryv2.ui.theme.ColorHeader
import com.us.goodsurgeryv2.ui.theme.ColorSubapartados
import com.us.goodsurgeryv2.ui.theme.GoodSurgeryV2Theme
import com.us.goodsurgeryv2.ui.theme.Typography

@Composable
fun CustomTopAppBar() {
    Surface(
        modifier = Modifier.fillMaxWidth().height(60.dp),
        color = ColorHeader
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_app),
                contentDescription = "logo_image_header",
                modifier = Modifier
                    .height(60.dp)
                // Elimina el modificador de padding para la imagen
            )
            Spacer(modifier = Modifier.weight(1f)) // Espacio flexible que empujará el botón hacia la derecha
            CustomButtonAyuda() {
                // Aquí puedes definir la acción del botón
            }
        }
    }
}

@Composable
fun CustomTopAppBarApartados(
    title: String
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = ColorHeader
    ) {
        Text(
            text = title,
            modifier = Modifier
                .height(50.dp)
                .wrapContentSize(Alignment.Center),
            color = Color.White,
            style = Typography.titleLarge
        )
    }
}

@Composable
fun CustomTopAppBarSubapartados(
    title: String,
    style: TextStyle
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = ColorSubapartados
    ) {
        Text(
            text = title,
            modifier = Modifier
                .height(50.dp)
                .wrapContentSize(Alignment.Center),
            color = Color.White,
            style = style
        )
    }
}

@Preview
@Composable
fun CustomTopAppBarPreview() {
    GoodSurgeryV2Theme() {
        CustomTopAppBar()
    }
}