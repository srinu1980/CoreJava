package com.cts.io;

import java.io.Serializable;

public class StudentInfo implements Serializable 
{
	
	int sid;
	String sname;
	transient String contact;
	
	StudentInfo(int sid, String sname, String contact)
	{
		this.sid=sid;
		this.sname=sname;
		this.contact=contact;
	}

}
