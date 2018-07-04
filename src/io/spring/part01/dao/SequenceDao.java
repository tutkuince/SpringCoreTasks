package io.spring.part01.dao;

import io.spring.part01.model.Sequence;

public interface SequenceDao {
	Sequence getSequence(String sequenceId);
	int getNextValue(String sequenceId);
}
