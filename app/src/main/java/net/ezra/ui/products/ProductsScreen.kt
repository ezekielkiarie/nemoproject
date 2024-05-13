package net.ezra.ui.products

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.platform.LocalContext
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

@Composable
fun ProductsScreen(navController: NavHostController) {
    Box {
        Image(painter = painterResource(id = R.drawable.cos9),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier=Modifier
                .fillMaxSize()
        )
    LazyColumn {
        item {

            Column(

                modifier = Modifier
                    .absolutePadding(20.dp, 20.dp, 20.dp, 20.dp)
            ) {
                Text(
                    text = "SHOP NOW",
                    fontSize = 50.sp,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Right,
                    fontWeight = FontWeight.ExtraBold
                )
                LazyRow {
                    item {

                        Row {

                            Card {

                                Image(
                                    painter = painterResource(id = R.drawable.cos8),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .padding(5.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier
                                        .padding(5.dp),
                                ) {

                                    val mContext = LocalContext.current
                                    OutlinedButton(onClick = {
                                        val callIntent = Intent(Intent.ACTION_DIAL)
                                        callIntent.data = "tel:0791329528".toUri()
                                        mContext.startActivity(callIntent)
                                    }) {
                                        Text(
                                            text = "Call",
                                            color = Color.Black
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = ""
                                    )
                                }


                                Text(
                                    text = "Available products",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }
                            Spacer(modifier = Modifier.width(20.dp))

                            Card {

                                Image(
                                    painter = painterResource(id = R.drawable.cos2),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .padding(5.dp),
                                    contentScale = ContentScale.Crop
                                )


                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier
                                        .padding(5.dp),
                                ) {

                                    val mContext = LocalContext.current
                                    OutlinedButton(onClick = {
                                        val callIntent = Intent(Intent.ACTION_DIAL)
                                        callIntent.data = "tel:0791329528".toUri()
                                        mContext.startActivity(callIntent)
                                    }) {
                                        Text(
                                            text = "Call",
                                            color = Color.Black
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = ""
                                    )
                                }

                                Text(
                                    text = "Available products",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Card {

                                Image(
                                    painter = painterResource(id = R.drawable.cos5),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .padding(5.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier
                                        .padding(5.dp),
                                ) {

                                    val mContext = LocalContext.current
                                    OutlinedButton(onClick = {
                                        val callIntent = Intent(Intent.ACTION_DIAL)
                                        callIntent.data = "tel:0791329528".toUri()
                                        mContext.startActivity(callIntent)
                                    }) {
                                        Text(
                                            text = "Call",
                                            color = Color.Black
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = ""
                                    )
                                }


                                Text(
                                    text = "Available products",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }

                            Spacer(modifier = Modifier.width(20.dp))


                            Card {

                                Image(
                                    painter = painterResource(id = R.drawable.cos10),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(100.dp)
                                        .padding(5.dp),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.height(10.dp))

                                Row(
                                    modifier = Modifier
                                        .padding(5.dp),
                                ) {

                                    val mContext = LocalContext.current
                                    OutlinedButton(onClick = {
                                        val callIntent = Intent(Intent.ACTION_DIAL)
                                        callIntent.data = "tel:0791329528".toUri()
                                        mContext.startActivity(callIntent)
                                    }) {
                                        Text(
                                            text = "Call",
                                            color = Color.Black
                                        )
                                    }
                                    Icon(
                                        imageVector = Icons.Default.ShoppingCart,
                                        contentDescription = ""
                                    )
                                }


                                Text(
                                    text = "Available products",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(5.dp)
                                )

                            }


                        }
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Buy now at affordable and fair prices for high quality and recommendable prices ",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 20.sp,
                )

                Spacer(modifier = Modifier.height(10.dp))
            LazyRow {
                item {

                    Row {

                        Card {

                            Image(
                                painter = painterResource(id = R.drawable.cos6),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(100.dp)
                                    .padding(5.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Row(
                                modifier = Modifier
                                    .padding(5.dp),
                            ) {

                                val mContext = LocalContext.current
                                OutlinedButton(onClick = {
                                    val callIntent = Intent(Intent.ACTION_DIAL)
                                    callIntent.data = "tel:0791329528".toUri()
                                    mContext.startActivity(callIntent)
                                }) {
                                    Text(
                                        text = "Call",
                                        color = Color.Black
                                    )
                                }
                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = ""
                                )
                            }


                            Text(
                                text = "Available products",
                                color = Color.Black,
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(5.dp)
                            )

                        }
                        Spacer(modifier = Modifier.width(20.dp))

                        Card {

                            Image(
                                painter = painterResource(id = R.drawable.cos7),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(100.dp)
                                    .padding(5.dp),
                                contentScale = ContentScale.Crop
                            )


                            Spacer(modifier = Modifier.height(10.dp))

                            Row(
                                modifier = Modifier
                                    .padding(5.dp),
                            ) {

                                val mContext = LocalContext.current
                                OutlinedButton(onClick = {
                                    val callIntent = Intent(Intent.ACTION_DIAL)
                                    callIntent.data = "tel:0791329528".toUri()
                                    mContext.startActivity(callIntent)
                                }) {
                                    Text(
                                        text = "Call",
                                        color = Color.Black
                                    )
                                }
                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = ""
                                )
                            }

                            Text(
                                text = "Available products",
                                color = Color.Black,
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(5.dp)
                            )

                        }

                        Spacer(modifier = Modifier.width(20.dp))


                        Card {

                            Image(
                                painter = painterResource(id = R.drawable.cos1),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(100.dp)
                                    .padding(5.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Row(
                                modifier = Modifier
                                    .padding(5.dp),
                            ) {

                                val mContext = LocalContext.current
                                OutlinedButton(onClick = {
                                    val callIntent = Intent(Intent.ACTION_DIAL)
                                    callIntent.data = "tel:0791329528".toUri()
                                    mContext.startActivity(callIntent)
                                }) {
                                    Text(
                                        text = "Call",
                                        color = Color.Black
                                    )
                                }
                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = ""
                                )
                            }


                            Text(
                                text = "Available products",
                                color = Color.Black,
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(5.dp)
                            )

                        }

                        Spacer(modifier = Modifier.width(20.dp))


                        Card {

                            Image(
                                painter = painterResource(id = R.drawable.cos9),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(100.dp)
                                    .padding(5.dp),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Row(
                                modifier = Modifier
                                    .padding(5.dp),
                            ) {

                                val mContext = LocalContext.current
                                OutlinedButton(onClick = {
                                    val callIntent = Intent(Intent.ACTION_DIAL)
                                    callIntent.data = "tel:0791329528".toUri()
                                    mContext.startActivity(callIntent)
                                }) {
                                    Text(
                                        text = "Call",
                                        color = Color.Black
                                    )
                                }
                                Icon(
                                    imageVector = Icons.Default.ShoppingCart,
                                    contentDescription = ""
                                )
                            }


                            Text(
                                text = "Available products",
                                color = Color.Black,
                                fontSize = 15.sp,
                                fontFamily = FontFamily.Serif,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(5.dp)
                            )

                        }


                    }
                }
            }
        }

        }
    }
}

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}

