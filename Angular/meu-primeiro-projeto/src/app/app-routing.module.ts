import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Component, OnInit } from '@angular/core';

const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})

export class AppRoutingModule { }
export class HomeComponent implements OnInit {
  constructor() { }
  ngOnInit() {}
}