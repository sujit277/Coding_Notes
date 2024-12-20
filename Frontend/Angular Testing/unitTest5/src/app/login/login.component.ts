import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  needsLogin: boolean = true;

  constructor(private auth: AuthService) { }

  ngOnInit(): void {
    this.auth.isAuthenticated().then((authenticated: any) => {
      this.needsLogin = !authenticated;
    })
  }

}
