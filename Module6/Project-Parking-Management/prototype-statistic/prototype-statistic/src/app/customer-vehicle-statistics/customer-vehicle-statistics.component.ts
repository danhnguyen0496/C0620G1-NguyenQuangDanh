import { Component, OnInit } from '@angular/core';
import {Chart} from 'chart.js';
@Component({
  selector: 'app-customer-vehicle-statistics',
  templateUrl: './customer-vehicle-statistics.component.html',
  styleUrls: ['./customer-vehicle-statistics.component.css']
})
export class CustomerVehicleStatisticsComponent implements OnInit {
  public LineChart;
  constructor() { }

  ngOnInit() {
    const LineChart = new Chart('canvas', {
      type: 'bar',
      data: {
        labels: [
          'Tiến Quốc',
          'Hồng Nhật',
          'Quốc Khánh',
          'Lương Đin',
          'Minh Quân',
          'Kim Ngân',
          'Mai Vinh',
        ],
        datasets: [{
          label: 'Số lượng xe của khách hàng',
          data: [2, 4, 1, 3, 5, 2, 4],
          backgroundColor: [
            'rgb(119,255,89)',
            'rgb(255, 99, 132)',
            'rgb(110,104,255)',
            'rgb(255, 77, 0)',
            'rgb(255, 165, 0)',
            'rgb(75, 0, 130)',
            'rgb(0, 0, 255)',
          ],
          borderWidth: 1
        }]
      },
      options: {
        title: {
          display: true,
          text: 'Biểu đồ thống kê số lượng xe của khách hàng',
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
