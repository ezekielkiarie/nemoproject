package net.ezra.ui.contact


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
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
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
import net.ezra.navigation.ROUTE_MIT
import net.ezra.ui.theme.AppTheme



@Composable
fun ContactScreen(navController: NavHostController) {


    Box{
        Image(
            painter = painterResource(id = R.drawable.cos13),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight()

//
//            modifier = Modifier
//                .size(550.dp, 1000.dp)
        )

        Column (
            modifier = Modifier
                .absolutePadding(10.dp,10.dp,10.dp,10.dp)
        ){
            Row {

                Text(text = "User Name",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black)
            }

            var user by remember{
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(value = user,
                onValueChange = {user = it},
                label = { Text(text = "user name")},

                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.None,
                    autoCorrect = false,
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),)

            Spacer(modifier = Modifier.height(20.dp))


            Text(text = "Choose password",
                fontWeight = FontWeight.Bold,
                color = Color.Black)

            var pass by remember{
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(value = pass,
                onValueChange = {pass = it},
                label = { Text(text = "strong password")},

                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.None,
                    autoCorrect = false,
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Next
                ),)

            Spacer(modifier = Modifier.height(20.dp))


            Text(text = "Confirm password",
                fontWeight = FontWeight.Bold,
                color = Color.Black)

            var confirm by remember{
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(value = confirm,
                onValueChange = {confirm = it},
                label = { Text(text = "confirm pasword")},

                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.None,
                    autoCorrect = false,
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Next
                ),)

            Spacer(modifier = Modifier.height(20.dp))

            Row {

                Spacer(modifier = Modifier.width(100.dp))

                Button(onClick = {
                navController.navigate(ROUTE_EVENING) {
                    popUpTo(ROUTE_CONTACT) { inclusive = true }
                }},
                colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                shape = RoundedCornerShape(12.dp)

            ) {

                Text(text = "Submit ", fontWeight = FontWeight.SemiBold, color = Color.White)

            }
            }

            Spacer(modifier = Modifier.height(5.dp))

            Row {
                Icon(imageVector = Icons.Default.Done,
                    contentDescription = "")


                Text(text = "Create strong password",
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.ExtraBold)
            }






        }

    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ContactScreen(rememberNavController())
}

