import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../../services/product.service';
import { CartService } from '../../services/cart.service';
import { Product } from '../../models/Product';
import { response } from 'express';

@Component({
  selector: 'app-product-item-detail',
  templateUrl: './product-item-detail.component.html',
  styleUrls: ['./product-item-detail.component.css'],
})
export class ProductItemDetailComponent implements OnInit {
  product: Product | undefined;
  selectedProduct: number;
  selectedAmount: number = 1;

  constructor(
    private route: ActivatedRoute,
    private productService: ProductService,
    private cartService: CartService
  ) {
    this.selectedProduct = 0;
  }

  ngOnInit(): void {
    this.getPageId();
    this.getProduct();
  }

  getProduct(): void {
    //TODO: Get the product description
    //needs revision

    this.productService.getProducts().subscribe((response) => {
      this.product = response[this.selectedProduct - 1];
    });
  }
  addToCart(product: Product, amount: any): void {
    const cartProductPayload = {
      id: product.id,
      name: product.name,
      price: product.price,
      image: product.image,
      amount: parseInt(amount),
    };

    this.cartService.addToCart(cartProductPayload, amount);
  }

  // util
  getPageId(): any {
    //this.currentUser = JSON.parse(localStorage.getItem('currentUser') || '{}');
    this.selectedProduct = parseInt(
      this.route.snapshot.paramMap.get('id') as string
    );
    return this.selectedProduct;
  }
}
