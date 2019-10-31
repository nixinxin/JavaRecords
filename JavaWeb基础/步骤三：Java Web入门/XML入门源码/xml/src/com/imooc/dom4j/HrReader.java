package com.imooc.dom4j;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class HrReader {
	public void readXml(){
		String file = "d:/workspace/xml/src/hr.xml";
		//SAXReader���Ƕ�ȡXML�ļ��ĺ����࣬���ڽ�XML�������ԡ���������ʽ�������ڴ��С�
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			//��ȡXML�ĵ��ĸ��ڵ㣬��hr��ǩ
			Element root = document.getRootElement();
			//elements�������ڻ�ȡָ���ı�ǩ����
			List<Element> employees =  root.elements("employee");
			for(Element employee : employees){
				//element�������ڻ�ȡΨһ���ӽڵ����
				Element name = employee.element("name");
				String empName = name.getText();//getText()�������ڻ�ȡ��ǩ�ı�
				System.out.println(empName);
				System.out.println(employee.elementText("age"));
				System.out.println(employee.elementText("salary"));
				Element department = employee.element("department");
				System.out.println(department.element("dname").getText());
				System.out.println(department.element("address").getText());
				Attribute att = employee.attribute("no");
				System.out.println(att.getText());
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		HrReader reader = new HrReader();
		reader.readXml();
	}
	
}
