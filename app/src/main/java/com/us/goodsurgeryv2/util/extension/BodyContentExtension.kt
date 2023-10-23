package com.us.goodsurgeryv2.util.extension

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.us.goodsurgeryv2.ui.theme.ColorBordeContent
import com.us.goodsurgeryv2.ui.theme.ColorBordeInstrucciones
import com.us.goodsurgeryv2.ui.theme.ColorBotones
import com.us.goodsurgeryv2.ui.theme.ColorBotonesDisabled
import com.us.goodsurgeryv2.ui.theme.GoodSurgeryV2Theme
import com.us.goodsurgeryv2.ui.theme.Typography

//Aquí voy a hacer los bodyContent Comunes, es decir, InfoProceso,preo,post
@Composable
fun CustomButtonContentGrande(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 15.dp, start = 15.dp, top = 10.dp, bottom = 10.dp)
            .height(115.dp),
        elevation = ButtonDefaults.buttonElevation(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            disabledContainerColor = ColorBotonesDisabled,
            contentColor = Color.Black,
            disabledContentColor = Color.White
        )
        ,border = BorderStroke(1.dp, ColorBordeContent),
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(text = text, style = Typography.titleLarge, textAlign = TextAlign.Center)
    }
}

@Composable
fun CustomButtonContentGrandeEspaciado(text: String, onClick: () -> Unit) {
    Button(
        onClick =  onClick ,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 15.dp, start = 15.dp, top = 20.dp, bottom = 10.dp)
            .height(115.dp),
        elevation = ButtonDefaults.buttonElevation(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            disabledContainerColor = ColorBotonesDisabled,
            contentColor = Color.Black,
            disabledContentColor = Color.White
        )
        ,border = BorderStroke(1.dp, ColorBordeContent),
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(text = text, style = Typography.titleLarge, textAlign = TextAlign.Center)
    }
}

@Composable
fun CustomButtonContentPequeno(text: String, onClick: () -> Unit) {
    Button(
        onClick =  onClick ,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 15.dp, start = 15.dp, top = 10.dp, bottom = 10.dp)
            .height(90.dp),
        elevation = ButtonDefaults.buttonElevation(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            disabledContainerColor = ColorBotonesDisabled,
            contentColor = Color.Black,
            disabledContentColor = Color.White
        )
        ,border = BorderStroke(1.dp, ColorBordeContent),
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(text = text, style = Typography.titleLarge, textAlign = TextAlign.Center)
    }
}

@Composable
fun CustomButtonContentPequenoEspaciado(text: String, onClick: () -> Unit) {
    Button(
        onClick =  onClick ,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 15.dp, start = 15.dp, top = 20.dp, bottom = 10.dp)
            .height(90.dp),
        elevation = ButtonDefaults.buttonElevation(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            disabledContainerColor = ColorBotonesDisabled,
            contentColor = Color.Black,
            disabledContentColor = Color.White
        )
        ,border = BorderStroke(1.dp, ColorBordeContent),
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(text = text, style = Typography.titleLarge, textAlign = TextAlign.Center)
    }
}

@Composable
fun CustomContentPrincipal(onClick1: () -> Unit, onClick2: () -> Unit, onClick3: () -> Unit) {
    Button(
        onClick = onClick1,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 15.dp, start = 15.dp, top = 20.dp, bottom = 10.dp)
            .height(115.dp),
        elevation = ButtonDefaults.buttonElevation(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            disabledContainerColor = ColorBotonesDisabled,
            contentColor = Color.Black,
            disabledContentColor = Color.White
        )
        ,border = BorderStroke(1.dp, ColorBordeContent),
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(text = "Información del proceso", style = Typography.titleLarge, textAlign = TextAlign.Center)
    }
    Button(
        onClick = onClick2,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 15.dp, start = 15.dp, top = 10.dp, bottom = 10.dp)
            .height(115.dp),
        elevation = ButtonDefaults.buttonElevation(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            disabledContainerColor = ColorBotonesDisabled,
            contentColor = Color.Black,
            disabledContentColor = Color.White
        )
        ,border = BorderStroke(1.dp, ColorBordeContent),
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(text = "Preoperatorio\nAntes de la cirugía.", style = Typography.titleLarge, textAlign = TextAlign.Center)
    }
    Button(
        onClick = onClick3,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 15.dp, start = 15.dp, top = 10.dp, bottom = 10.dp)
            .height(115.dp),
        elevation = ButtonDefaults.buttonElevation(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            disabledContainerColor = ColorBotonesDisabled,
            contentColor = Color.Black,
            disabledContentColor = Color.White
        )
        ,border = BorderStroke(1.dp, ColorBordeContent),
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(text = "Postoperatorio.\nTras la cirugía.", style = Typography.titleLarge, textAlign = TextAlign.Center)
    }
}

@Composable
fun CustomContentPreoperatorio(onClick1: () -> Unit, onClick2: () -> Unit, onClick3: () -> Unit, onClick4: ()-> Unit) {
    Column() {
        CustomButtonContentPequenoEspaciado(text = "Anestesia", onClick1)
        CustomButtonContentPequeno(text = "¿Cómo me debo preparar?", onClick2)
        CustomButtonContentPequeno(text = "El día del ingreso", onClick3)
        CustomButtonContentPequeno(text = "En el hospital", onClick4)
    }

}

@Composable
fun CustomContentPostoperatorio(onClick1: () -> Unit, onClick2: () -> Unit) {
    Column() {
        CustomButtonContentGrandeEspaciado(text = "Al Alta", onClick1)
        CustomButtonContentGrande(text = "Ostomia", onClick2)
    }

}

@Composable
@Preview
    fun CustomContentPreview() {
    GoodSurgeryV2Theme() {
        CustomContentPreoperatorio(
            onClick1 = { /*TODO*/ },
            onClick2 = { /*TODO*/ },
            onClick3 = { /*TODO*/ }) {
            
        }
    }


}