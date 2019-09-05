package com.hyecheon.jpastudymodel.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(updatable = false)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date lastModifiedDate;
}
