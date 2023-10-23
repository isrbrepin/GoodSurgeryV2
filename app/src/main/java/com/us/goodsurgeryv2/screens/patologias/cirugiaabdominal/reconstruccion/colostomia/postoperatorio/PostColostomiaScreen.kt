package com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.postoperatorio

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.navigation.NavController
import com.us.goodsurgeryv2.navigation.AppScreens
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
fun PostColostomiaScreen(navController: NavController) {

    Column() {
        CustomTopAppBar()
        CustomTopAppBarApartados(
            title = "Cierre de colostomia terminal")
        CustomTopAppBarSubapartados(title = "Postoperatorio - Tras la cirugía", style = Typography.titleLarge)
        PostColostomiaBodyContent(navController)
    }
}

@Composable
fun PostColostomiaBodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
    ) {
        CustomContentPostoperatorio(
            onClick1 = { navController.navigate(route = AppScreens.AltaColostomiaScreen.route) },
            onClick2 = { navController.navigate(route = AppScreens.OstomiaColostomiaScreen.route) }
        )
    }
}
