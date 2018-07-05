package io.spring.part03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.part03.dao.SequenceDao;
import io.spring.part03.model.Sequence;

@Service
public class SequenceService {

	@Autowired
	private final SequenceDao sequenceDao;

	public SequenceService(SequenceDao sequenceDao) {
		super();
		this.sequenceDao = sequenceDao;
	}

	public String generate(String sequenceId) {
		Sequence sequence = sequenceDao.getSequence(sequenceId);
		int value = sequenceDao.getNextValue(sequenceId);
		return sequence.getPrefix() + value + sequence.getSuffix();
	}
}
