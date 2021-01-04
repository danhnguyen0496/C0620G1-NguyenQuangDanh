import {Component, OnInit} from '@angular/core';
import {Chart} from 'chart.js';

@Component({
  selector: 'app-revenue-statistics',
  templateUrl: './revenue-statistics.component.html',
  styleUrls: ['./revenue-statistics.component.css']
})
export class RevenueStatisticsComponent implements OnInit {
  public LineChart;

  constructor() {
  }

  ngOnInit() {
    const LineChart = new Chart('canvas', {
      type: 'bar',
      data: {
        labels: [
          '01/10/2020',
          '02/10/2020',
          '03/10/2020',
          '04/10/2020',
          '05/10/2020',
          '06/10/2020',
          '07/10/2020',
        ],
        datasets: [{
          label: 'Doanh thu',
          data: [27, 24, 29, 28, 26, 20, 25],
          backgroundColor: [
            'rgb(0, 0, 255)',
            'rgb(255, 77, 0)',
            'rgb(119,255,89)',
            'rgb(75, 0, 130)',
            'rgb(255, 165, 0)',
            'rgb(110,104,255)',
            'rgb(180,60,166)',
          ],
          borderWidth: 1
        }]
      },
      options: {
        title: {
          display: true,
          text: 'Biểu đồ thống kê doanh thu',
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
