import {Component, OnInit} from '@angular/core';
import {Chart} from 'chart.js';

@Component({
  selector: 'app-chart-statistic-date-month-year',
  templateUrl: './chart-statistic-date-month-year.component.html',
  styleUrls: ['./chart-statistic-date-month-year.component.css']
})
export class ChartStatisticDateMonthYearComponent implements OnInit {
  public LineChart;

  constructor() {
  }

  ngOnInit() {
    const LineChart = new Chart('canvas', {
      type: 'bar',
      data: {
        labels: [
          '2015',
          '2016',
          '2017',
          '2018',
          '2019',
          '2020',
          '2021',
        ],
        datasets: [{
          label: 'Vé xe',
          data: [27, 24, 29, 28, 26, 20, 25],
          backgroundColor: [
            'rgb(0, 0, 255)',
            'rgb(119,255,89)',
            'rgb(255, 99, 132)',
            'rgb(255, 165, 0)',
            'rgb(255, 77, 0)',
            'rgb(75, 0, 130)',
            'rgb(110,104,255)',
          ],
          borderWidth: 1
        }]
      },
      options: {
        title: {
          display: true,
          text: 'Biểu đồ thống kê vé xe',
          position: 'bottom'
        },
        responsive: true,
        scales: {
          yAxes: [{
            ticks: {
              beginAtZero: true
            }
          }]
        }
      },
    });
  }
}
