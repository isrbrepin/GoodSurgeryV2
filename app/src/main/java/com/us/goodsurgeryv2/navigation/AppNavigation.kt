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
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.postoperatorio.AltaEstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.postoperatorio.OstomiaEstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.postoperatorio.PostEstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.preoperatorio.AnestesiaEstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.preoperatorio.HospitalEstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.preoperatorio.IngresoEstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.preoperatorio.PreoEstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.estoma.preoperatorio.PrepEstomaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.InfoReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.ReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.postoperatorio.AltaReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.postoperatorio.OstomiaReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.postoperatorio.PostReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.preoperatorio.AnestesiaReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.preoperatorio.HospitalReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.preoperatorio.IngresoReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.preoperatorio.PreoReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.inflamatoria.reseccion.preoperatorio.PrepReseccionScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.ColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.InfoColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.postoperatorio.AltaColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.postoperatorio.OstomiaColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.postoperatorio.PostColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.preoperatorio.AnestesiaColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.preoperatorio.HospitalColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.preoperatorio.IngresoColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.preoperatorio.PreoColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.colon.preoperatorio.PrepColonScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.InfoRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.RectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.postoperatorio.AltaRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.postoperatorio.OstomiaRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.postoperatorio.PostRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.preoperatorio.AnestesiaRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.preoperatorio.HospitalRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.preoperatorio.IngresoRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.preoperatorio.PreoRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.polipos.recto.preoperatorio.PrepRectoScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.ColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.InfoColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.postoperatorio.AltaColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.postoperatorio.OstomiaColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.postoperatorio.PostColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.preoperatorio.AnestesiaColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.preoperatorio.HospitalColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.preoperatorio.IngresoColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.preoperatorio.PreoColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.colostomia.preoperatorio.PrepColostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.IleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.InfoIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.postoperatorio.AltaIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.postoperatorio.OstomiaIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.postoperatorio.PostIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.preoperatorio.AnestesiaIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.preoperatorio.HospitalIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.preoperatorio.IngresoIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.preoperatorio.PreoIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.cirugiaabdominal.reconstruccion.ileostomia.preoperatorio.PrepIleostomiaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.ProctologiaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.FistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.InfoFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.postoperatorio.AltaFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.postoperatorio.OstomiaFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.postoperatorio.PostFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.preoperatorio.AnestesiaFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.preoperatorio.HospitalFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.preoperatorio.IngresoFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.preoperatorio.PreoFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fistula.preoperatorio.PrepFistulaScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.FisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.InfoFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.postoperatorio.AltaFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.postoperatorio.OstomiaFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.postoperatorio.PostFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.preoperatorio.AnestesiaFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.preoperatorio.HospitalFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.preoperatorio.IngresoFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.preoperatorio.PreoFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.fisura.preoperatorio.PrepFisuraScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.HemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.InfoHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.postoperatorio.AltaHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.postoperatorio.OstomiaHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.postoperatorio.PostHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.preoperatorio.AnestesiaHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.preoperatorio.HospitalHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.preoperatorio.IngresoHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.preoperatorio.PreoHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.proctologia.hemorroides.preoperatorio.PrepHemorroidesScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.SueloScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.IncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.InfoIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.postoperatorio.AltaIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.postoperatorio.OstomiaIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.postoperatorio.PostIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.preoperatorio.AnestesiaIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.preoperatorio.HospitalIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.preoperatorio.IngresoIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.preoperatorio.PreoIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.incontinencia.preoperatorio.PrepIncontinenciaScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.InfoProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.ProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.postoperatorio.AltaProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.postoperatorio.OstomiaProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.postoperatorio.PostProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.preoperatorio.AnestesiaProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.preoperatorio.HospitalProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.preoperatorio.IngresoProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.preoperatorio.PreoProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.prolapso.preoperatorio.PrepProlapsoScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.InfoRectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.RectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.postoperatorio.AltaRectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.postoperatorio.OstomiaRectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.postoperatorio.PostRectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.preoperatorio.AnestesiaRectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.preoperatorio.HospitalRectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.preoperatorio.IngresoRectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.preoperatorio.PreoRectoceleScreen
import com.us.goodsurgeryv2.screens.patologias.suelopelvico.rectocele.preoperatorio.PrepRectoceleScreen

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
        composable(route = AppScreens.PreoRectoScreen.route){
            PreoRectoScreen(navController)
        }
        composable(route = AppScreens.AnestesiaRectoScreen.route){
            AnestesiaRectoScreen()
        }
        composable(route = AppScreens.HospitalRectoScreen.route){
            HospitalRectoScreen()
        }
        composable(route = AppScreens.IngresoRectoScreen.route){
            IngresoRectoScreen()
        }
        composable(route = AppScreens.PrepRectoScreen.route){
            PrepRectoScreen()
        }
        composable(route = AppScreens.PostRectoScreen.route){
            PostRectoScreen(navController)
        }
        composable(route = AppScreens.AltaRectoScreen.route){
            AltaRectoScreen()
        }
        composable(route = AppScreens.OstomiaRectoScreen.route){
            OstomiaRectoScreen()
        }
        composable(route = AppScreens.ColonScreen.route){
            ColonScreen(navController)
        }
        composable(route = AppScreens.InfoColonScreen.route){
            InfoColonScreen()
        }
        composable(route = AppScreens.PreoColonScreen.route){
            PreoColonScreen(navController)
        }
        composable(route = AppScreens.AnestesiaColonScreen.route){
            AnestesiaColonScreen()
        }
        composable(route = AppScreens.HospitalColonScreen.route){
            HospitalColonScreen()
        }
        composable(route = AppScreens.IngresoColonScreen.route){
            IngresoColonScreen()
        }
        composable(route = AppScreens.PrepColonScreen.route){
            PrepColonScreen()
        }
        composable(route = AppScreens.PostColonScreen.route){
            PostColonScreen(navController)
        }
        composable(route = AppScreens.AltaColonScreen.route){
            AltaColonScreen()
        }
        composable(route = AppScreens.OstomiaColonScreen.route){
            OstomiaColonScreen()
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
        composable(route = AppScreens.PreoIleostomiaScreen.route){
            PreoIleostomiaScreen(navController)
        }
        composable(route = AppScreens.AnestesiaIleostomiaScreen.route){
            AnestesiaIleostomiaScreen()
        }
        composable(route = AppScreens.HospitalIleostomiaScreen.route){
            HospitalIleostomiaScreen()
        }
        composable(route = AppScreens.IngresoIleostomiaScreen.route){
            IngresoIleostomiaScreen()
        }
        composable(route = AppScreens.PrepIleostomiaScreen.route){
            PrepIleostomiaScreen()
        }
        composable(route = AppScreens.PostIleostomiaScreen.route){
            PostIleostomiaScreen(navController)
        }
        composable(route = AppScreens.AltaIleostomiaScreen.route){
            AltaIleostomiaScreen()
        }
        composable(route = AppScreens.OstomiaIleostomiaScreen.route){
            OstomiaIleostomiaScreen()
        }
        composable(route = AppScreens.ColostomiaScreen.route){
            ColostomiaScreen(navController)
        }
        composable(route = AppScreens.InfoColostomiaScreen.route){
            InfoColostomiaScreen()
        }
        composable(route = AppScreens.PreoColostomiaScreen.route){
            PreoColostomiaScreen(navController)
        }
        composable(route = AppScreens.AnestesiaColostomiaScreen.route){
            AnestesiaColostomiaScreen()
        }
        composable(route = AppScreens.HospitalColostomiaScreen.route){
            HospitalColostomiaScreen()
        }
        composable(route = AppScreens.IngresoColostomiaScreen.route){
            IngresoColostomiaScreen()
        }
        composable(route = AppScreens.PrepColostomiaScreen.route){
            PrepColostomiaScreen()
        }
        composable(route = AppScreens.PostColostomiaScreen.route){
            PostColostomiaScreen(navController)
        }
        composable(route = AppScreens.AltaColostomiaScreen.route){
            AltaColostomiaScreen()
        }
        composable(route = AppScreens.OstomiaColostomiaScreen.route){
            OstomiaColostomiaScreen()
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
        composable(route = AppScreens.PreoReseccionScreen.route){
            PreoReseccionScreen(navController)
        }
        composable(route = AppScreens.AnestesiaReseccionScreen.route){
            AnestesiaReseccionScreen()
        }
        composable(route = AppScreens.HospitalReseccionScreen.route){
            HospitalReseccionScreen()
        }
        composable(route = AppScreens.IngresoReseccionScreen.route){
            IngresoReseccionScreen()
        }
        composable(route = AppScreens.PrepReseccionScreen.route){
            PrepReseccionScreen()
        }
        composable(route = AppScreens.PostReseccionScreen.route){
            PostReseccionScreen(navController)
        }
        composable(route = AppScreens.AltaReseccionScreen.route){
            AltaReseccionScreen()
        }
        composable(route = AppScreens.OstomiaReseccionScreen.route){
            OstomiaReseccionScreen()
        }
        composable(route = AppScreens.EstomaScreen.route){
            EstomaScreen(navController)
        }
        composable(route = AppScreens.InfoEstomaScreen.route){
            InfoEstomaScreen()
        }
        composable(route = AppScreens.PreoEstomaScreen.route){
            PreoEstomaScreen(navController)
        }
        composable(route = AppScreens.AnestesiaEstomaScreen.route){
            AnestesiaEstomaScreen()
        }
        composable(route = AppScreens.PrepEstomaScreen.route){
            PrepEstomaScreen()
        }
        composable(route = AppScreens.IngresoEstomaScreen.route){
            IngresoEstomaScreen()
        }
        composable(route = AppScreens.HospitalEstomaScreen.route){
            HospitalEstomaScreen()
        }
        composable(route = AppScreens.PostEstomaScreen.route){
            PostEstomaScreen(navController)
        }
        composable(route = AppScreens.AltaEstomaScreen.route){
            AltaEstomaScreen()
        }
        composable(route = AppScreens.OstomiaEstomaScreen.route){
            OstomiaEstomaScreen()
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
        composable(route = AppScreens.PreoHemorroidesScreen.route){
            PreoHemorroidesScreen(navController)
        }
        composable(route = AppScreens.AnestesiaHemorroidesScreen.route){
            AnestesiaHemorroidesScreen()
        }
        composable(route = AppScreens.HospitalHemorroidesScreen.route){
            HospitalHemorroidesScreen()
        }
        composable(route = AppScreens.IngresoHemorroidesScreen.route){
            IngresoHemorroidesScreen()
        }
        composable(route = AppScreens.PrepHemorroidesScreen.route){
            PrepHemorroidesScreen()
        }
        composable(route = AppScreens.PostHemorroidesScreen.route){
            PostHemorroidesScreen(navController)
        }
        composable(route = AppScreens.AltaHemorroidesScreen.route){
            AltaHemorroidesScreen()
        }
        composable(route = AppScreens.OstomiaHemorroidesScreen.route){
            OstomiaHemorroidesScreen()
        }
        composable(route = AppScreens.FisuraScreen.route){
            FisuraScreen(navController)
        }
        composable(route = AppScreens.InfoFisuraScreen.route){
            InfoFisuraScreen()
        }
        composable(route = AppScreens.PreoFisuraScreen.route){
            PreoFisuraScreen(navController)
        }
        composable(route = AppScreens.AnestesiaFisuraScreen.route){
            AnestesiaFisuraScreen()
        }
        composable(route = AppScreens.HospitalFisuraScreen.route){
            HospitalFisuraScreen()
        }
        composable(route = AppScreens.IngresoFisuraScreen.route){
            IngresoFisuraScreen()
        }
        composable(route = AppScreens.PrepFisuraScreen.route){
            PrepFisuraScreen()
        }
        composable(route = AppScreens.PostFisuraScreen.route){
            PostFisuraScreen(navController)
        }
        composable(route = AppScreens.AltaFisuraScreen.route){
            AltaFisuraScreen()
        }
        composable(route = AppScreens.OstomiaFisuraScreen.route){
            OstomiaFisuraScreen()
        }
        composable(route = AppScreens.FistulaScreen.route){
            FistulaScreen(navController)
        }
        composable(route = AppScreens.InfoFistulaScreen.route){
            InfoFistulaScreen()
        }
        composable(route = AppScreens.PreoFistulaScreen.route){
            PreoFistulaScreen(navController)
        }
        composable(route = AppScreens.AnestesiaFistulaScreen.route){
            AnestesiaFistulaScreen()
        }
        composable(route = AppScreens.HospitalFistulaScreen.route){
            HospitalFistulaScreen()
        }
        composable(route = AppScreens.IngresoFistulaScreen.route){
            IngresoFistulaScreen()
        }
        composable(route = AppScreens.PrepFistulaScreen.route){
            PrepFistulaScreen()
        }
        composable(route = AppScreens.PostFistulaScreen.route){
            PostFistulaScreen(navController)
        }
        composable(route = AppScreens.AltaFistulaScreen.route){
            AltaFistulaScreen()
        }
        composable(route = AppScreens.OstomiaFistulaScreen.route){
            OstomiaFistulaScreen()
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
        composable(route = AppScreens.PreoIncontinenciaScreen.route){
            PreoIncontinenciaScreen(navController)
        }
        composable(route = AppScreens.AnestesiaIncontinenciaScreen.route){
            AnestesiaIncontinenciaScreen()
        }
        composable(route = AppScreens.HospitalIncontinenciaScreen.route){
            HospitalIncontinenciaScreen()
        }
        composable(route = AppScreens.IngresoIncontinenciaScreen.route){
            IngresoIncontinenciaScreen()
        }
        composable(route = AppScreens.PostIncontinenciaScreen.route){
            PostIncontinenciaScreen(navController)
        }
        composable(route = AppScreens.AltaIncontinenciaScreen.route){
            AltaIncontinenciaScreen()
        }
        composable(route = AppScreens.OstomiaIncontinenciaScreen.route){
            OstomiaIncontinenciaScreen()
        }
        composable(route = AppScreens.PrepIncontinenciaScreen.route){
            PrepIncontinenciaScreen()
        }
        composable(route = AppScreens.RectoceleScreen.route){
            RectoceleScreen(navController)
        }
        composable(route = AppScreens.InfoRectoceleScreen.route){
            InfoRectoceleScreen()
        }
        composable(route = AppScreens.PreoRectoceleScreen.route){
            PreoRectoceleScreen(navController)
        }
        composable(route = AppScreens.AnestesiaRectoceleScreen.route){
            AnestesiaRectoceleScreen()
        }
        composable(route = AppScreens.HospitalRectoceleScreen.route){
            HospitalRectoceleScreen()
        }
        composable(route = AppScreens.IngresoRectoceleScreen.route){
            IngresoRectoceleScreen()
        }
        composable(route = AppScreens.PrepRectoceleScreen.route){
            PrepRectoceleScreen()
        }
        composable(route = AppScreens.PostRectoceleScreen.route){
            PostRectoceleScreen(navController)
        }
        composable(route = AppScreens.AltaRectoceleScreen.route){
            AltaRectoceleScreen()
        }
        composable(route = AppScreens.OstomiaRectoceleScreen.route){
            OstomiaRectoceleScreen()
        }
        composable(route = AppScreens.ProlapsoScreen.route){
            ProlapsoScreen(navController)
        }
        composable(route = AppScreens.InfoProlapsoScreen.route){
            InfoProlapsoScreen()
        }
        composable(route = AppScreens.PreoProlapsoScreen.route){
            PreoProlapsoScreen(navController)
        }
        composable(route = AppScreens.AnestesiaProlapsoScreen.route){
            AnestesiaProlapsoScreen()
        }
        composable(route = AppScreens.HospitalProlapsoScreen.route){
            HospitalProlapsoScreen()
        }
        composable(route = AppScreens.IngresoProlapsoScreen.route){
            IngresoProlapsoScreen()
        }
        composable(route = AppScreens.PrepProlapsoScreen.route){
            PrepProlapsoScreen()
        }
        composable(route = AppScreens.PostProlapsoScreen.route){
            PostProlapsoScreen(navController)
        }
        composable(route = AppScreens.AltaProlapsoScreen.route){
            AltaProlapsoScreen()
        }
        composable(route = AppScreens.OstomiaProlapsoScreen.route){
            OstomiaProlapsoScreen()
        }
    }

}