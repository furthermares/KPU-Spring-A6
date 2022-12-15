package org.tukorea.free.persistence;

import java.util.List;

import org.tukorea.free.domain.WordVO;

public interface WordDAO {

	public void add(WordVO word) throws Exception;
	public List<WordVO> readList() throws Exception;
	public WordVO read(String id) throws Exception;
	public void delete(String id) throws Exception;
	public void update(WordVO word) throws Exception;

}
