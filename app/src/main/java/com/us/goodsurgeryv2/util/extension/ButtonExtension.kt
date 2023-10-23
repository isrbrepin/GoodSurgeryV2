package com.us.goodsurgeryv2.util.extension

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.us.goodsurgeryv2.ui.theme.ColorBordeBotones
import com.us.goodsurgeryv2.ui.theme.ColorBotones
import com.us.goodsurgeryv2.ui.theme.ColorBotonesDisabled
import com.us.goodsurgeryv2.ui.theme.GoodSurgeryV2Theme
import com.us.goodsurgeryv2.ui.theme.Typography

@Composable
fun CustomButtonAyuda(onClick: () -> Unit) {
    var show by remember { mutableStateOf(false) }
    Button(
        onClick = { show = true } ,  //Aquí habria que poner el mensaje del contacte a su medico cuando esté hecho
        modifier = Modifier
            .wrapContentWidth()
            .padding(10.dp)
            .height(50.dp),
        elevation = ButtonDefaults.buttonElevation(5.dp),
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
    MyCustomDialog(show = show, onDismiss = {show = false})
}

@Composable
fun CustomButtonComenzar(onClick: () -> Unit) {
    Button(
        onClick = onClick,  //Aquí habria que poner dentro del MainScreen que vaya a PatologíaScreen
        modifier = Modifier
            .wrapContentWidth()
            .padding(10.dp)
            .height(60.dp),
        elevation = ButtonDefaults.buttonElevation(7.dp),
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
fun MyCustomDialog(show: Boolean, onDismiss: () -> Unit) {
    if (show) {
        // Define la cantidad de desplazamiento hacia arriba que deseas aplicar

        AlertDialog(
            onDismissRequest = { onDismiss() },
            confirmButton = {},
            dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text(text = "Salir")
                }
            },
            title = {
                Column {
                    Text(text = "Contacte con su médico", fontWeight = FontWeight.SemiBold)
                    Divider(modifier = Modifier.padding(vertical = 8.dp))
                }
            },
            text = {
                Text(text = "Teléfono: XXX XXX XXX\nEmail: xxxxxxxxxxx@gmail.com")
            },
        )
    }
}

