import {Component, OnInit} from '@angular/core';
import {Observable} from "rxjs";
import {RoomDetailsComponent} from "../room-details/room-details.component";
import {Room} from "../shared/models/room";
import {RoomService} from "../core/room.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-room-list',
  templateUrl: './room-list.component.html',
  styleUrls: ['./room-list.component.css']
})
export class RoomListComponent implements OnInit {

  rooms?: Observable<Room[]>;

  constructor(private roomService: RoomService, private router: Router) {
  }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData(): void {
    this.rooms = this.roomService.getRoomList();
  }

  deleteRoom(id: number): void {
     this.roomService.deleteRoom(id).subscribe(
      (data: any)  => {
        console.log(data)
        this.reloadData();
      },
      error => {
        console.log(error)
      }
    );
  }

  roomDetails(id: number){
    this.router.navigate(['details', id] );
  }

  updateRoom(id: number){
    this.router.navigate(['update', id] );
  }


}
