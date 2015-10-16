package com.service;

import java.util.List;

import com.ORM.Notice;

public interface NoticeService {
	public boolean addNotice(Notice word) throws Exception;
	public List browseNotice(int pageSize,int pageNo) throws Exception;
	public List browseNotice() throws Exception;
	/** 统计留言条数 */
	public int countNotice() throws Exception;	
	/** 删除留言 */	
	public boolean delNotice(Integer id) throws Exception;	
	/** 装载留言 */	
	public Notice loadNotice(Integer id) throws Exception;
	
	public boolean updateNotice(Notice word) throws Exception;
}
