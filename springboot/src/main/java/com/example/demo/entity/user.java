package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
@Data
public class user {
    @Id
    @KeySql(useGeneratedKeys = true)
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String nick_name;
    private Integer age;
    private String sex;
    private String address;

}
