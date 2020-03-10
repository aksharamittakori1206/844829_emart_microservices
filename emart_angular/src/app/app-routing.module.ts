import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemListComponent } from './emart/items/item-list/item-list.component';
import { ItemDisplayComponent } from './emart/items/item-display/item-display.component';
import { CartListComponent } from './emart/cart/cart-list/cart-list.component';
import { BillViewComponent } from './emart/bill/bill-view/bill-view.component';
import { BillListComponent } from './emart/bill/bill-list/bill-list.component';
import { LoginComponent } from './emart/user/login/login.component';
import { LogoutComponent } from './emart/logout/logout.component';
import { BuyerSignupComponent } from './emart/user/buyer-signup/buyer-signup.component';
import { SellerSignupComponent } from './emart/user/seller-signup/seller-signup.component';



const routes: Routes = [ {
                           path: '',
                          component: LoginComponent
                          },
                            {
                              path: 'item-list',
                              component: ItemListComponent
                          },
                          {
                            path: 'item-display/:iId',
                            component: ItemDisplayComponent
                        },
                        {
                            path: 'cart-list',
                            component: CartListComponent
                        },
                        {
                          path: 'bill-view',
                          component: BillViewComponent
                         },
                         {
                          path: 'bill-list',
                          component: BillListComponent
                         },
                         {
                          path: 'buyer-signup',
                          component: BuyerSignupComponent
                         },
                         {
                          path: 'seller-signup',
                          component: SellerSignupComponent
                         },
                        {
                          path: 'logout',
                          component: LogoutComponent
                         }
                        ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
