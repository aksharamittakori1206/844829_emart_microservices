import { Component, OnInit } from '@angular/core';
import { EmartService } from 'src/app/emart.service';
@Component({

  selector: 'app-bill-list',

  templateUrl: './bill-list.component.html',

  styleUrls: ['./bill-list.component.css']

})
export class BillListComponent implements OnInit {
  bills: any;
  currentBuyer: any;
  showBill: boolean;

  constructor(protected emartService: EmartService) { }

  ngOnInit(): void {
    this.currentBuyer = this.emartService.getCurrentBuyer();
    this.bills = this.emartService.getAllBills();
    if (this.bills.length == 0) {
      this.showBill = false;
    }
    else {
      this.showBill = true;
    }

  }
}