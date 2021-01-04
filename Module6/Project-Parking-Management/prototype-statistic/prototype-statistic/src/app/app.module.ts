import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {ChartStatisticDateMonthYearComponent} from './chart-statistic-date-month-year/chart-statistic-date-month-year.component';
import {IntegratedStatisticsComponent} from './integrated-statistics/integrated-statistics.component';
import {AppRoutingModule} from './app-routing.module';
import {MaterialModule} from './material.module';
import {MatSelectModule} from '@angular/material';
import { RevenueStatisticsComponent } from './revenue-statistics/revenue-statistics.component';
import { CustomerVehicleStatisticsComponent } from './customer-vehicle-statistics/customer-vehicle-statistics.component';
import { CustomerRegisteredStatisticsComponent } from './customer-registered-statistics/customer-registered-statistics.component';

@NgModule({
  declarations: [
    AppComponent,
    ChartStatisticDateMonthYearComponent,
    IntegratedStatisticsComponent,
    RevenueStatisticsComponent,
    CustomerVehicleStatisticsComponent,
    CustomerRegisteredStatisticsComponent,
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        MaterialModule,
        MatSelectModule,
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
