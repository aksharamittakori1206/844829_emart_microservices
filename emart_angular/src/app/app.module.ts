import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms'

import { CartListComponent } from './emart/cart/cart-list/cart-list.component';
import { BillViewComponent } from './emart/bill/bill-view/bill-view.component';
import { BillListComponent } from './emart/bill/bill-list/bill-list.component';
import { ItemListComponent } from './emart/items/item-list/item-list.component';
import { ItemDisplayComponent } from './emart/items/item-display/item-display.component';
import { LoginComponent } from './emart/user/login/login.component';
import { BuyerSignupComponent } from './emart/user/buyer-signup/buyer-signup.component';
import { SellerSignupComponent } from './emart/user/seller-signup/seller-signup.component';
import { HeaderComponent } from './emart/header/header.component';
import { LogoutComponent } from './emart/logout/logout.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ItemListComponent,
    ItemDisplayComponent,
    CartListComponent,
    BillViewComponent,
    BillListComponent,
    LoginComponent,
    BuyerSignupComponent,
    SellerSignupComponent,
    HeaderComponent,
    LogoutComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
