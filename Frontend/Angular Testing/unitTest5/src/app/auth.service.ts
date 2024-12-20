import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() { }

  isAuthenticated(): Promise<boolean> {
    return Promise.resolve(!!localStorage.getItem('Name'));
  }
}
