import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../models/Product';
import { map, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class ProductService {
  private baseUrl: string = 'http://localhost:8080/api/all';
  constructor(private http: HttpClient) {}

  getProducts(): Observable<Product[]> {
    //TODO: Fetch the product list from the API
    return this.http.get<Product[]>(`${this.baseUrl}`, {
      headers: { Authorization: 'Basic dWRhY2l0eTpwYXNzd29yZA==' },
    });
  }
}
