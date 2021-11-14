package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import sk.fri.bioinf.ehealthcare.model.Room;
import sk.fri.bioinf.ehealthcare.utils.DBProperties;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomMapper implements RowMapper<Room> {

    @Override
    public Room mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Room(
                resultSet.getObject(DBProperties.ROOM_ID_ROOM, java.util.UUID.class),
                resultSet.getInt(DBProperties.ROOM_FLOOR_NUMBER),
                resultSet.getInt(DBProperties.ROOM_ROOM_NUMBER),
                resultSet.getInt(DBProperties.ROOM_CAPACITY),
                resultSet.getBoolean(DBProperties.ROOM_GENDER)
        );
    }
}
