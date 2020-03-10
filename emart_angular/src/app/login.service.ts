import { Injectable } from '@angular/core';
import { Seller } from './emart/Seller';
import { Buyer } from './emart/Buyer';


@Injectable({
  providedIn: 'root'
})
export class LoginService {
  loggedIn: boolean;
  buyer: Buyer;
  seller: Seller;
  constructor() { }

  loginBuyer(buyer: Buyer) {
    this.buyer = buyer;
    this.loggedIn = true;
  }

  loginSeller(seller: Seller) {
    this.seller = seller;
    this.loggedIn = true;
  }

  logout() {
    this.loggedIn = false;
    this.buyer = null;
    this.seller = null;
  }



}