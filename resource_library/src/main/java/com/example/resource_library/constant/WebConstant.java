package com.example.resource_library.constant;

/**
 * Created by JJY on 2016/8/21.
 */
public class WebConstant {
    //public static final String WEBHOST="http://125.216.242.178:8080/yjyProject/";
    // public static String WEBHOST="http://125.216.242.178:8080/yjyProject/";
    public static String WEBHOST = "http://121.199.23.184/yjyProject/";
    public static String WEBFILEHOST = "http://121.199.23.184/yjyFS/";
//    public static String WEBHOST = "http://125.216.242.136:8080/yjyProject/";

    public static String GET_STUDENT_BY_CLASSID = WEBHOST + "class/classMembers";
    public static String LOGIN = WEBHOST + "login/teacher";
    public static String GET_RD_TYPE_DISTRIBUTION = WEBHOST + "analysis/fileTypeDis";
    public static String GET_RD_NUM = WEBHOST + "analysis/fileNumDis";
    public static String GET_ATTENDANCE = WEBHOST + "analysis/attenRatio";
    public static String GET_QA_ANSWERDIS = WEBHOST + "analysis/answerDis";
    public static String GET_QA_ALL_ANSWERDIS = WEBHOST + "qa/quesAll";

    public static String SEND_GROUP = WEBHOST + "mongo/groupExist";
    public static String GET_GROUP = WEBHOST + "group/groupExist";
    public static String DELETE_GROUP = WEBHOST + "group/groupDel";

    public static String DESTRIBUTE_UPLOAD = WEBFILEHOST + "distributed/upload";
    public static String QA_UPLOAD = WEBFILEHOST + "qa/upload";
    public static String QA_DOWNLOAD = WEBFILEHOST + "qa/download";
    public static String WHITEBOARD_UPLOAD = WEBFILEHOST + "whiteboard/upload";
    public static String WHITEBOARD_DOWNLOAD = WEBFILEHOST + "whiteboard/download";


    public static String QA_SUB = WEBHOST + "qa/quesSub";
    public static String GET_QA_SCORE = WEBHOST + "qa/scoreIndividual";
    public static String GET_QA_SCORE_GROUP = WEBHOST + "qa/scoreGroup";

    public static String GET_CLASS_BY_TEACHERID = WEBHOST + "teacher/classTeached";
    public static String GET_COURSE = WEBHOST + "teacher/courseTeached";
    public static String GET_COURSE_ALL = WEBHOST + "teacher/courseTeachedAll";

    public static String GET_LESSON = WEBHOST + "teacher/lessonTeached";
    public static String GET_TIMELINE = WEBHOST + "teacher/lessonSequence";
    public static String GET_WHITEBOARD = WEBHOST + "teacher/whiteboard";

    public static String GET_SP_TABLE1 = WEBHOST + "spTable/analysis";

    public static String AC_GET_SCHOOL = WEBHOST + "forclass/getSchool";
    public static String AC_GET_DISCIPLINE = WEBHOST + "forclass/getSubject";
    public static String AC_GET_TEACHER = WEBHOST + "forclass/getTeacher";
    public static String AC_GET_GRADE = WEBHOST + "forclass/getGrade";
    public static String AC_GET_CLASS = WEBHOST + "forclass/getCl";
    public static String AC_GET_LESSON = WEBHOST + "forclass/getLesson";
    public static String AC_GET_SEQUENCE = WEBHOST + "forclass/getSequence";

    public static String AC_GET_AC = WEBHOST + "forclass/activityCount";

    public static String SP_TABLE = WEBHOST + "spTable/analysis";

    public static String GET_FPS = WEBHOST + "dm/fps";

    public static String GET_RADAR_DATA = WEBHOST + "label/getClassChart";


    //获取互评的量规 0、1区分，(1表示组内，0表示组间)
    public static String GET_GROUP_GAUGE = WEBHOST + "/evaluation/getAllEva";

    @Deprecated
    public static String GET_GROUP_EVALU_SCORE = WEBHOST + "/score/group_inner";
    @Deprecated
    public static String GET_GROUP_EVALU_SCORE_SELF = WEBHOST + "/evaluation/getEvaScoreSelf";
    @Deprecated
    public static String GET_GROUP_EVALU_SCORE_PEER = WEBHOST + "/evaluation/getEvaScorePeer";

    // TODO 查看组内互评得分
    public static String GET_GROUP_INNER_EVALU_SCORE = WEBHOST + "/evaluation/getGroupMemberTable";
//    public static String GET_GROUP_INNER_EVALU_SCORE = APPConstant.local + "/evaluation/getGroupMemberTable";




    // TODO 查看组间互评得分
    public static String GET_GROUP_INTER_EVALU_SCORE = WEBHOST + "/evaluation/getAllGroupTable";
//    public static String GET_GROUP_INTER_EVALU_SCORE = APPConstant.local + "/evaluation/getAllGroupTable";


    public static String GET_INTERGROUP_EVALU_SCORE = WEBHOST + "/score/group_inter";


    public static String SET_WORKS_SCORE = WEBHOST + "/works/score";


    //根据lessonId获取在这个Lesson的所有question
    public static String GET_LESSON_QUESTION = WEBHOST + "/qa/quesList";
    //我的收藏
//    public static String ADD_COLLECTION = WEBHOST + "/collection/add";

    //获取以及发送标签
    public static String GET_LABEL = WEBHOST + "label/getLabel";
    public static String SEND_LABEL = WEBHOST + "label/setLabel";

    //题库里获取学科list
    public static String GET_SUBJECT_LIST = WEBHOST + "qa/getSubjects";

    public static String SET_DIFFICULTY = WEBHOST + "qa/setDifficulty";

    public static String GET_MYWORK_LIST = WEBHOST + "/works/list";

    public static String GET_SUBJECT_LIST_WORK = WEBHOST + "/analysis_stu/subjects";

    public static String GET_MYWORK_LABEL = WEBHOST + "/works/getLabel";
    public static String SET_MYWORK_LABEL = WEBHOST + "/works/setLabel";

    public static String GET_VOTE_RESULT = WEBHOST + "/vote/getVoteRes";


    public static void update() {
        GET_STUDENT_BY_CLASSID = WEBHOST + "class/classMembers";
        LOGIN = WEBHOST + "login/teacher";
        GET_RD_TYPE_DISTRIBUTION = WEBHOST + "analysis/fileTypeDis";
        GET_RD_NUM = WEBHOST + "analysis/fileNumDis";
        GET_ATTENDANCE = WEBHOST + "analysis/attenRatio";

        SEND_GROUP = WEBHOST + "mongo/groupExist";
        GET_GROUP = WEBHOST + "group/groupExist";
        DELETE_GROUP = WEBHOST + "group/groupDel";

        DESTRIBUTE_UPLOAD = WEBFILEHOST + "distributed/upload";
        QA_UPLOAD = WEBFILEHOST + "qa/upload";
        GET_QA_ALL_ANSWERDIS = WEBHOST + "qa/quesAll";
        GET_QA_ANSWERDIS = WEBHOST + "analysis/answerDis";

        QA_SUB = WEBHOST + "qa/quesSub";
        GET_QA_SCORE = WEBHOST + "qa/scoreIndividual";
        GET_QA_SCORE_GROUP = WEBHOST + "qa/scoreGroup";

        QA_DOWNLOAD = WEBFILEHOST + "qa/download";
        GET_CLASS_BY_TEACHERID = WEBHOST + "teacher/classTeached";
        GET_COURSE = WEBHOST + "teacher/courseTeached";
        GET_COURSE_ALL = WEBHOST + "teacher/courseTeachedAll";

        GET_LESSON = WEBHOST + "teacher/lessonTeached";
        GET_TIMELINE = WEBHOST + "teacher/lessonSequence";

        GET_WHITEBOARD = WEBHOST + "teacher/whiteboard";
        WHITEBOARD_DOWNLOAD = WEBFILEHOST + "whiteboard/download";
        QA_SUB = WEBHOST + "qa/quesSub";
        GET_QA_SCORE = WEBHOST + "qa/scoreIndividual";
        GET_QA_SCORE_GROUP = WEBHOST + "qa/scoreGroup";

//        GET_CLASS_BY_TEACHERID = WEBHOST + "teacher/classTeached";
//        GET_COURSE = WEBHOST + "teacher/courseTeached";
//
//        GET_LESSON = WEBHOST + "teacher/lessonTeached";
//        GET_TIMELINE = WEBHOST + "teacher/lessonSequence";
//        GET_WHITEBOARD = WEBHOST + "teacher/whiteboard";

        GET_SP_TABLE1 = WEBHOST + "spTable/analysis";

        AC_GET_SCHOOL = WEBHOST + "forclass/getSchool";
        AC_GET_DISCIPLINE = WEBHOST + "forclass/getSubject";
        AC_GET_TEACHER = WEBHOST + "forclass/getTeacher";
        AC_GET_GRADE = WEBHOST + "forclass/getGrade";
        AC_GET_CLASS = WEBHOST + "forclass/getCl";
        AC_GET_LESSON = WEBHOST + "forclass/getLesson";
        AC_GET_SEQUENCE = WEBHOST + "forclass/getSequence";

        AC_GET_AC = WEBHOST + "forclass/activityCount";

        SP_TABLE = WEBHOST + "spTable/analysis";
        GET_FPS = WEBHOST + "dm/fps";

        GET_RADAR_DATA = WEBHOST + "label/getClassChart";

        GET_GROUP_GAUGE = WEBHOST + "/evaluation/getAllEva";
        GET_GROUP_EVALU_SCORE = WEBHOST + "/score/group_inner";
        GET_GROUP_EVALU_SCORE_SELF = WEBHOST + "/evaluation/getEvaScoreSelf";
        GET_GROUP_EVALU_SCORE_PEER = WEBHOST + "/evaluation/getEvaScorePeer";

        GET_GROUP_INNER_EVALU_SCORE = WEBHOST + "/evaluation/getGroupMemberTable";
//        GET_GROUP_INNER_EVALU_SCORE = APPConstant.local + "/evaluation/getGroupMemberTable";

        GET_GROUP_INTER_EVALU_SCORE = WEBHOST + "/evaluation/getAllGroupTable";
//        GET_GROUP_INTER_EVALU_SCORE = APPConstant.local + "/evaluation/getAllGroupTable";

        GET_INTERGROUP_EVALU_SCORE = WEBHOST + "/score/group_inter";

        SET_WORKS_SCORE = WEBHOST + "/works/score";

        GET_LESSON_QUESTION = WEBHOST + "/qa/quesList";


        GET_LABEL = WEBHOST + "label/getLabel";
        SEND_LABEL = WEBHOST + "label/setLabel";
        SET_DIFFICULTY = WEBHOST + "qa/setDifficulty";

        GET_MYWORK_LIST = WEBHOST + "/works/list";

        GET_SUBJECT_LIST_WORK = WEBHOST + "/analysis_stu/subjects";

        GET_MYWORK_LABEL = WEBHOST + "/works/getLabel";
        SET_MYWORK_LABEL = WEBHOST + "/works/ setLabel";

        GET_VOTE_RESULT = WEBHOST + "/vote/getVoteRes";
    }


}
