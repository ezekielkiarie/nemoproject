package net.ezra.ui.about

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.ui.theme.AppTheme



@Composable
fun AboutScreen(navController: NavHostController) {

            Box {
                Image(
                    painter = painterResource(id = R.drawable.cos13),
                    contentDescription = "about",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxWidth()
                        .fillMaxHeight()

                )


            Column(
                modifier = Modifier
                    .absolutePadding(10.dp)
            ) {
                Row {
                    Text(
                        text = "NEMO COSMETICS",
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Black,
                        fontFamily = FontFamily.SansSerif,

                    )

                    Spacer(modifier = Modifier.width(200.dp))

                    Image(painter = painterResource(id = R.drawable.cos),
                        contentDescription = "Dif")

                }


                Row {
                    Card {
                        Icon(imageVector = Icons.Default.Home,
                            contentDescription = "about")
                    }

                    Spacer(modifier = Modifier.width(150.dp))

                    Card {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "about"
                        )

                    }

                    Spacer(modifier = Modifier.width(150.dp))


                    Card {
                        Icon(imageVector = Icons.Default.MoreVert,
                            contentDescription = "about")

                    }
                }
                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "LOG IN",
                    fontWeight = FontWeight.ExtraBold
               )

                var name by remember{
                    mutableStateOf(TextFieldValue(""))
                }
                OutlinedTextField(value = name,
                    onValueChange = {name = it},
                    label = { Text(text = stringResource(id = R.string.name))},

                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.None,
                        autoCorrect = false,
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    )
                    )

                var email by remember{
                    mutableStateOf(TextFieldValue(""))
                }
                OutlinedTextField(value = email,
                    onValueChange = {email = it},
                    label = { Text(text = stringResource(id = R.string.email))},
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.None,
                        autoCorrect = false,
                        keyboardType = KeyboardType.Text,
                        imeAction = ImeAction.Next
                    )
                )


                var password by remember{
                    mutableStateOf(TextFieldValue(""))
                }
                OutlinedTextField(value = password,
                    onValueChange = {password = it},
                    label = { Text(text = stringResource(id = R.string.password))},

                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.None,
                        autoCorrect = false,
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Next
                    )
                    )

                Spacer(modifier = Modifier.height(5.dp))

                Text(text = "Forgot password?",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier=Modifier
                        .clickable {
                            navController.navigate(ROUTE_ABOUT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            } }
                )


                Spacer(modifier = Modifier.height(20.dp))




                Row {

                    Spacer(modifier = Modifier.width(200.dp))

                    Button(onClick = {
                        navController.navigate(ROUTE_ABOUT) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }},
                        colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                        border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                        shape = RoundedCornerShape(12.dp)

                    ) {

                        Text(text = "Login ", fontWeight = FontWeight.SemiBold, color = Color.White)

                    }
                }

            }
            }








}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

