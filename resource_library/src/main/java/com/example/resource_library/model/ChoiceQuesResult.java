package com.example.resource_library.model;

import java.util.List;

/**
 * Created by Guan on 2017/10/7.
 */

public class ChoiceQuesResult {
    private String rootTitle;
    private List<ChoiceQues> resultList;




    public String getRootTitle() {
        return rootTitle;
    }

    public void setRootTitle(String rootTitle) {
        this.rootTitle = rootTitle;
    }

    public List<ChoiceQues> getResultList() {
        return resultList;
    }

    public void setResultList(List<ChoiceQues> resultList) {
        this.resultList = resultList;
    }

    public static class ChoiceQues{
        private String title="";
        private List<String> optionList;
        private List<ChoiceQuesInfo> labelList;
        private String answer;

        public List<ChoiceQuesInfo> getLabelList() {
            return labelList;
        }

        public void setLabelList(List<ChoiceQuesInfo> labelList) {
            this.labelList = labelList;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getOptionList() {
            return optionList;
        }

        public void setOptionList(List<String> optionList) {
            this.optionList = optionList;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }

        @Override
        public String toString() {
            return "ChoiceQues{" +
                    "title='" + title + '\'' +
                    ", optionList=" + optionList +
                    ", answer='" + answer + '\'' +
                    '}';
        }
    }

    public static class ChoiceQuesInfo{
        private String domain;     //科目
        private String chapter;     //章节
        private String label;      //认知维度/知识点

        public String getDomain() {
            return domain;
        }

        public void setDomain(String domain) {
            this.domain = domain;
        }

        public String getChapter() {
            return chapter;
        }

        public void setChapter(String chapter) {
            this.chapter = chapter;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

    }

    @Override
    public String toString() {
        return "ChoiceQuesResult{" +
                "rootTitle='" + rootTitle + '\'' +
                ", resultList=" + resultList.toString() +
                '}';
    }
}
