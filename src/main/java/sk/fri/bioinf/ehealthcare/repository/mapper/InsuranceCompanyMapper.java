package sk.fri.bioinf.ehealthcare.repository.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InsuranceCompanyMapper implements RowMapper<InsuranceCompanyMapper> {

    @Override
    public InsuranceCompanyMapper mapRow(ResultSet resultSet, int i) throws SQLException {
        return new InsuranceCompanyMapper(
        );
    }
}
