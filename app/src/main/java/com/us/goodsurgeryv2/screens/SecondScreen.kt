package com.us.goodsurgeryv2.screens

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
import com.us.goodsurgeryv2.util.extension.CustomButtonContentGrande
import com.us.goodsurgeryv2.util.extension.CustomButtonContentGrandeEspaciado
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados

@Composable
fun SecondScreen(navController: NavController){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "¿Cuál es su patología?")
        PatologiaBodyContent(navController)
    }
}

@Composable
fun PatologiaBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomButtonContentGrandeEspaciado(onClick = {
            navController.navigate(route = AppScreens.AbdomenScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Cirugía abdominal")

        CustomButtonContentGrande(onClick = {
            navController.navigate(route = AppScreens.ProctologiaScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Proctología")

        CustomButtonContentGrande(onClick = {
            navController.navigate(route = AppScreens.SueloScreen.route) //Si pulso el boton me lleva a la segunda pantalla
        }, text = "Suelo pélvico")
    }
}

@Preview
@Composable
fun SecondScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    val navController = rememberNavController()
    SecondScreen(navController = navController)
}