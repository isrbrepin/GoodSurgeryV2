package com.us.goodsurgeryv2.screens.patologias.proctologia

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
fun ProctologiaScreen(navController: NavController){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "¿Cuál es su patología?")
        CustomTopAppBarSubapartados(title = "¿Cuál es su patologia? > Proctología", style = Typography.bodyMedium)
        ProctologiaBodyContent(navController)
    }
}

@Composable
fun ProctologiaBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomButtonContentGrandeEspaciado(onClick = {
            navController.navigate(route = AppScreens.HemorroidesScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Hemorroides")

        CustomButtonContentGrande(onClick = {
            navController.navigate(route = AppScreens.FisuraScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Fisura anal")

        CustomButtonContentGrande(onClick = {
            navController.navigate(route = AppScreens.FistulaScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Fistula anal")
    }
}

@Preview
@Composable
fun ProctologiaScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    val navController = rememberNavController()
    ProctologiaScreen(navController = navController)
}