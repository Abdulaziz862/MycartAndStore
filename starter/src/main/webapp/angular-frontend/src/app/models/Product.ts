//TODO: Add the contents of the product class
//import { Big } from 'https://raw.githubusercontent.com/mikemcl/big.js/v6.2.1/big.mjs';

export class Product {
  id: number;
  amount: number;
  name: string;
  price: number;
  description: string;
  image: any[];
  constructor() {
    this.id = 0;
    this.amount = 0;
    this.name = '';
    this.price = 0;
    this.description = '';
    this.image = [];
  }
}
