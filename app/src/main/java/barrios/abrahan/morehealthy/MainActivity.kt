package valenzuela.carlos.morehealthy

import android.os.Bundle
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
    }
}