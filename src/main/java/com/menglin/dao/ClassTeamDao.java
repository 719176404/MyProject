package com.menglin.dao;

import com.menglin.entity.ClassTeam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ClassTeamDao {

    ClassTeam selectByName(String name);

    List<ClassTeam> getClassTeamsListByCollegeIdAndMajorId(@Param("collegeId") Long collegeId, @Param("majorId") Long majorId);

    List<ClassTeam> getClassTeamsListByTeacherId(Long teacherId);

    List<ClassTeam> queryClassTeamsByIdList(Map<String, Object> map);

    List<ClassTeam> queryClassTeamsByPage(Map<String, Object> map);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int insert(ClassTeam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int insertSelective(ClassTeam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    ClassTeam selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int updateByPrimaryKeySelective(ClassTeam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Sat Apr 28 16:42:08 CST 2018
     */
    int updateByPrimaryKey(ClassTeam record);
}