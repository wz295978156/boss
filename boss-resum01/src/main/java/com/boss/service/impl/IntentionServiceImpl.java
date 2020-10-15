package com.boss.service.impl;

import com.boss.dao.IntentionDao;
import com.boss.pojo.Intention;
import com.boss.service.IntentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IntentionServiceImpl implements IntentionService {

	@Autowired
	IntentionDao intentionDao;

	@Override
	public Intention saveAndFlash(Intention intention) {
		return intentionDao.saveAndFlush(intention);
	}

	@Override
	public Optional<Intention> findOneById(int id) {
		Optional<Intention> intention = intentionDao.findById(id);
		return intention;
	}

}
