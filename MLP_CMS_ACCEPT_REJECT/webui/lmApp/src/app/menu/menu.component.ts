import { Component, OnInit } from '@angular/core';
import { MenuService } from './menu.service';
import {menu} from './Menu';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  menuDetails:menu[];

  constructor(private menuservice:MenuService) { }

  ngOnInit(): void {
    this.menuservice.httpMenuFetch().subscribe((data)=>this.menuDetails=data);
  }

}
