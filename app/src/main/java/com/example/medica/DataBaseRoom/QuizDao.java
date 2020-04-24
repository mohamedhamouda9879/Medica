package com.example.medica.DataBaseRoom;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface QuizDao {


    @Insert
    void addItem(QuizModel quizModel);




    @Query("select * from QuizModel ;")
    List<QuizModel> selectAllItems();


    @Query("select * from QuizModel WHERE model LIKE :model")
    List<QuizModel>selectItemByModel(String model);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15")
    List<QuizModel>selectItemBy1Paramters(String model,String row15);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16")
    List<QuizModel>selectItemBy2Paramters(String model,String row15,String row16);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17")
    List<QuizModel>selectItemBy3Paramters(String model,String row15,String row16,String row17);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20")
    List<QuizModel>selectItemBy4Paramters(String model,String row15,String row16,String row17,String row20);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21")
    List<QuizModel>selectItemBy5Paramters(String model,String row15,String row16,String row17,String row20,String row21);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22")
    List<QuizModel>selectItemBy6Paramters(String model,String row15,String row16,String row17,String row20,String row21,String row22);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23")
    List<QuizModel>selectItemBy7Paramters(String model,String row15,String row16,String row17,String row20,String row21,String row22,String row23);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23 AND row25 LIKE :row25")
    List<QuizModel>selectItemBy8Paramters(String model,String row15,String row16,String row17, String row20,String row21,String row22,String row23,String row25);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23 AND row25 LIKE :row25 AND row26 LIKE :row26 ")
    List<QuizModel>selectItemBy9Paramters(String model,String row15,String row16,String row17, String row20,String row21,String row22,String row23, String row25,String row26);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23 AND row25 LIKE :row25 AND row26 LIKE :row26 AND row28 LIKE :row28")
    List<QuizModel>selectItemBy10Paramters(String model,String row15,String row16,String row17, String row20,String row21,String row22,String row23, String row25,String row26,String row28);

    @Query("select * from QuizModel WHERE model LIKE :model AND model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23 AND row25 LIKE :row25 AND row26 LIKE :row26  AND row28 LIKE :row28 AND row29 LIKE :row29")
    List<QuizModel>selectItemBy11Paramters(String model,String row15,String row16,String row17, String row20,String row21,String row22,String row23, String row25,String row26,String row28,String row29);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23 AND row25 LIKE :row25 AND row26 LIKE :row26  AND row28 LIKE :row28 AND row29 LIKE :row29 AND row30 LIKE :row30")
    List<QuizModel>selectItemBy12Paramters(String model,String row15,String row16,String row17, String row20,String row21,String row22,String row23, String row25,String row26,String row28,String row29,String row30);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23 AND row25 LIKE :row25 AND row26 LIKE :row26  AND row28 LIKE :row28 AND row29 LIKE :row29 AND row30 LIKE :row30 AND row34 LIKE :row34 ")
    List<QuizModel>selectItemBy13Paramters(String model,String row15,String row16,String row17, String row20,String row21,String row22,String row23, String row25,String row26,String row28,String row29,String row30,
                                           String row34);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23 AND row25 LIKE :row25 AND row26 LIKE :row26  AND row28 LIKE :row28 AND row29 LIKE :row29 AND row30 LIKE :row30 AND row34 LIKE :row34  AND row35 LIKE :row35")
    List<QuizModel>selectItemBy14Paramters(String model,String row15,String row16,String row17, String row20,String row21,String row22,String row23, String row25,String row26,String row28,String row29,String row30,
                                           String row34,String row35);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23 AND row25 LIKE :row25 AND row26 LIKE :row26  AND row28 LIKE :row28 AND row29 LIKE :row29 AND row30 LIKE :row30 AND row34 LIKE :row34  AND row35 LIKE :row35 AND row36 LIKE :row36")
    List<QuizModel>selectItemBy15Paramters(String model,String row15,String row16,String row17, String row20,String row21,String row22,String row23, String row25,String row26,String row28,String row29,String row30,
                                           String row34,String row35,String row36);

    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 AND row17 LIKE :row17 AND row20 LIKE :row20 AND row21 LIKE :row21 AND row22 LIKE :row22 AND row23 LIKE :row23 AND row25 LIKE :row25 AND row26 LIKE :row26 AND row28 LIKE :row28 AND row29 LIKE :row29 AND row30 LIKE :row30 AND row34 LIKE :row34  AND row35 LIKE :row35 AND row36 LIKE :row36 AND row37 LIKE :row37")
    List<QuizModel>selectItemBy16Paramters(String model,String row15,String row16,String row17, String row20,String row21,String row22,String row23, String row25,String row26,String row28,String row29,String row30,
                                           String row34,String row35,String row36,String row37);







    @Query("select * from QuizModel WHERE model LIKE :model AND row15 LIKE :row15 AND row16 LIKE :row16 " +
            "AND row17 LIKE :row17" +
            " AND row20 LIKE :row20 AND row21 LIKE :row21 " +
            "AND row22 LIKE :row22 AND row23 LIKE :row23 " +
            "AND row25 LIKE :row25 AND row26 LIKE :row26 " +
            "AND row28 LIKE :row28 AND row29 LIKE :row29 " +
            "AND row30 LIKE :row30 AND row34 LIKE :row34 " +
            "AND row35 LIKE :row35 AND row36 LIKE :row36" +
            " AND row37 LIKE :row37 AND row39 LIKE :row39 ;")
    List<QuizModel> selectAllItems(String model,String row15,String row16,String row17,
                                   String row20,String row21,String row22,String row23,
                                   String row25,String row26,
                                   String row28,String row29,String row30,
                                   String row34,String row35,String row36,String row37,
                                   String row39);

}
