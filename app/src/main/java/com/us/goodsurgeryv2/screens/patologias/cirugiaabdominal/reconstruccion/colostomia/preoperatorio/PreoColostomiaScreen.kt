package com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.preoperatorio

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
import com.us.goodsurgeryv2.util.extension.CustomContentPreoperatorio
import com.us.goodsurgeryv2.util.extension.CustomContentPrincipal
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarSubapartados

@Composable
fun PreoColostomiaScreen(navController: NavController){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Cierre de colostomia terminal")
        CustomTopAppBarSubapartados(title = "Preoperatorio - Antes de la cirugía", style = Typography.titleLarge)
        PreoColostomiaBodyContent(navController)
    }
}

@Composable
fun PreoColostomiaBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomContentPreoperatorio(
            onClick1 = { navController.navigate(route = AppScreens.AnestesiaColostomiaScreen.route) },
            onClick2 = { navController.navigate(route = AppScreens.PrepColostomiaScreen.route) },
            onClick3 = { navController.navigate(route = AppScreens.IngresoColostomiaScreen.route) },
            onClick4 = { navController.navigate(route = AppScreens.HospitalColostomiaScreen.route) })
    }
}

@Preview
@Composable
fun PreoColostomiaScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    val navController = rememberNavController()
    PreoColostomiaScreen(navController = navController)
}