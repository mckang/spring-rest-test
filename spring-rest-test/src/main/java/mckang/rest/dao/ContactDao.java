package mckang.rest.dao;

import mckang.rest.model.ContactVo;

public interface ContactDao {

	public void create(ContactVo contact);

	public ContactVo get(String email);

	public void delete(String email);

	public void update(String email, ContactVo contact);

}
