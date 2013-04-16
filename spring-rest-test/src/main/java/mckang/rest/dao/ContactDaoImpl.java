package mckang.rest.dao;

import mckang.rest.model.ContactVo;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class ContactDaoImpl extends SqlSessionDaoSupport implements ContactDao {

	public void create(ContactVo contact) {

		// TODO Auto-generated method stub

	}

	public ContactVo get(String email) {

		// TODO Auto-generated method stub

		ContactVo contact = (ContactVo) getSqlSession().selectOne(
				"contactdao.getUserByEmail", email);

		return contact;

	}

	public void delete(String email) {

		// TODO Auto-generated method stub

	}

	public void update(String email, ContactVo contact) {

		// TODO Auto-generated method stub

	}

}
