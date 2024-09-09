package com.example.jobtrek.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jobtrek.data.ShareViewModel
import com.example.jobtrek.ui.theme.screens.accountant.AccountantScreen
import com.example.jobtrek.ui.theme.screens.apply.ApplyScreen

import com.example.jobtrek.ui.theme.screens.analyst.AnalystScreen
import com.example.jobtrek.ui.theme.screens.entrepreneur.EntrepreneurScreen

import com.example.jobtrek.ui.theme.screens.home.HomeScreen
import com.example.jobtrek.ui.theme.screens.hr.HrScreen
import com.example.jobtrek.ui.theme.screens.login.LoginScreen
import com.example.jobtrek.ui.theme.screens.marketing.MarketingScreen
import com.example.jobtrek.ui.theme.screens.other.OthersScreen
import com.example.jobtrek.ui.theme.screens.sales.SalesScreen
import com.example.jobtrek.ui.theme.screens.signup.SignupScreen
import com.example.jobtrek.ui.theme.screens.splash.SplashScreen
import com.example.jobtrek.ui.theme.screens.success.SuccessScreen
import com.example.jobtrek.ui.theme.screens.test.TestScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(navController = navController, modifier = modifier, startDestination = startDestination) {

        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUT_HOME) {
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUT_APPLY) {
            ApplyScreen(navController, shareViewModel = ShareViewModel())
        }

        composable(ROUT_ANALYST) {
            AnalystScreen(navController)
        }

        composable(ROUT_ACCOUNTANT) {
            AccountantScreen(navController)
        }

        composable(ROUT_ENTREPRENEUR) {
            EntrepreneurScreen(navController)
        }

        composable(ROUT_SALES) {
            SalesScreen(navController)
        }

        composable(ROUT_MARKETING) {
            MarketingScreen(navController)
        }

        composable(ROUT_HR) {
            HrScreen(navController)
        }

        composable(ROUT_TEST) {
            TestScreen(navController)
        }

        composable(ROUT_OTHERS) {
            OthersScreen(navController)
        }

        composable(ROUT_SUCCESS) {
            SuccessScreen(navController)
        }



    }

}