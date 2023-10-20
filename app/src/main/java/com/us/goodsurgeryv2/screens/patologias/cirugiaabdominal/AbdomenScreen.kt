package com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.us.goodsurgeryv2.navigation.AppScreens
import com.us.goodsurgeryv2.ui.theme.Typography
import com.us.goodsurgeryv2.util.extension.CustomButtonContentGrande
import com.us.goodsurgeryv2.util.extension.CustomButtonContentGrandeEspaciado
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarSubapartados

@Composable
fun AbdomenScreen(navController: NavController){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "¿Cuál es su patología?")
        CustomTopAppBarSubapartados(title = "¿Cuál es su patologia? > Cirugía abdominal", style = Typography.bodyMedium)
        AbdomenBodyContent(navController)
    }
}

@Composable
fun AbdomenBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomButtonContentGrandeEspaciado(onClick = {
            navController.navigate(route = AppScreens.PoliposScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Polipos colorrectales")

        CustomButtonContentGrande(onClick = {
            navController.navigate(route = AppScreens.ReconstruccionScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Reconstrucción del tránsito")

        CustomButtonContentGrande(onClick = {
            navController.navigate(route = AppScreens.InflamatoriaScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Enfermedad inflamatoria intestinal")
    }
}

@Preview
@Composable
fun AbdomenScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    val navController = rememberNavController()
    AbdomenScreen(navController = navController)
}