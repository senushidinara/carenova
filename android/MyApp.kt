package com.example.virtualhealthcare

import android.app.Application
import com.revenuecat.purchases.Purchases
import com.revenuecat.purchases.PurchasesConfiguration

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        // Configure RevenueCat Purchases SDK with your API key and optional appUserID
        Purchases.configure(
            PurchasesConfiguration.Builder(this, "goog_yyfrHPHvCrEoAibujDVyobSsbrP")
                .appUserID("appb4fef4ab7f")
                .build()
        )
    }
}
