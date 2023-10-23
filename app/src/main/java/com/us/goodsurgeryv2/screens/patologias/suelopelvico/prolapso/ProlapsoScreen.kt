package com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso

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
import com.us.goodsurgeryv2.util.extension.CustomContentPrincipal
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados

@Composable
fun ProlapsoScreen(navController: NavController){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Prolapso")
        ProlapsoBodyContent(navController)
    }
}

@Composable
fun ProlapsoBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomContentPrincipal(
            onClick1 = { navController.navigate(route = AppScreens.InfoProlapsoScreen.route) },
            onClick2 = { navController.navigate(route = AppScreens.PreoProlapsoScreen.route) },
            onClick3 = { navController.navigate(route = AppScreens.PostProlapsoScreen.route) })
    }
}

@Preview
@Composable
fun ProlapsoScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    val navController = rememberNavController()
    ProlapsoScreen(navController = navController)
}