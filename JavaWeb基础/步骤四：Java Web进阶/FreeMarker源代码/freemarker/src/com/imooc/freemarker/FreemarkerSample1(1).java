package com.imooc.freemarker;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.imooc.freemarker.entity.Computer;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

public class FreemarkerSample1 {

	public static void main(String[] args) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		//1. ����ģ��
		//�����������ö���
		Configuration config = new Configuration(Configuration.VERSION_2_3_28);
		//���ü��ص�Ŀ¼
		config.setClassForTemplateLoading(FreemarkerSample1.class, "");
		//�õ�ģ�����
		Template t = config.getTemplate("sample1.ftl");
		//2. ��������
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("site", "����");
		data.put("url", "http://www.sina.com");
		data.put("date", new Date());
		data.put("number", 837183.883217);
		Map info = new HashMap();
		info.put("cpu", "i5");
		Computer c1 = new Computer("1234567" , "ThinkPad" , 1 , "����" , new Date() , 12900f , info);
		data.put("computer", c1);
		//3. �������
		t.process(data, new OutputStreamWriter(System.out));
	}
}
