import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-buyer-signup',
  templateUrl: './buyer-signup.component.html',
  styleUrls: ['./buyer-signup.component.css']
})
export class BuyerSignupComponent implements OnInit {

  constructor(protected router: Router) { }

  ngOnInit(): void {
  }
  register() {
    this.router.navigate(['/login']);
  }
}
