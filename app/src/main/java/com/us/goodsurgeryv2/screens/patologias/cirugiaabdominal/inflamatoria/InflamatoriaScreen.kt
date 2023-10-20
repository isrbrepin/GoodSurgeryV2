package com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.us.goodsurgeryv2.navigation.AppScreens
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.AbdomenBodyContent
import com.us.goodsurgeryv2.ui.theme.Typography
import com.us.goodsurgeryv2.util.extension.CustomButtonContentGrande
import com.us.goodsurgeryv2.util.extension.CustomButtonContentGrandeEspaciado
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarSubapartados

@Composable
fun InflamatoriaScreen(navController: NavController){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "¿Cuál es su patología?")
        CustomTopAppBarSubapartados(title = "¿Cuál es su patologia? > Cirugía abdominal > Enfermedad inflamatoria intestinal", style = Typography.titleSmall)
        InflamatoriaBodyContent(navController)
    }
}

@Composable
fun InflamatoriaBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomButtonContentGrandeEspaciado(onClick = {
            navController.navigate(route = AppScreens.ReseccionScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Resección intestinal")

        CustomButtonContentGrande(onClick = {
            navController.navigate(route = AppScreens.EstomaScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Creación de estoma")
    }
}

@Preview
@Composable
fun InflamatoriaScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    val navController = rememberNavController()
    InflamatoriaScreen(navController = navController)
}