package com.jaxb;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.Node;

public class JAXBUtils {
	/**
	 * 获取JAXBContext实例。
	 * 
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unused")
	private static final JAXBContext getJAXBContext(Class<?> c) {
		JAXBContext jaxbContext = null;
		try {
			jaxbContext = JAXBContext.newInstance(c);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jaxbContext;
	}

	/**
	 * 将报文节点反序列化为实体类
	 * 
	 * @param obj
	 * @param node
	 * @return
	 */
	public static final Object documentToModel(Object obj, Node node) {
		if (node == null) {
			return null;
		}
		JAXBContext jaxbContext = getJAXBContext(obj.getClass());
		try {
			// 得到反序列化实例Unmarshaller
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			obj = unmarshaller.unmarshal(node);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return obj;
	}

	/**
	 * 将实体类转序列化为对应String类型xml节点
	 * 
	 * @param obj
	 * @return
	 */
	public static final String modelToStringXML(Object obj) {
		StringWriter writer = new StringWriter();
		JAXBContext jaxbContext = getJAXBContext(obj.getClass());
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();
			// 设置序列化的编码格式
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
			// 设置格式化输出
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(obj, writer);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return writer.toString().replace("standalone=\"yes\"", "");

	}

	/**
	 * 将实体类转序列化为对应node节点
	 * 
	 * @param obj
	 *            实体类
	 * @param node
	 *            创建的新节点
	 * @return
	 */
	public static final Node modelToNode(Object obj, Node node) {
		JAXBContext jaxbContext = getJAXBContext(obj.getClass());
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(obj, node);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return node;

	}
}
