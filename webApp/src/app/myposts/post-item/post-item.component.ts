import { Component, Input, OnInit } from '@angular/core';
import { Product } from 'src/app/models/Product';

@Component({
  selector: 'app-post-item',
  templateUrl: './post-item.component.html',
  styleUrls: ['./post-item.component.css']
})
export class PostItemComponent implements OnInit {

  @Input() productItem: Product;

  retrievedImage = '';

  constructor(   ) { 
    }

  ngOnInit(): void {
    console.log("Product received by parent"+ this.productItem);
    this.retrievedImage ='data:' + this.productItem.photo.type + ';base64,' + this.productItem.photo.image.data; 
  }

}
