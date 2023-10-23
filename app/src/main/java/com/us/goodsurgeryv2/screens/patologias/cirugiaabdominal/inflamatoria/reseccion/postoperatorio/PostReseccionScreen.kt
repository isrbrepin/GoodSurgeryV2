package com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.postoperatorio

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
import com.us.goodsurgeryv2.util.extension.CustomContentPostoperatorio
import com.us.goodsurgeryv2.util.extension.CustomContentPreoperatorio
import com.us.goodsurgeryv2.util.extension.CustomContentPrincipal
import com.us.goodsurgeryv2.util.extension.CustomTopAppBar
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarApartados
import com.us.goodsurgeryv2.util.extension.CustomTopAppBarSubapartados

@Composable
fun PostReseccionScreen(navController: NavController){

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Resección intestinal")
        CustomTopAppBarSubapartados(title = "Postoperatorio - Tras la cirugía", style = Typography.titleLarge)
        PostReseccionBodyContent(navController)
    }
}

@Composable
fun PostReseccionBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomContentPostoperatorio(
            onClick1 = { navController.navigate(route = AppScreens.AltaReseccionScreen.route) },
            onClick2 = { navController.navigate(route = AppScreens.OstomiaReseccionScreen.route) }
        )
    }
}
