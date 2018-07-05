package io.spring.part03.dao;

import io.spring.part03.model.Sequence;

public interface SequenceDao {
	Sequence getSequence(String sequenceId);
	int getNextValue(String sequenceId);
}
