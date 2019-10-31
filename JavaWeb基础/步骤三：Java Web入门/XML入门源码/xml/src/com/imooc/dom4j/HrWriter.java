package com.imooc.dom4j;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class HrWriter {
	public void writeXml(){
		String file = "d:/workspace/xml/src/hr.xml";
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			Element root = document.getRootElement();
			Element employee = root.addElement("employee");
			employee.addAttribute("no", "3311");
			Element name = employee.addElement("name");
			name.setText("������");
			employee.addElement("age").setText("37");
			employee.addElement("salary").setText("3600");
			Element department = employee.addElement("department");
			department.addElement("dname").setText("���²�");
			department.addElement("address").setText("XX����-B105");
			Writer writer = new OutputStreamWriter(new FileOutputStream(file) , "UTF-8");
			document.write(writer);
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		HrWriter hrWriter = new HrWriter();
		hrWriter.writeXml();
	}
}
