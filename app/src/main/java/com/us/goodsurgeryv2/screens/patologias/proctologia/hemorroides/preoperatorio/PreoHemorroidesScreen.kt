package com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.preoperatorio

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
fun PreoHemorroidesScreen(navController: NavController){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Hemorroides")
        CustomTopAppBarSubapartados(title = "Preoperatorio - Antes de la cirugía", style = Typography.titleLarge)
        PreoHemorroidesBodyContent(navController)
    }
}

@Composable
fun PreoHemorroidesBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomContentPreoperatorio(
            onClick1 = { navController.navigate(route = AppScreens.AnestesiaHemorroidesScreen.route) },
            onClick2 = { navController.navigate(route = AppScreens.PrepHemorroidesScreen.route) },
            onClick3 = { navController.navigate(route = AppScreens.IngresoHemorroidesScreen.route) },
            onClick4 = { navController.navigate(route = AppScreens.HospitalHemorroidesScreen.route) })
    }
}

@Preview
@Composable
fun PreoHemorroidesScreenPreview(){ // Puedes crear un NavController de prueba para la vista previa
    val navController = rememberNavController()
    PreoHemorroidesScreen(navController = navController)
}