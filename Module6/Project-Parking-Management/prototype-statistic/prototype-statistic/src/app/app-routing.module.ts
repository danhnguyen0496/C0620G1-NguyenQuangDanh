import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ChartStatisticDateMonthYearComponent} from './chart-statistic-date-month-year/chart-statistic-date-month-year.component';
import {IntegratedStatisticsComponent} from './integrated-statistics/integrated-statistics.component';
import {RevenueStatisticsComponent} from './revenue-statistics/revenue-statistics.component';
import {CustomerVehicleStatisticsComponent} from './customer-vehicle-statistics/customer-vehicle-statistics.component';
import {CustomerRegisteredStatisticsComponent} from './customer-registered-statistics/customer-registered-statistics.component';


const routes: Routes = [
  {path: '', component: IntegratedStatisticsComponent},
  {path: 'chart-statistic-date-month-year', component: ChartStatisticDateMonthYearComponent},
  {path: 'chart-statistic-revenue', component: RevenueStatisticsComponent},
  {path: 'customer-vehicle-statistics', component: CustomerVehicleStatisticsComponent},
  {path: 'customer-registered-statistics', component: CustomerRegisteredStatisticsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule {
}
