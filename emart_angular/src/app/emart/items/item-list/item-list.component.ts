import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Item } from '../../Item';
import { EmartService } from 'src/app/emart.service';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {
  allItems: any;

  constructor(protected router: Router, protected emartService: EmartService) { }

  ngOnInit(): void {
    this.emartService.getAllItems().subscribe(
      (response: any) => {
        this.allItems = response;
      }
    );
  }
  displayItemDetails(itemId: number) {
    this.router.navigate(['/item-display/' + itemId]);
  }
  addToCart(item: any) {
    this.emartService.addToCart(item);
    this.router.navigate(['/item-list']);
  }
}
