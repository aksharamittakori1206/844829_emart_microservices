import { Component, OnInit } from '@angular/core';
import { EmartService } from 'src/app/emart.service';
import { Router } from '@angular/router';
import { Bill } from '../../Bill';
import { BillDetails } from '../../Billdetails';

@Component({
  selector: 'app-bill-view',
  templateUrl: './bill-view.component.html',
  styleUrls: ['./bill-view.component.css']
})
export class BillViewComponent implements OnInit {
  cartItems: any;
  bill: Bill[];
  /*buyerName: string = 'sneha';
  buyerId: string = '901';*/
  todayDate: Date = new Date();
  amount: number = 0;
  currentBuyer: any;
  allBillDetails: BillDetails[];

  constructor(protected emartService: EmartService, protected router: Router) { }

  ngOnInit(): void {
    this.currentBuyer = this.emartService.getCurrentBuyer();
    this.cartItems = this.emartService.getAllCart();
    let size = this.cartItems.length;
    for (let i = 0; i < size; i++) {
      this.amount = this.amount + this.cartItems[i].itemPrice;
    }
  }

  addBill() {
    this.emartService.addBill(this.todayDate, this.amount).subscribe(
      (res) => {
        this.emartService.getBuyer()
          .subscribe((response) => {
            this.currentBuyer = response;
            this.emartService.setBuyerAndBills(this.currentBuyer);
          })
      }
    );
    this.router.navigate(['item-list']);
  }
}