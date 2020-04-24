package com.example.medica.DataBaseRoom;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class QuizModel {

    @PrimaryKey(autoGenerate = true)
    int id ;

    @ColumnInfo
    String model;
    @ColumnInfo
    String row7;
    @ColumnInfo
    String row8;
    @ColumnInfo
    String row9;
    @ColumnInfo
    String row10;
    @ColumnInfo
    String row12;
    @ColumnInfo
    String row13;
    @ColumnInfo
    String row15;
    @ColumnInfo
    String row16;
    @ColumnInfo
    String row17;
    @ColumnInfo
    String row18;
    @ColumnInfo
    String row20;
    @ColumnInfo
    String row21;
    @ColumnInfo
    String row22;
    @ColumnInfo
    String row23;
    @ColumnInfo
    String row25;
    @ColumnInfo
    String row26;
    @ColumnInfo
    String row28; @ColumnInfo
    String row29; @ColumnInfo
    String row30; @ColumnInfo
    String row31;  @ColumnInfo
    String row33;
    @ColumnInfo
    String row34; @ColumnInfo
    String row35; @ColumnInfo
    String row36;
    @ColumnInfo
    String row37;
    @ColumnInfo
    String row39;
    @ColumnInfo
    String row40;
    @ColumnInfo
    String row42; @ColumnInfo
    String row43; @ColumnInfo
    String row45; @ColumnInfo
    String row46; @ColumnInfo
    String row48; @ColumnInfo
    String row49;
     @ColumnInfo
    String row51;
     @ColumnInfo
    String row52; @ColumnInfo
    String row53; @ColumnInfo
    String row54; @ColumnInfo
    String row55;
    @ColumnInfo
    String row57;
    @ColumnInfo
    String row58;
    @ColumnInfo
    String row59;
    String row60; @ColumnInfo
    String row61; @ColumnInfo
    String row62; @ColumnInfo
    String row63; @ColumnInfo
    String row64; @ColumnInfo
    String row65; @ColumnInfo
    String row66; @ColumnInfo
    String row67;@ColumnInfo
    String row68; @ColumnInfo
    String row69;


    @Ignore
    public QuizModel() {
    }

    public QuizModel(String model,String row7, String row8, String row9, String row10, String row12, String row13, String row15, String row16, String row17, String row18, String row20, String row21, String row22, String row23, String row25, String row26, String row28, String row29, String row30, String row31, String row33, String row34, String row35, String row36, String row37, String row39, String row40, String row42, String row43, String row45, String row46, String row48, String row49, String row51, String row52, String row53, String row54, String row55, String row57, String row58, String row59, String row60, String row61, String row62, String row63, String row64, String row65, String row66, String row67, String row68, String row69) {

        this.model=model;
        this.row7 = row7;
        this.row8 = row8;
        this.row9 = row9;
        this.row10 = row10;
        this.row12 = row12;
        this.row13 = row13;
        this.row15 = row15;
        this.row16 = row16;
        this.row17 = row17;
        this.row18 = row18;
        this.row20 = row20;
        this.row21 = row21;
        this.row22 = row22;
        this.row23 = row23;
        this.row25 = row25;
        this.row26 = row26;
        this.row28 = row28;
        this.row29 = row29;
        this.row30 = row30;
        this.row31 = row31;
        this.row33 = row33;
        this.row34 = row34;
        this.row35 = row35;
        this.row36 = row36;
        this.row37 = row37;
        this.row39 = row39;
        this.row40 = row40;
        this.row42 = row42;
        this.row43 = row43;
        this.row45 = row45;
        this.row46 = row46;
        this.row48 = row48;
        this.row49 = row49;
        this.row51 = row51;
        this.row52 = row52;
        this.row53 = row53;
        this.row54 = row54;
        this.row55 = row55;
        this.row57 = row57;
        this.row58 = row58;
        this.row59 = row59;
        this.row60 = row60;
        this.row61 = row61;
        this.row62 = row62;
        this.row63 = row63;
        this.row64 = row64;
        this.row65 = row65;
        this.row66 = row66;
        this.row67 = row67;
        this.row68 = row68;
        this.row69 = row69;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRow7() {
        return row7;
    }

    public void setRow7(String row7) {
        this.row7 = row7;
    }

    public String getRow8() {
        return row8;
    }

    public void setRow8(String row8) {
        this.row8 = row8;
    }

    public String getRow9() {
        return row9;
    }

    public void setRow9(String row9) {
        this.row9 = row9;
    }

    public String getRow10() {
        return row10;
    }

    public void setRow10(String row10) {
        this.row10 = row10;
    }

    public String getRow12() {
        return row12;
    }

    public void setRow12(String row12) {
        this.row12 = row12;
    }

    public String getRow13() {
        return row13;
    }

    public void setRow13(String row13) {
        this.row13 = row13;
    }

    public String getRow15() {
        return row15;
    }

    public void setRow15(String row15) {
        this.row15 = row15;
    }

    public String getRow16() {
        return row16;
    }

    public void setRow16(String row16) {
        this.row16 = row16;
    }

    public String getRow17() {
        return row17;
    }

    public void setRow17(String row17) {
        this.row17 = row17;
    }

    public String getRow18() {
        return row18;
    }

    public void setRow18(String row18) {
        this.row18 = row18;
    }

    public String getRow20() {
        return row20;
    }

    public void setRow20(String row20) {
        this.row20 = row20;
    }

    public String getRow21() {
        return row21;
    }

    public void setRow21(String row21) {
        this.row21 = row21;
    }

    public String getRow22() {
        return row22;
    }

    public void setRow22(String row22) {
        this.row22 = row22;
    }

    public String getRow23() {
        return row23;
    }

    public void setRow23(String row23) {
        this.row23 = row23;
    }

    public String getRow25() {
        return row25;
    }

    public void setRow25(String row25) {
        this.row25 = row25;
    }

    public String getRow26() {
        return row26;
    }

    public void setRow26(String row26) {
        this.row26 = row26;
    }

    public String getRow28() {
        return row28;
    }

    public void setRow28(String row28) {
        this.row28 = row28;
    }

    public String getRow29() {
        return row29;
    }

    public void setRow29(String row29) {
        this.row29 = row29;
    }

    public String getRow30() {
        return row30;
    }

    public void setRow30(String row30) {
        this.row30 = row30;
    }

    public String getRow31() {
        return row31;
    }

    public void setRow31(String row31) {
        this.row31 = row31;
    }

    public String getRow33() {
        return row33;
    }

    public void setRow33(String row33) {
        this.row33 = row33;
    }

    public String getRow34() {
        return row34;
    }

    public void setRow34(String row34) {
        this.row34 = row34;
    }

    public String getRow35() {
        return row35;
    }

    public void setRow35(String row35) {
        this.row35 = row35;
    }

    public String getRow36() {
        return row36;
    }

    public void setRow36(String row36) {
        this.row36 = row36;
    }

    public String getRow37() {
        return row37;
    }

    public void setRow37(String row37) {
        this.row37 = row37;
    }

    public String getRow39() {
        return row39;
    }

    public void setRow39(String row39) {
        this.row39 = row39;
    }

    public String getRow40() {
        return row40;
    }

    public void setRow40(String row40) {
        this.row40 = row40;
    }

    public String getRow42() {
        return row42;
    }

    public void setRow42(String row42) {
        this.row42 = row42;
    }

    public String getRow43() {
        return row43;
    }

    public void setRow43(String row43) {
        this.row43 = row43;
    }

    public String getRow45() {
        return row45;
    }

    public void setRow45(String row45) {
        this.row45 = row45;
    }

    public String getRow46() {
        return row46;
    }

    public void setRow46(String row46) {
        this.row46 = row46;
    }

    public String getRow48() {
        return row48;
    }

    public void setRow48(String row48) {
        this.row48 = row48;
    }

    public String getRow49() {
        return row49;
    }

    public void setRow49(String row49) {
        this.row49 = row49;
    }

    public String getRow51() {
        return row51;
    }

    public void setRow51(String row51) {
        this.row51 = row51;
    }

    public String getRow52() {
        return row52;
    }

    public void setRow52(String row52) {
        this.row52 = row52;
    }

    public String getRow53() {
        return row53;
    }

    public void setRow53(String row53) {
        this.row53 = row53;
    }

    public String getRow54() {
        return row54;
    }

    public void setRow54(String row54) {
        this.row54 = row54;
    }

    public String getRow55() {
        return row55;
    }

    public void setRow55(String row55) {
        this.row55 = row55;
    }

    public String getRow57() {
        return row57;
    }

    public void setRow57(String row57) {
        this.row57 = row57;
    }

    public String getRow58() {
        return row58;
    }

    public void setRow58(String row58) {
        this.row58 = row58;
    }

    public String getRow59() {
        return row59;
    }

    public void setRow59(String row59) {
        this.row59 = row59;
    }

    public String getRow60() {
        return row60;
    }

    public void setRow60(String row60) {
        this.row60 = row60;
    }

    public String getRow61() {
        return row61;
    }

    public void setRow61(String row61) {
        this.row61 = row61;
    }

    public String getRow62() {
        return row62;
    }

    public void setRow62(String row62) {
        this.row62 = row62;
    }

    public String getRow63() {
        return row63;
    }

    public void setRow63(String row63) {
        this.row63 = row63;
    }

    public String getRow64() {
        return row64;
    }

    public void setRow64(String row64) {
        this.row64 = row64;
    }

    public String getRow65() {
        return row65;
    }

    public void setRow65(String row65) {
        this.row65 = row65;
    }

    public String getRow66() {
        return row66;
    }

    public void setRow66(String row66) {
        this.row66 = row66;
    }

    public String getRow67() {
        return row67;
    }

    public void setRow67(String row67) {
        this.row67 = row67;
    }

    public String getRow68() {
        return row68;
    }

    public void setRow68(String row68) {
        this.row68 = row68;
    }

    public String getRow69() {
        return row69;
    }

    public void setRow69(String row69) {
        this.row69 = row69;
    }
}
