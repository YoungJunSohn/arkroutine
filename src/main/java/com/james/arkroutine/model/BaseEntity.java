package com.james.arkroutine.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity<J>{

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    private J createdBy;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @LastModifiedBy
    private J modifiedBy;
}
