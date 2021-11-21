package ru.third;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class FurnitureDAO {
    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<Furniture> findAll(){
        List<Furniture> students = jdbcTemplate.query("select * from student", new
                BeanPropertyRowMapper<>(Furniture.class));
        return students;
    }
    public int insert(Furniture furniture){
        return jdbcTemplate.update("insert into furniture " + "(id, type, production_year, x, y, z) "
                + "values (?,?,?,?,?,?)",
                new Object[] {
                        furniture.getId(), furniture.getType(),
                        furniture.getProductionYear(), furniture.getHeight(), furniture.getWidth(), furniture.getDepth()
                });
    }
}

