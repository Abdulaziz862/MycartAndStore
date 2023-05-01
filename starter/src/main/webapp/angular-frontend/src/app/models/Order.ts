import { OnInit } from '@angular/core';
import { Product } from './Product';
//TODO: Add the contents of the order class
export class Order {
  id: number;
  total: number;
  name: string;
  price: number;
  orderItems: Product[];

  constructor() {
    this.id = 0;
    this.total = 0;
    this.name = '';
    this.price = 0;
    this.orderItems = [];
  }
}
