package com.boss.service;

import com.boss.pojo.Intention;

import java.util.Optional;

public interface IntentionService {

	Intention  saveAndFlash(Intention intention);

	Optional<Intention> findOneById(int id);
}
