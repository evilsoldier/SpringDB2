package com.db2.controller;

import com.db2.pojo.Record;
import com.db2.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecordController {

    private final RecordRepository recordRepository;

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public RecordController(RecordRepository recordRepository, JdbcTemplate jdbcTemplate) {
        this.recordRepository = recordRepository;
        this.jdbcTemplate = jdbcTemplate;
    }

    @RequestMapping("/saveViaRepo")
    @ResponseBody
    public Record saveRecordViaRepo() {
        Record record = new Record();
        record.setValue("KUR");

        return recordRepository.save(record);
    }

    @RequestMapping("/saveViaTemplate")
    @ResponseBody
    public String saveRecordViaTemplate() {

        jdbcTemplate.execute("INSERT INTO RECORD (value) values ('JUV')");

        return "OK";
    }
}
