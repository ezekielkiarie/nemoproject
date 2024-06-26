////package net.ezra.ui.auth//package net.ezra.ui.auth
////
////
////
////import android.widget.Button
////import androidx.activity.compose.BackHandler
////import androidx.compose.foundation.clickable
////import androidx.compose.foundation.layout.*
////import androidx.compose.material.*
////import androidx.compose.material3.ButtonDefaults
////import androidx.compose.material3.MaterialTheme
////import androidx.compose.material3.OutlinedTextField
////import androidx.compose.material3.Text
////import androidx.compose.runtime.*
////import androidx.compose.ui.Alignment
////import androidx.compose.ui.Modifier
////import androidx.compose.ui.graphics.Color
////import androidx.compose.ui.text.input.PasswordVisualTransformation
////import androidx.compose.ui.text.style.TextAlign
////import androidx.compose.ui.unit.dp
////import androidx.navigation.NavController
////import net.ezra.navigation.ROUTE_LOGIN
////import net.ezra.navigation.ROUTE_SIGNUP
////
////import com.google.firebase.auth.FirebaseAuth
//////import net.ezra.navigation.ROUTE_LOGIN
//////import net.ezra.navigation.ROUTE_SIGNUP
////
////@Composable
////fun LoginScreen(navController: NavController, onLoginSuccess: () -> Unit) {
////    var email by remember { mutableStateOf("") }
////    var password by remember { mutableStateOf("") }
////    var error by remember { mutableStateOf<String?>(null) }
////    var isLoading by remember { mutableStateOf(false) }
////
////    BackHandler {
////        navController.popBackStack()
////
////    }
////
////    Column(
////        modifier = Modifier
////            .fillMaxSize()
////            .padding(16.dp),
////        horizontalAlignment = Alignment.CenterHorizontally,
////        verticalArrangement = Arrangement.Center
////    ) {
////
////        AuthHeader()
////        Text("Login")
////        Spacer(modifier = Modifier.height(16.dp))
////
////        OutlinedTextField(
////            value = email,
////            onValueChange = { email = it },
////            label = { Text("Email") },
////            modifier = Modifier.fillMaxWidth()
////        )
////        Spacer(modifier = Modifier.height(8.dp))
////
////        OutlinedTextField(
////            value = password,
////            onValueChange = { password = it },
////            label = { Text("Password") },
////            visualTransformation = PasswordVisualTransformation(),
////            modifier = Modifier.fillMaxWidth()
////        )
////        Spacer(modifier = Modifier.height(16.dp))
////
////        if (isLoading) {
////            CircularProgressIndicator(modifier = Modifier.size(48.dp))
////        } else {
////
////
////
////            Button(
////                colors = ButtonDefaults.buttonColors(Color(0xff0FB06A)),
////                onClick = {
////                    if (email.isBlank() || password.isBlank()) {
////                        error = "Please fill in all fields"
////                    } else {
////                        isLoading = true
////                        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
////                            .addOnCompleteListener { task ->
////                                isLoading = false
////                                if (task.isSuccessful) {
////                                    navController.navigate(ROUTE_SIGNUP)
////                                } else {
////                                    error = task.exception?.message ?: "Login failed"
////                                }
////                            }
////                    }
////                },
////                modifier = Modifier.fillMaxWidth()
////            ) {
////                Text(text = "Login")
////            }
////
////            androidx.compose.material3.Text(
////                modifier = Modifier
////
////                    .clickable {
////                        navController.navigate(ROUTE_SIGNUP) {
////                            popUpTo(ROUTE_LOGIN) { inclusive = true }
////                        }
////                    },
////                text = "go to register",
////                textAlign = TextAlign.Center,
////                color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
////            )
////
////
////
////        }
////
////        error?.let {
////            Text(
////                text = it,
////                color = MaterialTheme.colors.error,
////                modifier = Modifier.padding(top = 8.dp)
////            )
////        }
////    }
////}
//
package net.ezra.ui.auth

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import net.ezra.R
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_SIGNUP


@Composable
fun SignUpScreen(navController: NavController, onSignUpSuccess: () -> Unit) {


    Box {

        Image(painter = painterResource(id = R.drawable.cos13),
            contentDescription ="" )
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }
    var isLoading by remember { mutableStateOf(false) }
    val context = LocalContext.current




    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("Sign Up")
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))


        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = { Text("Confirm Password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        if (isLoading) {
            CircularProgressIndicator(modifier = Modifier.size(48.dp))
        } else {
            Button(
                colors = ButtonDefaults.buttonColors(Color(0xff0FB06A)),
                onClick = {
                    if (email.isBlank()) {
                        error = "Email is required"
                    } else if (password.isBlank()) {
                        error = "Password is required"
                    } else if (confirmPassword.isBlank()) {
                        error = "Password Confirmation required"
                    } else if (password != confirmPassword) {
                        error = "Passwords do not match"
                    } else {
                        isLoading = true
                        signUp(email, password, {
                            isLoading = false
                            Toast.makeText(context, "Sign-up successful!", Toast.LENGTH_SHORT)
                                .show()
                            onSignUpSuccess()
                        }) { errorMessage ->
                            isLoading = false
                            error = errorMessage
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Sign Up")
            }


            androidx.compose.material3.Text(
                modifier = Modifier

                    .clickable {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_SIGNUP) { inclusive = true }
                        }
                    },
                text = "go to login",
                textAlign = TextAlign.Center,
                color = androidx.compose.material3.MaterialTheme.colorScheme.onSurface
            )

        }

        error?.let {
            Text(
                text = it,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
}
private fun signUp(email: String, password: String, onSuccess: () -> Unit, onError: (String) -> Unit) {
    FirebaseAuth.getInstance().fetchSignInMethodsForEmail(email)
        .addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val signInMethods = task.result?.signInMethods ?: emptyList()
                if (signInMethods.isNotEmpty()) {
                    onError("Email is already registered")
                } else {
                    // Email is not registered, proceed with sign-up
                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener { signUpTask ->
                            if (signUpTask.isSuccessful) {
                                onSuccess()
                            } else {
                                onError(signUpTask.exception?.message ?: "Sign-up failed")
                            }
                        }
                }
            } else {
                onError(task.exception?.message ?: "Failed to check email availability")
            }
        }
}


