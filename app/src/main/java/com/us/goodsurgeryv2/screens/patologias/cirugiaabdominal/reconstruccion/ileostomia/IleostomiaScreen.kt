package com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia

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
import com.us.goodsurgeryv2.util.extension.CustomContentPrincipal
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarSubapartados

@Composable
fun IleostomiaScreen(navController: NavController){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Cierre de ileostomia lateral")
        IleostomiaBodyContent(navController)
    }
}

@Composable
fun IleostomiaBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomContentPrincipal(
            onClick1 = { navController.navigate(route = AppScreens.InfoIleostomiaScreen.route) },
            onClick2 = { navController.navigate(route = AppScreens.PreoIleostomiaScreen.route) },
            onClick3 = { navController.navigate(route = AppScreens.PostIleostomiaScreen.route) })
    }
}

@Preview
@Composable
fun IleostomiaScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    val navController = rememberNavController()
    IleostomiaScreen(navController = navController)
}