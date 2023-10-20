package com.us.goodsurgeryv2.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.us.goodsurgeryv2.navigation.AppScreens
import com.us.goodsurgeryv2.ui.theme.ColorBordeInstrucciones
import com.us.goodsurgeryv2.ui.theme.ColorBotones
import com.us.goodsurgeryv2.ui.theme.Typography
import com.us.goodsurgeryv2.util.extension.CustomButtonComenzar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar

@Composable
fun MainScreen(navController: NavController){
    Column {
        CustomTopAppBar()
        TextInstructionsComposable()
        BodyContent(navController = navController)
    }
}


@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        CustomButtonComenzar(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        })
    }

}

@Composable
fun TextInstructionsComposable() {
    Column() {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            elevation = CardDefaults.cardElevation(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
            ),
            border = BorderStroke(1.dp, ColorBordeInstrucciones)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp), // Aumenta el padding para separar más el borde y el contenido
                colors = CardDefaults.cardColors(
                    containerColor = ColorBotones,
                ),
                border = BorderStroke(1.dp, ColorBordeInstrucciones),
                shape = MaterialTheme.shapes.small

                ) {
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "Instrucciones de uso de la app",
                    style = Typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(5.dp)
                )

            }
            Column(modifier = Modifier.padding(16.dp)) {

                Text(text = "1. Pulse en “pulse aquí para comenzar”", style = Typography.bodySmall)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "2. Una vez presione, seleccione el tipo de intervención/proceso/patología que le hayan explicado en la consulta", style = Typography.bodySmall)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "3. Una vez dentro encontrará la informacion necesaria para el proceso, preoperatorio y postoperatorio", style = Typography.bodySmall)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "4. .............................................", style = Typography.bodySmall)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "5. .............................................", style = Typography.bodySmall)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "6. ..............................................", style = Typography.bodySmall)

            }
        }
    }
}



@Composable
@Preview
fun MainScreenPreview() {
    // Puedes crear un NavController de prueba para la vista previa
    val navController = rememberNavController()
    MainScreen(navController = navController)
}

