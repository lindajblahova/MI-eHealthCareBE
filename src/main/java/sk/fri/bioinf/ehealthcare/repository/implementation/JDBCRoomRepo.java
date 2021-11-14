package sk.fri.bioinf.ehealthcare.repository.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Room;
import sk.fri.bioinf.ehealthcare.repository.IRoomRepository;
import sk.fri.bioinf.ehealthcare.repository.mapper.RoomMapper;

import java.util.List;
import java.util.UUID;

public class JDBCRoomRepo implements IRoomRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private RowMapper<Room> roomRowMapper = new RoomMapper();

    @Override
    public Room getRoomByIdRoom(UUID idRoom) {
        return null;
    }

    @Override
    public Room getRoomByFloorNumberAndRoomNumber(int floorNumber, int roomNumber) {
        return null;
    }

    @Override
    public Room getRoomsByGender(boolean gender) {
        return null;
    }

    @Override
    public void saveRoom(Room room) {

    }

    @Override
    public List<Room> getAllRooms() {
        return null;
    }
}
