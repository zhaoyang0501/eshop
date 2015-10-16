package com.service;

import java.util.List;

import com.ORM.Notice;

public interface NoticeService {
	public boolean addNotice(Notice word) throws Exception;
	public List browseNotice(int pageSize,int pageNo) throws Exception;
	public List browseNotice() throws Exception;
	/** ͳ���������� */
	public int countNotice() throws Exception;	
	/** ɾ������ */	
	public boolean delNotice(Integer id) throws Exception;	
	/** װ������ */	
	public Notice loadNotice(Integer id) throws Exception;
	
	public boolean updateNotice(Notice word) throws Exception;
}
