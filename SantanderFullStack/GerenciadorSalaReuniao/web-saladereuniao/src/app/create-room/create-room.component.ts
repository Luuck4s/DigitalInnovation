import {Component, OnInit} from '@angular/core';
import {RoomService} from "../core/room.service";
import {Router} from "@angular/router";
import {Room} from "../shared/models/room";

@Component({
  selector: 'app-create-room',
  templateUrl: './create-room.component.html',
  styleUrls: ['./create-room.component.css']
})
export class CreateRoomComponent implements OnInit {

  room: Room = new Room();
  submited = false;

  constructor(private roomService: RoomService, private router: Router) {
  }

  ngOnInit(): void {
  }

  newRoom(): void {
    this.submited = false;
    this.room = new Room();
  }

  save() {
    this.roomService.createRoom(this.room)
      .subscribe((data: Room) => {
          console.log(data)
          this.newRoom();
          this.goToList();
        },
        (error: any) => {
          console.log(error)
        })
  }

  onSubmit(){
    this.submited = true;
    this.save();
  }

  goToList(){
    this.router.navigate(['/rooms'])
  }
}
