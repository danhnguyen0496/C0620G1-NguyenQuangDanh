import {Component, OnInit} from '@angular/core';
import {Chart} from 'chart.js';

@Component({
  selector: 'app-customer-registered-statistics',
  templateUrl: './customer-registered-statistics.component.html',
  styleUrls: ['./customer-registered-statistics.component.css']
})
export class CustomerRegisteredStatisticsComponent implements OnInit {
  public LineChart;

  constructor() {
  }

  ngOnInit() {
    const LineChart = new Chart('canvas', {
      type: 'bar',
      data: {
        labels: [
          '10/09/2020',
          '11/09/2020',
          '13/09/2020',
          '14/09/2020',
          '15/09/2020',
          '16/09/2020',
          '17/09/2020',
        ],
        datasets: [{
          label: 'Số lượng khách hàng',
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
          text: 'Biểu đồ thống kê số lượng khách hàng',
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
