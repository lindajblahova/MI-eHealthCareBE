package sk.fri.bioinf.ehealthcare.model;

import java.util.UUID;

public class Room
{
    private UUID idRoom;
    private int floorNumber;
    private int roomNumber;
    private int capacity;
    private boolean gender; // female = true, male = false

    public Room(UUID idRoom, int floorNumber, int roomNumber, int capacity, boolean gender) {
        this.idRoom = idRoom;
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.gender = gender;
    }

    public Room(int floorNumber, int roomNumber, int capacity, boolean gender) {
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.gender = gender;
    }

    public UUID getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(UUID idRoom) {
        this.idRoom = idRoom;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
