package net.ezra.ui.mit

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.ui.theme.AppTheme



@Composable
fun MitScreen(navController: NavHostController) {


    Box {
        Image(painter = painterResource(id = R.drawable.cos13),
            contentDescription = "def image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .fillMaxSize()
            )



    LazyColumn {
        item {
            Row (modifier = Modifier
                .absolutePadding()
            ){

                Spacer(modifier = Modifier.width(150.dp))
                Text(text = "CREATE ACCOUNT", fontWeight = FontWeight.ExtraBold)

            }




            var last by remember{
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(value = last,
                onValueChange = {last = it},
                label = { Text(text = stringResource(id = R.string.name))},

                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.None,
                    autoCorrect = false,
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),)



            var phone by remember{
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(value = phone,
                onValueChange = {phone = it},
                label = { Text(text = stringResource(id = R.string.email))},

                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.None,
                    autoCorrect = false,
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),)


            var number by remember{
                mutableStateOf(TextFieldValue(""))
            }
            OutlinedTextField(value = number,
                onValueChange = {number = it},
                label = { Text(text = "number")},

                keyboardOptions = KeyboardOptions(
                    capitalization = KeyboardCapitalization.None,
                    autoCorrect = false,
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Next
                ),)



            Row {

                Spacer(modifier = Modifier.width(200.dp))

            Button(onClick = {
                navController.navigate(ROUTE_CONTACT) {
                    popUpTo(ROUTE_MIT) { inclusive = true }
                }},
                colors = ButtonDefaults.buttonColors(Color.Black),
//                shape = RectangleShape,
                border = BorderStroke(2.dp, Color.Black),
//                shape = CutCornerShape(10)
                shape = RoundedCornerShape(12.dp)

            ) {

                Text(text = "Create ", fontWeight = FontWeight.SemiBold, color = Color.White)

            }
            }





        }
    }
    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    MitScreen(rememberNavController())
}

