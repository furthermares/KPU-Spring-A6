package org.tukorea.free.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tukorea.free.domain.WordVO;

@Repository
public class WordDAOImpl implements WordDAO {

	@Autowired
	private SqlSession sqlSession;

	private static final String namespace = "org.tukorea.free.mapper.WordMapper";

	public WordVO read(String id) throws Exception {
		WordVO vo = sqlSession.selectOne(namespace + ".selectByid", id);
		return vo;
	}

	public List<WordVO> readList() throws Exception {
		List<WordVO> wordlist = new ArrayList<WordVO>();
		wordlist = sqlSession.selectList(namespace + ".selectAll");
		return wordlist;
	}

	public void add(WordVO vo) throws Exception {
		System.out.println(vo);
		sqlSession.insert(namespace + ".insert", vo);
	}

	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace + ".delete", id);
	}

	public void update(WordVO word) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update(namespace + ".update", word);
	}


}
