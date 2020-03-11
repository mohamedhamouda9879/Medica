package com.example.medica.DataBaseRoom;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface QuizDao {


    @Insert
    void addItem(QuizModel quizModel);


    @Query("select * from QuizModel WHERE row7 LIKE :x ;")
    List<QuizModel> selectAllItems(String x);

    @Query("select * from QuizModel ;")
    List<QuizModel> selectAllItems();

    @Query("select * from QuizModel WHERE row15 LIKE :row15 AND row16 LIKE :row16 " +
            "AND row17 LIKE :row17" +
            " AND row20 LIKE :row20 AND row21 LIKE :row21 " +
            "AND row22 LIKE :row22 AND row23 LIKE :row23 " +
            "AND row25 LIKE :row25 AND row26 LIKE :row26 " +
            "AND row28 LIKE :row28 AND row29 LIKE :row29 " +
            "AND row30 LIKE :row30 AND row34 LIKE :row34 " +
            "AND row35 LIKE :row35 AND row36 LIKE :row36" +
            " AND row37 LIKE :row37 AND row39 LIKE :row39 ;")
    List<QuizModel> selectAllItems(String row15,String row16,String row17,
                                   String row20,String row21,String row22,String row23,
                                   String row25,String row26,
                                   String row28,String row29,String row30,
                                   String row34,String row35,String row36,String row37,
                                   String row39);

}
