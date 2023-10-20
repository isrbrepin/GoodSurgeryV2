package com.us.goodsurgeryv2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.us.goodsurgeryv2.screens.MainScreen
import com.us.goodsurgeryv2.screens.SecondScreen
import com.us.goodsurgeryv2.screens.SplashScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.AbdomenScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.PoliposScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ReconstruccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.InflamatoriaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.EstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.InfoEstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.InfoReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.ReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.ColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.InfoColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.InfoRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.RectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.ColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.InfoColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.IleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.InfoIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.ProctologiaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.FistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.InfoFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.FisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.InfoFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.HemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.InfoHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.SueloScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.IncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.InfoIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.InfoProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.ProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.InfoRectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.RectoceleScreen

@Composable
fun AppNavigation(){ //Va a ser el elemento composable encargado de orquestar la navegacion, conoce las pantallas de la app y se encarga del paso entre ellas
    //Dos elementos esenciales de una libreria de navigation
    val navController = rememberNavController()//Esta constante navController habra que propagarla entre todas las pantallas, ya que se encarga de gestionar el estado de navegacion entre ellas
    NavHost(navController = navController, startDestination = AppScreens.SplahScreen.route){ //  Indica que la primera pantalla es MainScreen
        //Designamos cada una de las pantallas
        composable(route = AppScreens.SplahScreen.route){
            SplashScreen(navController)
        }
        composable(route = AppScreens.MainScreen.route){
            MainScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }

        //Screens pertenecientes al apartado de Cirugía abdominal

        composable(route = AppScreens.AbdomenScreen.route){
            AbdomenScreen(navController)
        }

        //Screens pertenecientes al apartado de polipos

        composable(route = AppScreens.PoliposScreen.route){
            PoliposScreen(navController)
        }
        composable(route = AppScreens.RectoScreen.route){
            RectoScreen(navController)
        }
        composable(route = AppScreens.InfoRectoScreen.route){
            InfoRectoScreen()
        }
        composable(route = AppScreens.ColonScreen.route){
            ColonScreen(navController)
        }
        composable(route = AppScreens.InfoColonScreen.route){
            InfoColonScreen()
        }

        //Screens de Reconstruccion del transito

        composable(route = AppScreens.ReconstruccionScreen.route){
            ReconstruccionScreen(navController)
        }
        composable(route = AppScreens.IleostomiaScreen.route){
            IleostomiaScreen(navController)
        }
        composable(route = AppScreens.InfoIleostomiaScreen.route){
            InfoIleostomiaScreen()
        }
        composable(route = AppScreens.ColostomiaScreen.route){
            ColostomiaScreen(navController)
        }
        composable(route = AppScreens.InfoColostomiaScreen.route){
            InfoColostomiaScreen()
        }

        //Screen de Enfermedad inflamatoria intestinal

        composable(route = AppScreens.InflamatoriaScreen.route){
            InflamatoriaScreen(navController)
        }
        composable(route = AppScreens.ReseccionScreen.route){
            ReseccionScreen(navController)
        }
        composable(route = AppScreens.InfoReseccionScreen.route){
            InfoReseccionScreen()
        }
        composable(route = AppScreens.EstomaScreen.route){
            EstomaScreen(navController)
        }
        composable(route = AppScreens.InfoEstomaScreen.route){
            InfoEstomaScreen()
        }

        //Screens pertenecientes al apartado Proctología

        composable(route = AppScreens.ProctologiaScreen.route){
            ProctologiaScreen(navController)
        }
        composable(route = AppScreens.HemorroidesScreen.route){
            HemorroidesScreen(navController)
        }
        composable(route = AppScreens.InfoHemorroidesScreen.route){
            InfoHemorroidesScreen()
        }
        composable(route = AppScreens.FisuraScreen.route){
            FisuraScreen(navController)
        }
        composable(route = AppScreens.InfoFisuraScreen.route){
            InfoFisuraScreen()
        }
        composable(route = AppScreens.FistulaScreen.route){
            FistulaScreen(navController)
        }
        composable(route = AppScreens.InfoFistulaScreen.route){
            InfoFistulaScreen()
        }

        //Screens pertenecientes al apartado Suelo pelvico

        composable(route = AppScreens.SueloScreen.route){
            SueloScreen(navController)
        }
        composable(route = AppScreens.IncontinenciaScreen.route){
            IncontinenciaScreen(navController)
        }
        composable(route = AppScreens.InfoIncontinenciaScreen.route){
            InfoIncontinenciaScreen()
        }
        composable(route = AppScreens.RectoceleScreen.route){
            RectoceleScreen(navController)
        }
        composable(route = AppScreens.InfoRectoceleScreen.route){
            InfoRectoceleScreen()
        }
        composable(route = AppScreens.ProlapsoScreen.route){
            ProlapsoScreen(navController)
        }
        composable(route = AppScreens.InfoProlapsoScreen.route){
            InfoProlapsoScreen()
        }
    }

}