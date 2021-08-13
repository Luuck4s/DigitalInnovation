import { Component, OnInit } from '@angular/core';
import {RoomService} from "../core/room.service";
import {ActivatedRoute, Router} from "@angular/router";
import {Room} from "../shared/models/room";

@Component({
  selector: 'app-room-details',
  templateUrl: './room-details.component.html',
  styleUrls: ['./room-details.component.css']
})
export class RoomDetailsComponent implements OnInit {

  id!: number;
  room!: Room;

  constructor(private roomService: RoomService, private route: ActivatedRoute,private router: Router) { }

  ngOnInit() {
    this.room = new Room();
    this.id = this.route.snapshot.params['id'];

    this.roomService.getRoom(this.id)
    .subscribe(
      (data: Room) => {
        this.room = data;
      },
      (error: any) => {
        console.log(error)
      }
    )
  }

  list(){
    this.router.navigate(['rooms'])
  }

}
