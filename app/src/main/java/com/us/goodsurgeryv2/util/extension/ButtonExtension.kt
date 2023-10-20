package com.us.goodsurgeryv2.util.extension

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.us.goodsurgeryv2.ui.theme.ColorBordeBotones
import com.us.goodsurgeryv2.ui.theme.ColorBotones
import com.us.goodsurgeryv2.ui.theme.ColorBotonesDisabled
import com.us.goodsurgeryv2.ui.theme.GoodSurgeryV2Theme
import com.us.goodsurgeryv2.ui.theme.Typography

@Composable
fun CustomButtonAyuda(onClick: () -> Unit) {
    Button(
        onClick =  onClick ,  //Aquí habria que poner el mensaje del contacte a su medico cuando esté hecho
        modifier = Modifier.wrapContentWidth()
            .padding(10.dp)
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ColorBotones,
            disabledContainerColor = ColorBotonesDisabled,
            contentColor = Color.Black,
            disabledContentColor = Color.White
        )
        ,border = BorderStroke(2.dp, ColorBordeBotones),
        shape = RoundedCornerShape(4.dp)

    ) {
        Text(text = "Ayuda", style = Typography.bodySmall)
    }
}

@Composable
fun CustomButtonComenzar(onClick: () -> Unit) {
    Button(
        onClick = onClick,  //Aquí habria que poner dentro del MainScreen que vaya a PatologíaScreen
        modifier = Modifier.wrapContentWidth()
            .padding(10.dp)
            .height(60.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = ColorBotones,
            disabledContainerColor = ColorBotonesDisabled,
            contentColor = Color.Black,
            disabledContentColor = Color.White
        )
        ,border = BorderStroke(2.dp, ColorBordeBotones),
        shape = RoundedCornerShape(10.dp)

    ) {
        Text(text = "Pulse aquí para comenzar", style = Typography.bodyMedium)
    }
}

@Composable
@Preview
fun CustomButtonPreview() {
    GoodSurgeryV2Theme() {
        CustomButtonComenzar() {
            // Lógica al hacer clic en el botón
        }
    }
}