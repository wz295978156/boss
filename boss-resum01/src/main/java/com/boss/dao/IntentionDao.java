package com.boss.dao;

import com.boss.pojo.Intention;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface IntentionDao extends JpaRepository<Intention, Serializable> {
}
