package com.pengfei.springmvc.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zhaopen on 3/16/2017.
 */
@Data
@AllArgsConstructor
@Table(name = "tb_stu")
public class Student {
    @Id
    private int sno;
    private String sname;
}
