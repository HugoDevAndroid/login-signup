package com.example.android.loginsignup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.android.loginsignup.ui.ScaffoldLogin
import com.example.android.loginsignup.ui.ScaffoldSignup
import com.example.android.loginsignup.ui.theme.LoginSignupTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginSignupTheme {
                ScreenPack()
            }
        }
    }
}

@Composable
fun ScreenPack(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "LoginScreen",
        modifier = modifier
    ) {
        composable("LoginScreen") {
            ScaffoldLogin(navController = navController)
        }
        composable("SignupScreen") {
            ScaffoldSignup(navController = navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScreen() {
    LoginSignupTheme {

    }
}