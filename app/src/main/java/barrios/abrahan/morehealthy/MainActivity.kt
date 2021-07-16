package valenzuela.carlos.morehealthy

import android.os.Bundle
<<<<<<< HEAD
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_entrenamiento))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
=======
import android.support.v4.widget.DrawerLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import valenzuela.carlos.morehealthy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bottomNav:BottomNavigationView
    lateinit var navController:NavController
    lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
        setContentView(R.layout.activity_main)
        bottomNav = findViewById(R.id.nav_view)


        navController = findNavController(R.id.nav_host_fragment_activity_main)
        setupBottomNavigation()



        drawerLayout = findViewById(R.id.drawer_layout)
        // For Navigation UP
        appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
        NavigationUI.setupActionBarWithNavController(this, navController)

        //NavigationUI.setupWithNavController(navigation_view,navController)
        NavigationUI.setupWithNavController(bottomNav,navController)


    }

    override fun onSupportNavigateUp(): Boolean {
        //return navController.navigateUp()
        return NavigationUI.navigateUp(navController,appBarConfiguration)

    }

    private fun setupBottomNavigation() {
        bottomNav.setupWithNavController(navController)
=======
        setContentView(R.layout.entrenamiento_fragment)
>>>>>>> abrahan
>>>>>>> 1fe4d1c6a05bb06e76bf90cf583256809137fa96
    }
}