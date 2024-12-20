import { ChangeDetectionStrategy, Component, OnInit } from '@angular/core';
import { Input } from '@angular/core';
@Component({
  selector: 'app-postchild',
  templateUrl: './postchild.component.html',
  styleUrls: ['./postchild.component.css'],
  changeDetection:ChangeDetectionStrategy.OnPush
})
export class PostchildComponent implements OnInit {

  @Input() detailsData:any;

  constructor() { }

  ngOnInit(): void {
  }

}
