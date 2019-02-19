package com.db2.controller;

import com.db2.pojo.Record;
import com.db2.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;

    @RequestMapping("/save")
    @ResponseBody
    public Record saveRecord() {
        Record record = new Record();
        record.setValue("KUR");

        return recordRepository.save(record);
    }
}
