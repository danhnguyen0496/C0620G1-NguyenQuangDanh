import {Component, OnInit} from '@angular/core';
import {Chart} from 'chart.js';

@Component({
  selector: 'app-integrated-statistics',
  templateUrl: './integrated-statistics.component.html',
  styleUrls: ['./integrated-statistics.component.css']
})
export class IntegratedStatisticsComponent implements OnInit {
  public DoughnutChart;

  constructor() {
  }

  ngOnInit() {
    const DoughnutChart = new Chart('canvas', {
      type: 'doughnut',
      data: {
        labels: [
          'Honda',
          'Toyota',
          'Mercedes',
          'Ford',
          'Nissan',
          'Vinfast',
        ],
        datasets: [{
          label: 'Đơn vị (xe)',
          data: [25, 20, 26, 14, 14, 16],
          backgroundColor: [
            'rgb(255, 99, 132)',
            'rgb(84, 255, 159)',
            'rgb(255, 77, 0)',
            'rgb(255, 165, 0)',
            'rgb(75, 0, 130)',
            'rgb(0, 0, 255)',
          ],
          hoverOffset: 4,
          responsive: true
        }]
      },
      options: {
        legend: {
          position: 'left'
        },
        layout: {
          padding: {
            left: 80,
            right: 0,
            top: 0,
            bottom: 0
          }
        }
      }
    });
  }
}
