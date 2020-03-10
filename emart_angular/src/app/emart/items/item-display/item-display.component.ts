import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { EmartService } from 'src/app/emart.service';
import { Item } from '../../Item';

@Component({
  selector: 'app-item-display',
  templateUrl: './item-display.component.html',
  styleUrls: ['./item-display.component.css']
})
export class ItemDisplayComponent implements OnInit {
  item: Item;

  constructor(protected activatedRoute: ActivatedRoute, protected emartService: EmartService, protected router: Router) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe(
      (param) => {
        let id = param.get('iId');
        this.emartService.getItem(id).subscribe(
          (response: any) => {
            this.item = response;
          });
      });
  }

  addToCart(item: any) {
    this.emartService.addToCart(item);
    this.router.navigate(['item-list']);
  }

}
