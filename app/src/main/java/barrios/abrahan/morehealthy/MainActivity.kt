package barrios.abrahan.morehealthy

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
import barrios.abrahan.morehealthy.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration2: AppBarConfiguration
    lateinit var bottomNav:BottomNavigationView
    lateinit var navController:NavController
    lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //setSupportActionBar(binding.appBarMain.toolbar)

        //val drawerLayout: androidx.drawerlayout.widget.DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navLeftView
        //val navController = findNavController(R.id.nav_host_fragment_content_main)

        appBarConfiguration2 = AppBarConfiguration(
            setOf(
                R.id.nav_refactor, R.id.nav_imc, R.id.nav_notifications, R.id.nav_settings
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration2)
        navView.setupWithNavController(navController)

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

        setContentView(R.layout.entrenamiento_fragment)

    }
}