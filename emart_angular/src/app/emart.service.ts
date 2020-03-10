import { Injectable } from '@angular/core';
import { Category } from './emart/Category';
import { SubCategory } from './emart/Subcategory';
import { Item } from './emart/Item';
import { Bill } from './emart/Bill';
import { Seller } from './emart/Seller';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class EmartService {
  categories: Category[];
  subCategories: SubCategory[];
  allItems: Item[];
  cartItems: Item[];
  allBills: Bill[];
  allBuyers: any;
  allSellers: Seller[];
  currentBuyer: any;

  constructor(protected Http: HttpClient) {
    this.allBills = [];
    this.cartItems = [];
  }

  /*To display allitems by retriving from database*/
  getAllItems(): any {
    return this.Http.get("http://localhost:8083/BuyerItemService/item/all");

  }
 /* getCategories(): Category[] {
    return [].concat(this.categories);
  }
  getSubCategories(): SubCategory[] {
    return [].concat(this.subCategories);
  }*/
  getItem(itemId: String) {

    return this.Http.get("http://localhost:8083/BuyerItemService/item/" + itemId);
  }

  /*To add an item into cart*/
  addToCart(item: any) {
    this.cartItems.push(item);
  }

  /*To display all items in the cart */
  getAllCart() {

    return [].concat(this.cartItems);
  }
  /*To display list of bills */
  getAllBills(): any {
    return [].concat(this.allBills);
  }

  setBuyerAndBills(currentBuyer) {
    this.currentBuyer = currentBuyer;
    this.allBills = currentBuyer.allBills;
  }

  getCurrentBuyer() {
    return this.currentBuyer;
  }

  /*To delete an item from cart */
  deleteCartItem(itemNo: number) {
    let size = this.cartItems.length;
    for (let i = 0; i < size; i++) {
      if (this.cartItems[i].itemId == itemNo) {
        this.cartItems.splice(i, 1);
        break;
      }
    }
    return [].concat(this.cartItems);
  }

  /*To add bill into bill list */
  addBill(todayDate: Date, total: number) {
    let allBillDetails: any[] = [];
    for (let i = 0; i < this.cartItems.length; i++) {
      allBillDetails.push({
        billDetailsId: 0,
        bill: null,
        item: this.cartItems[i]
      });
    }
    let bill: any = {
      billId: 0,
      billType: 'credit',
      billDate: todayDate,
      billRemarks: 'paid',
      billAmount: total,
      buyer: {
        buyerId: this.currentBuyer.buyerId
      },
      allBillDetails: allBillDetails
    }
    this.allBills.push(bill);
    this.cartItems = [];
    allBillDetails = [];
    return this.Http.post("http://localhost:8083/BuyerItemService/emart/bill", bill);
  }

  /*To get buyer details */
  getBuyer() {
    return this.Http.get("http://localhost:8083/LoginService/emart/buyer/" + this.currentBuyer.buyerId);
  }

  /*To check valid buyer */
  validateBuyer(user: string, password: string) {
    let crendential = user + ':' + password;
    let headers = new HttpHeaders();
    headers = headers.set('Authorization', crendential);
    return this.Http.get("http://localhost:8083/LoginService/emart/validate", { headers });
  }
}

