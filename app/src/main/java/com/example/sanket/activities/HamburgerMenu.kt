//package com.example.sanket.activities
//
//import android.annotation.SuppressLint
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Info
//import androidx.compose.material.icons.filled.Menu
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material.icons.outlined.Home
//import androidx.compose.material.icons.outlined.Info
//import androidx.compose.material.icons.outlined.Settings
//import androidx.compose.material3.DrawerValue
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.ModalDrawerSheet
//import androidx.compose.material3.ModalNavigationDrawer
//import androidx.compose.material3.NavigationDrawerItem
//import androidx.compose.material3.NavigationDrawerItemDefaults
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.material3.rememberDrawerState
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableIntStateOf
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.unit.dp
//import kotlinx.coroutines.launch
//
//
////data class NavigationItem(
////    val title: String,
////    val selectedIcon: ImageVector,
////    val unselectedIcon: ImageVector,
////    val badgeCount: Int? = null
////)
//
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HamburgerMenu(navController: NavHostController) {
//    val items = listOf(
//        NavigationItem(
//            title = "All",
//            selectedIcon = Icons.Filled.Home,
//            unselectedIcon = Icons.Outlined.Home,
//        ),
//        NavigationItem(
//            title = "Urgent",
//            selectedIcon = Icons.Filled.Info,
//            unselectedIcon = Icons.Outlined.Info,
//            badgeCount = 45
//        ),
//        NavigationItem(
//            title = "Settings",
//            selectedIcon = Icons.Filled.Settings,
//            unselectedIcon = Icons.Outlined.Settings,
//        ),
//    )
//
//    Surface(
//        modifier = Modifier.fillMaxSize(),
//        color = MaterialTheme.colorScheme.background
//    ) {
//        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
//        val scope = rememberCoroutineScope()
//        var selectedItemIndex by rememberSaveable {
//            mutableIntStateOf(0)
//        }
//        ModalNavigationDrawer(
//            drawerContent = {
//                ModalDrawerSheet {
//                    Spacer(modifier = Modifier.height(16.dp))
//                    items.forEachIndexed { index, item ->
//                        NavigationDrawerItem(
//                            label = {
//                                Text(text = item.title)
//                            },
//                            selected = index == selectedItemIndex,
//                            onClick = {
////                                            navController.navigate(item.route)
//                                selectedItemIndex = index
//                                scope.launch {
//                                    drawerState.close()
//                                }
//                            },
//                            icon = {
//                                Icon(
//                                    imageVector = if (index == selectedItemIndex) {
//                                        item.selectedIcon
//                                    } else item.unselectedIcon,
//                                    contentDescription = item.title
//                                )
//                            },
//                            badge = {
//                                item.badgeCount?.let {
//                                    Text(text = item.badgeCount.toString())
//                                }
//                            },
//                            modifier = Modifier
//                                .padding(NavigationDrawerItemDefaults.ItemPadding)
//                        )
//                    }
//                }
//            },
//            drawerState = drawerState
//        ) {
//            Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = {
//                            Text(text = "Sanket")
//                        },
//                        navigationIcon = {
//                            IconButton(onClick = {
//                                scope.launch {
//                                    drawerState.open()
//                                }
//                            }) {
//                                Icon(
//                                    imageVector = Icons.Default.Menu,
//                                    contentDescription = "Menu"
//                                )
//                            }
//                        }
//                    )
//                }
//            )
//            {
//            }
//        }
//    }
//}
//
//@Preview
//@Composable
//fun HamburgerMenuPreview() {
//    val navController = rememberNavController()
//    HamburgerMenu(navController)
//}