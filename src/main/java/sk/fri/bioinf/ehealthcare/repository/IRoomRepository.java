package sk.fri.bioinf.ehealthcare.repository;

import sk.fri.bioinf.ehealthcare.model.Room;

import java.util.List;
import java.util.UUID;

public interface IRoomRepository {

    Room getRoomByIdRoom(UUID idRoom);
    Room getRoomByFloorNumberAndRoomNumber(int floorNumber, int roomNumber);
    Room getRoomsByGender(boolean gender);
    void saveRoom(Room room);
    List<Room> getAllRooms();
}
