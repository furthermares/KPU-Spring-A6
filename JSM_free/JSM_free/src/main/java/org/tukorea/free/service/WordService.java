package org.tukorea.free.service;

import java.util.List;

import org.tukorea.free.domain.WordVO;

public interface WordService {
	
	public WordVO readWord(String id) throws Exception;
	public List<WordVO> readWordList() throws Exception;
	public void addWord(WordVO word) throws Exception;
	public void deleteWord(String id) throws Exception; 
	public void updateWord(WordVO word) throws Exception;
	public void quiz(WordVO word1, WordVO word2) throws Exception;	
}
