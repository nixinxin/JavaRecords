package com.imooc.freemarker;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.imooc.freemarker.entity.Computer;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class FreemarkerSample3 {

	public static void main(String[] args) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		//1. ����ģ��
		//�����������ö���
		Configuration config = new Configuration(Configuration.VERSION_2_3_28);
		//���ü��ص�Ŀ¼
		config.setClassForTemplateLoading(FreemarkerSample3.class, "");
		//�õ�ģ�����
		Template t = config.getTemplate("sample3.ftl");
		//2. ��������
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("name", "jackson");
		data.put("brand", "bmw");
		data.put("words", "first blood");
		data.put("n", 37981.83);
		data.put("date", new Date());
		List<Computer> computers = new ArrayList();
		computers.add(new Computer("1234567" , "ThinkPad X1" , 2 , null , new Date() , 12999f , new HashMap() ));
		computers.add(new Computer("1234568" , "HP XXX" , 1 , "����" , new Date() , 7500f , new HashMap() ));
		computers.add(new Computer("1234569" , "DELL XXX" , 3 , "����" , new Date() , 8500f , new HashMap() ));
		computers.add(new Computer("1234570" , "ACER XXX" , 1 , "����" , new Date() , 6300f , new HashMap() ));
		computers.add(new Computer("1234571" , "MSI XXX" , 1 , "����" , new Date() , 9300f , new HashMap() ));	
		data.put("computers", computers);
		//3. �������
		t.process(data, new OutputStreamWriter(System.out));
	}
}
