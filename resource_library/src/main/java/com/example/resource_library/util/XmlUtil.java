package com.example.resource_library.util;

import com.example.resource_library.model.ChoiceQuesResult;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/**
 * Created by Guan on 2017/10/7.
 */

public class XmlUtil {

    public static ChoiceQuesResult readXMLforYJY(String XMLPathAndName) {
        try {
            System.out.println("XMLPathAndName=" + XMLPathAndName);
            ChoiceQuesResult choiceQuesResult = new ChoiceQuesResult();
            List<ChoiceQuesResult.ChoiceQues> resultList = new ArrayList<>();

            choiceQuesResult.setResultList(resultList);


            ChoiceQuesResult.ChoiceQues ques = null;
            ChoiceQuesResult.ChoiceQuesInfo quesInfo = null;

            String domain = null;
            String chapter = null;

            //Document doc = DocumentHelper.parseText(XMLPathAndName);
            SAXReader reader = new SAXReader();
            Document doc = reader.read(new File(XMLPathAndName));
            //获得根节点
            Element root = doc.getRootElement();
            choiceQuesResult.setRootTitle(root.getName());

            Iterator<Element> it = root.elementIterator();
            while (it.hasNext()) {
                Element element = it.next();
                if (element.getName().equals("题目")) {
                    ques = new ChoiceQuesResult.ChoiceQues();
                    ques.setTitle(element.getText().replace("\n", "").trim());
                    ques.setOptionList(new ArrayList<String>());
                    ques.setLabelList(new ArrayList<ChoiceQuesResult.ChoiceQuesInfo>());
                    resultList.add(ques);
                } else if (element.getName().equals("图片")) {
                } else if (element.getName().equals("答案")) {
                    ques.setAnswer(element.getText().replace("\n", "").trim());
                } else if (element.getName().equals("科目")) {
                    domain = element.getText().replace("\n", "").trim();
                } else if (element.getName().equals("章节")) {
                    chapter = element.getText().replace("\n", "").trim();
                } else if (element.getName().equals("认知维度")) {
                    quesInfo = new ChoiceQuesResult.ChoiceQuesInfo();
                    quesInfo.setChapter("-1");
                    quesInfo.setDomain(domain);
                    quesInfo.setLabel(element.getText().replace("\n", "").trim());
                    ques.getLabelList().add(quesInfo);
                } else if (element.getName().equals("知识点")) {
                    String[] zhishidian = element.getText().replace("\n", "").trim().split("、");
                    for (String zsd : zhishidian) {
                        quesInfo = new ChoiceQuesResult.ChoiceQuesInfo();
                        quesInfo.setChapter(chapter);
                        quesInfo.setDomain(domain);
                        quesInfo.setLabel(zsd);
                        ques.getLabelList().add(quesInfo);
                    }

                } else {
                    ques.getOptionList().add(element.getText().replace("\n", "").trim());
                }
            }
            return choiceQuesResult;

        } catch (DocumentException e) {
            e.printStackTrace();
            return null;
        }

    }

}
