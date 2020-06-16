package com.example.medica.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.medica.Adapters.QuestionsAdapter;
import com.example.medica.DataBaseRoom.MyDataBase;
import com.example.medica.DataBaseRoom.QuizModel;
import com.example.medica.R;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class CtActivity extends AppCompatActivity implements View.OnClickListener {

    protected ImageView filter;
    protected RecyclerView recyclerView;

    List<QuizModel>dataList;
    QuestionsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_ct);
        initView();
        showList();
        recyclerView=findViewById(R.id.recycler_view);
        adapter=new QuestionsAdapter(dataList);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.filter) {

        }
    }


    void showList(){
        dataList=new ArrayList<>();

        //=================================================================================================
        //----------------------------------------64-------64----------------------------------------------
        //=================================================================================================

        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm"
                ,"Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm - 16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy,8-in. CATPHAN","290 or more"
                ,"CD-R,DVD","Yes","Yes","Yes","Yes","Yes","MC-standard WS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress）","MC-option WS-option (Neuro or Multi-Organ)"
                ,"MC-option WS-option(CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs))"
                ,"MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option(Lung VCAR)"
                ,"MC-option WS-option(DentaScan)"," "));


        
        dataList.add(new QuizModel("64","Toshiba","Acquilion RXL","image","2012","720mm","±30°","7.5MH","1386KHU/min"
                ,"0.9x0.8mm 1.6x1.4mm","Oil to air","60KW","80,100,120,135KV","10-500mA","100s"
                ,"1,80cm (long couch version) 1,50cm (shortcouch version)","205Kg","0.625-1.5","16images/s(28 option)","1024x1024",
                "windows 7","32","0.5 mm × 16 - 1 mm × 16 - 2 mm × 16 ","32mm","0.5sec (0.4sec option) ",
                "0.5 mm × 16 ,  1 mm × 16  - 2 mm × 16 ,0.5 mm × 4 - 1 mm × 4  ,  2 mm × 4 - 3 mm × 4 ,  4 mm × 4  - 6 mm × 4 8, mm × 4 ","SUREExposure3D",
                "AIDR 3D","MTF0:18lp/cm -  MTF2% 14.5lp/cm - MTF50% 8lp/cm ","3 mm at 0.3% at 16.7mGy ","250Gb or more","CD-R,DVD",
                "Yes","Yes","Yes","Yes","Yes","MC-standard WS-Not available (Real Prep)",
                "MC-option WS-option (vessel probe)","MC-Not available WS-option (sure subtraction)","MC-Not available WS-option (CBP Study)",
                "MC-Not available WS-option (CBP Study)","MC-Not available WS-option (Lung Volume analysis)","MC-Not available WS-option （SURE-Pulmo）",
                "MC-option WS-option (CT DentaScan)"," "));



        dataList.add(new QuizModel("64","Philips","Brilliance CT Big Bore ","image","2004","850mm","±30°","8.0M","1608KHU/min","0.5x1.0/1.0x1.0mm","Oil to air","60KW","90,120,140KV","20-500mA","120s","175cm"
                ,"295Kg","0.04-1.7","up to 30images/s","1024x1024"," ","16"," ","24mm","0.44s/0.29,0.33"," ","DoseRight"," ","16 lp/cm","3mm @ 0.3% ","295","4.7 GB DVD "," "," "," "," "," ","MC-standard WS-Not available (Bolus tracking)",
                "MC-option WS-option AVA  ","-","MC-option WS-option (Functional CT)","MC-Not available WS-option (Functional CT)","MC-Not available WS-option (Lung emphysema)","MC-Not available WS-option (Lung Nodule assessment and Lung CAD)",
                "MC-Not available WS-option（Dental planning）"," "));
        
        //=================================================================================================
        //----------------------------------------16-------16----------------------------------------------
        //=================================================================================================
        
        
        
        dataList.add(new QuizModel("16","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min",
                "0.7×0.6mm 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg","0.5625-1.75",
                "6 images/s(16ips option)","1024x1024","Linux","24",
                "16X0.625mm 16X1.25mm","20mm","0.5sec","8 x 1.25 mm 8 x 2.5 mm 16 x 1.25 mm 16 x 0.625 mm"," 3D-modulation","Asir",
                " MTF0:15.4lp/cm MTF10% 13.9lp/cm MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ",
                "290 or more","CD-R,DVD","Yes","Yes","Yes","Yes"," ","MC-standard WS-Not available(SmartPrep)",
                "MC-option WS-option（AVA Xpress）","MC-option WS-option(Advantage CTC Pro)","MC-option WS-option(CT Perfusion 4 Neuro)",
                "MC-option WS-option(CT Perfusion 4 (Multi-organs)) ","MC-Not available WS-option(Lung VCAR)",
                "MC-Not available WS-option(Lung VCAR)","MC-option WS-option(Neuro or Multi-Organ)","MC-option WS-option(DentaScan)"));
        
        
        dataList.add(new QuizModel("16","GE","GE Optima 520","image","2012","700mm","±30°","3.5M","840KHU/min",
                "0.7x0.6mm 0.9x0.9mm","Oil to air","42KW","80,100,120,140KV","10-350mA","120s","140cm",
                "205Kg","0.5625-1.75","6images/s","512x512","Linux","24","16X0.625mm,8X1.25mm","20mm","0.8s",
                "8x1.25mm,8x2.5,mm,16x0.625mm,16x1.25mm","3D Mudulation ","ASiR*",
                "MTF0:15.4lp/cm MTF10:13.0(10cm DFOV,Edge alg, Small Focus)","5mm @ 0.3% at 13.3 mGy:120 V,100mAs,10mm","254",
                "MOD(images)&DVD(scan data,protocols)(standard)","Standard","Standard","Standard","Standard",
                "Axial,Sagittal,Coronal,Oblique","MC-option","MC-option WS-option","NA","MC-option WS-option ","NA",
                "MC-option WS-option","MC-option WS-option ","MC-option","NA"));
        
        
        dataList.add(new QuizModel("16","GE","GE Brivo CT385 ","image","2011","650mm","±30°Digital Tilt","2.0MHU","500KHU/min",
                "0.6mm×0.8mm","Oil to air","24KW","80,100,120,140KV","10-200mA","60s(90s*)","110cm/152cm",
                "180kg","0.5625-1.75"," 6 images/s(16*)","512x512","Linux","24","16X0.625mm,8X1.25mm",
                "20mm","1.0s","16x0.625mm,16x1.25mm,8x1.25mm,8x2.5,mm, ","3D Mudulation ",
                "ASiR*","MTF0:15.4lp/cm MTF10:13.0(10cm DFOV,Edge alg, Small Focus)",
                "5mm @ 0.3% 20cm catphan phantom at 17.7mGy","584","CD/DVD-RW","Standard","Standard","Standard","Standard",
                "Axial,Sagittal,Coronal,Oblique","MC-option","MC-option WS-option","NA","MC-option WS-option ","NA","NA",
                "NA","MC-option","NA"));
        
        
        dataList.add(new QuizModel("16","GE ","Revolution ACTs","image","2016","650mm","±30°Digital Tilt","2.0MHU","500KHU/min",
                "0.6mm×0.8mm","Oil to air","24KW","80,100,120,140KV","10-200mA","60s(90s*)","110cm/152cm","180kg",
                "0.5625-1.75"," 6 images/s(16*)","512x512","Linux","24","16X1.25mm","20mm","1.0s",
                "16x1.25mm,8x1.25mm,8x2.5,mm,","3D Mudulation ","ASiR*","-","-","584",
                "CD/DVD-RW","Standard","Standard","Standard","Standard","Axial,Sagittal,Coronal,Oblique",
                "MC-option","MC-option WS-option","NA","MC-option WS-option ","NA","NA","NA","MC-option","NA"));



        dataList.add(new QuizModel("16","Toshiba","Alexion 16","image","2011","720mm","±30°","2.0MHU/3.5MHU","336/753KHU/min",
                "1.1x1.3mm1.7x1.7mm",
                "Oil to air","42KW","80,100,120,135kV","10-300mA","100s","100,120,140,150,180cm","205kg","0.625-2.0",
                "15 images/s","512x512","Windows 7","16","16X1mm","16mm","0.75s","16x1mm","SUREExposure","AIDR 3D",
                "MTF2:14.5 lp/cm","2mm @ 0.3% ","233G","CD/DVD-RW",
                "Standard","Standard","Standard","Standard","Axial,Sagittal,Coronal,Oblique","MC-option",
                "MC-option WS-option","NA","MC-option WS-option ","NA","NA","NA","NA","NA"));


        dataList.add(new QuizModel("16","Hitachi","Supria 16","image","2013","750mm","±30°","2.0MHU/5.0MHU",
                "- /748KHU/min","0.7x0.8mm1.2x1.4mm",
                "Oil to air","24kW/48KW","80,100,120,140KV","10-200mA/400mA","100s","120(150cm)",
                "180kg","0.563-1.563","10 images/s","512x512","Windows 7","16","32X0.625mm","20mm",
                "0.75s","16x0.625mm","-","Intelli IP","17.1 lp/cm","2.5mm @ 0.3% ","250GB",
                "CD/DVD-RW","Standard","Standard","Standard","Standard","Axial,Sagittal,Coronal,Oblique",
                "-","-","-","MC-option WS-option","MC-option WS-option","MC-option WS-option","MC-option WS-option",
                "MC-option WS-option","-"));


        dataList.add(new QuizModel("16","Siemens","Scope","image","2014","700mm","±30°","2.0MHU/5.0MHU","500/810 kHU/min -",
                "0.8 x 0.5mm; 0.8 x 0.7 mm","Oil to air","26kW/50kW","80, 110, 130KV","20-200mA/ 345mA","100s",
                "153cm","200kg","0.4 - 2 ","16 images/s","512x512","Windows 7","16",
                "16X0.6mm 8X1.2mm","19.2mm","1.0s/0.6s(0.5s*)","16x0.6mm,16x1.2mm,4x0.6mm","Care Dose 4D ","IRIS","17.5 lp/cm",
                "20 cm CATPHAN: 5 mm, 3 HU, 16 mGy; 16 cm CATPHAN: 3 mm, 3 HU, 21.5 mGy ","683 GB",
                "CD DVD-ROM","Standard","Standard","Standard","Standard","Axial,Sagittal,Coronal,Oblique","MC-option",
                "MC-option WS-option","MC-option WS-option","MC-option WS-option ","MC-option WS-option","MC-option WS-option",
                "MC-option WS-option","MC-option WS-option","NA"));

        
        dataList.add(new QuizModel("16","Siemens","Emotion 16","image","2007","700mm","±30°","5M","810KHU/min",
                "0.5×0.8mm0.7×0.8mm","Oil to air","50KW","80,110,130KV","20-345mA ","100s","150cm",
                "200 Kg","0.4-2.0","16 images/s","1024x1024","Windows XP","24"," 16 x 0.6 mm, 16 x 1.2 mm",
                "19.2mm","0.5sec ","4 x 0.6 mm, 12 x 0.6 mm, 16 x 0.6 mm, 2 x 5 mm, 12 x 1.2 mm,2 x 8 mm, 16 x 1.2 mm",
                "CAREDose 4D ","IRIS","MTF0:17.5lp/cm MTF2:15.6lp/cm ","5mm @ 0.3% at 16 mGy* at 92 0.6 s, 10 mm, 130 kV",
                "965","CD-R,DVD","Yes","Yes","Yes","Yes"," ","MC-standard WS-Not available(CARE Bolus CT)",
                "MC-option WS-option(syngo InSpace4D AVA)","MC-option WS-option(syngo Colonography CT)",
                "MC-optionWS-option syngo Volume Perfusion Neuro CT","MC-option WS-option syngo Volume Perfusion Body CT",
                "MC-option WS-option(syngo LungCARE CT)","MC-option WS-option (syngo Lung CAD)","MC-option WS-option(syngo Neuro DSA CT)",
                "MC-option WS-option（syngo Dental CT）"));


        dataList.add(new QuizModel("16","Siemens","Go Now","image","2016","700mm","±30°","3.5MHU"," "," "," ","32kW(80kW)",
                "80, 110, 130kV","240mA(opt.400mA)600mA(opt.1000mA)"," ","125cm","160kg(opt.227kg)"," "," "," "," ","16",
                " 16X0.7mm","11.2mm","1.5s/1.0s(0.8s*)","16X0.7mm"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," " ));
        


        dataList.add(new QuizModel("16","Philips","Access ","image","2017","650mm","±30°Digital Tilt","3.5MHU","667KHU/min",
                "0.4x0.7mm 0.6x1.3mm","Oil to air","28kW","70, 80,100,120,140KV","10-233mA","100s","120cm over 147cm",
                "150Kg","0.5-1.5","10 images/s","1024x1025","Windows 7","16","16X0.8mm","12.8mm","0.75s",
                "2X0.8mm 12X0.8mm 16X0.8mm","iDose"," ","15±10% lp/cm @ 0% MTF","3.0 mm @ 0.3% [<40mGy, 20 cm Catphan]",
                "1T","CD/DVD-RW"," "," "," "," "," "," "," ",
                " "," "," "," "," "," "," " ));

        
        dataList.add(new QuizModel("16","Philips","Brilliance 16-Slice ","image","2008","700mm","±30°","5.0M(8.0M option)",
                "815KHU/min(1608 option)","0.5x1.0mm 1.0x1.0mm","Oil to air","48kW(60KW)","90,120,140KV","20-400mA(500mA  option)",
                "100s","175cm","204Kg（295Kg option）","0.13-1.7","6images/s/(20 option","1024x1024","Windows XP","24",
                "16X0.75mm 16X1.5mm","24mm","0.5sec(0.4sec is option for 8MH Tube)",
                "0.6 mm × 2,0.75 mm ×16 - 1.5mm × 16,8 mm × 3 4.5mm × 4","Dose Wise","NA",
                "MTF0:24lp/cm MTF10:16lp/cm MTF50:8lp/cm","4mm @ 0.3% (120kV,250mAs 9mm,27mGy)","292Gb","CD R,DVD",
                "Yes","Yes","Yes","Yes"," ","MC-standard WS-Not available(Bolus tracking)","MC-option WS-option AVA  ",
                "MC-Not available WS-option(CT Virtual Colonoscopy)","MC-option WS-option (Functional CT)",
                "MC-Not available WS-option(Functional CT)","MC-Not available WS-option(Lung emphysema)",
                "MC-Not available WS-option(Lung Nodule assessment and Lung CAD)","-","MC-Not available WS-option（Dental planning）"));

        
        dataList.add(new QuizModel("16","GE","Optima CT520","image","2012","700mm","±30°","3.5M","820KHU/min",
                "0.8x0.5mm 1.1x1.0mm","Oil to air","42KW","80,100,120,140KV","10-350mA (5 increments )",
                "120s","162cm","205 Kg","0.5625-1.75","16images/s","512x512"," ","24",
                "16X0.625mm 8X1.25mm","20mm","0.8s","16x0.625,16x1.25 8x1.25,8x2.5,4x1.25,2x0.625",
                "3D Does Modulation","ASIR*","MTF0:15.4lp/cm MTF10:13.0lp/cm (10cm DFOV,Edge alg, Small Focus)",
                "5mm @ 0.3% at 13.3 mGy:120 V, 100mAs,10mm 3mm @0.30% at 37.2mGy","584GB","CD-RW/DVD-RW","MC-standard WS-standard",
                "MC-option WS-standard","MC-option WS-standard","MC-option WS-standard",
                "Axial,para-axial,sagittal, coronal, oblique, curvilinear","standard","option","N/A","option","option",
                "option","option","option","N/A"));


        dataList.add(new QuizModel("16","Siemens","Scope Power","image","2015","700mm","±30°","5M","810KHU/min",
                "0.5×0.8mm 0.7×0.8mm","Oil","50KW","80,110,130KV","20-345mA (1 increments)","100s","160cm",
                "200 Kg","0.4-2.0","8 images/s 16 images/s option","512x512"," ","24","16X0.6mm 8X1.2mm","19.2mm",
                "0.6s 0.5s option","16x0.6,16x1.2,4x0.6","CAREDose 4D","IRIS","MTF0:17.5lp/cm MTF2:15.6lp/cm (160 mAs, 130 kV, 1 s, 2.4 mm)",
                "5mm @ 0.3% at 12.88 mGy 130kV,90mAs,0.6 sec,10mm","683GB","CD-RW/DVD-RW","MC-standard WS-standard",
                "MC-standard WS-standard","MC-standard WS-standard","MC-standard WS-standard","Axial,sagittal,coronal , oblique, curvilinear.",
                "standard","standard","option","option","option","option","option","option","N/A"));

        

        dataList.add(new QuizModel("16","Toshiba","Alexion","image","2013","720mm","±30°",
                "2M 3.5M option","336/735KHU/min","1.1×1.3,1.7×1.7 1.1×1.1,1.7×1.7","Oil","42KW","80,100,120,135KV",
                "10-300mA","50s/100s","153cm 183cm option","205Kg","0.625-2.0","15images/s","512x512"," ","16",
                "16X1.0mm","16mm","0.75s","16X1, 4X1, 4X2,4X3, 4X4","SUREExposure 3D","AIDR 3D","14.5lp/cm@2%MTF",
                "2.0mm @0.3%","N/A","CD-RW/DVD-RW","MC-standard WS-standard","MC-standard WS-standard",
                "MC-standard WS-standard","MC-standard WS-standard","Axial,sagittal,coronal, oblique, curvilinear.",
                "option","option","N/A","option","N/A","option","option","option","N/A"));
        
        
        dataList.add(new QuizModel("16","Toshiba","Alexion Advanced Edition","image","2015","720mm","±30°","4MHU","864KHU/min",
                "0.9×0.7mm 1.4×1.4mm","Oil","42KW","80,100,120,135KV","10-300mA","100s",
                "153cm 183cm option","205Kg","0.625-2.0","15images/s","512x512"," ","28","16X0.5+12X1mm","20mm",
                "0.75s 0.6s option","16x0.5, 16x1, 4x0.5, 4x1, 4x2, 4x3, 4x4, 4x5","SUREExposure 3D","AIDR 3D",
                "18Lp/cm@0%MTF 200mA, 120kV, 1.5s, 10mm","2.0mm @0.3%","480GB","CD-RW/DVD-RW","MC-standard WS-standard",
                "MC-standard WS-standard","MC-standard WS-standard","MC-standard WS-standard","Axial,sagittal,coronal, oblique, curvilinear.",
                "option","option","N/A","option","N/A","option","option","option","N/A"));

        
        dataList.add(new QuizModel("16","Toshiba","Aquilion Lightning","image","2015","780mm","±30°","2M 5M option", "------","------","Oil","42KW","80,100,120,135KV","10-300mA","100s","------","------","------",
                "15images/s","512x512"," ","------","------","------","0.75s 0.6s option","------",
                "SUREExposure 3D","AIDR 3D","------","2.0mm @0.3%","------","CD-RW/DVD-RW","MC-standard WS-standard",
                "MC-standard WS-standard","MC-standard WS-standard","MC-standard WS-standard","Axial,sagittal,coronal, oblique, curvilinear.",
                "option","option","N/A","option","N/A","option","option","option","N/A"));


        dataList.add(new QuizModel("16","Hitachi","Supria 16","image","2014","750mm","±30°","5.0M","748KHU/min",
                "0.7x0.8mm 1.2x1.4mm","Oil to air","48KW","80,100,120,140KV","10-400mA","100s","150cm","180Kg",
                "0.563-1.563","10 images/s","512x512"," ","32","32X0.625mm","20mm","0.75s","8x1.25,8x2.5,16x0.625,16x1.25",
                "Adaptive mA","Intelli IP","17.1lp/cm","2.5mm@0.25%",">=250GB","CD-RW/DVD-RW","MC-standard WS-standard",
                "MC-standard WS-standard","MC-standard WS-standard","MC-standard WS-standard","Axial,sagittal,coronal, oblique,curvilinear.", "option","standard","N/A","option","N/A","option","option","option","N/A"));


        dataList.add(new QuizModel("16","Philips","Mx 16 EVO","image","2009","700mm","±30°","5.0M","815KHU/min",
                "0.5x1.3mm 1.0x1.3mm","Oil to air","50KW","90,120,140KV","30-420mA","100s","150cm","200 Kg",
                "0.5-1.5","up to 20images/s","1024x1024"," ","24","16X0.75mm 8X1.5mm","24mm","0.5s",
                "16x1.5, 12 x1.5, 10 x1.5, 16x0.75, 12x0.75, 10 x0.75, 8x0.75, 4x0.75, 2x0.75","DoseRight","iDose 4",
                "MTF0:15lp/cm (head phantom should be no more than 40mGy)","2mm @ 0.3% (head phantom should be no more than 40mGy)","500",
                "CD-RW/DVD-RW","MC-standard WS-standard","MC-standard WS-standard","MC-standard WS-standard",
                "MC-standard WS-standard","Axial,sagittal, coronal, oblique, curvilinear.","option","option","option",
                "option","N/A","option","option","option","N/A"));



        //=================================================================================================
        //----------------------------------------128-------128--------------------------------------------
        //=================================================================================================


        dataList.add(new QuizModel("128","GE"," GE Optima CT660","image","2010","700mm","±30°","6.3MHU"," 840KHU/min",
                " 0.6 x 0.7mm/0.9 x 0.9mm","Oil to air","  72KW","80,100,120,140KV"," 10-600mA","60s",
                "174.5 cm ","227kg","0.16-1.375"," 16 images/s","512x512","LINUX","64","64X0.625mm",
                "40mm","0.4s (0.35 *)","128x0.625, 64x0.625, 32x0.625, 16x0.625, 8x0.625, 4x0.625,","SmartmA™ and AutomA",
                "ASIR","4%MTF 14.2lp/cm,50%MTF 10.1lp/cm,","3 mm@0.32% 22.2mGy ","1792","CD-R,DVD",
                "Yes","Yes","Yes","Yes","Yes","MC-standard WS-Not available(SmartPrep)",
                "MC-option WS-option(Advanced Vessel Analysis)","MC-option WS-option(Neuro or Multi-Organ)",
                "MC-option WS-option(CT Perfusion 4 Neuro)","MC-option WS-option(CT Perfusion 4 (Multi-organs)) ",
                "MC-Not available WS-option(Lung VCAR)","MC-Not available WS-option(Lung VCAR)","MC-option WS-option(DentaScan)","-"));


        dataList.add(new QuizModel("128","Siemens","SOMATOM Perspective","image","2012","700mm","±30°","   6.0MHU","810KHU/min",
                "0.8 x 0.5mm/0.8 x 0.7mm","oil air","55kW","80,110,130KV","20-345mA","100s","160cm","207kg",
                " 0.2-1.5","20 images/s","512x512","windows XP","64","64 x 0.6 mm","38.4mm","0.6s (0.48s *) ",
                "128x0.6, 64x0.6, 32x0.6, 12x0.6, 4x0.6, 32x1.2 ","CARE Dose 4D","SAFIR *",
                "0%MTF 17.5lp/cm, 10%MTF 13.8lp/cm, 50%MTF 10.1lp/cm,  ","5mm @ 0.3% 12.8 mGy* at 86 mAs","650G",
                "CD-R,DVD","Yes","Yes","Yes","Yes","Yes","MC-standard WS-Not available(CARE Bolus CT)",
                "MC-option WS-option (syngo InSpace4D AVA)","MC-option WS-option(syngo Neuro DSA CT)",
                "MC-option WS-option syngo Volume Perfusion Neuro CT","MC-option WS-option syngo Volume Perfusion Body CT",
                "MC-option WS-option(syngo LungCARE CT)","MC-option WS-option(syngo Lung CAD)",
                "MC-optionWS-option（syngo Dental CT）","MC-Not available WS-option (syngo.CT Oncology)"));


        dataList.add(new QuizModel("128","Toshiba","Aquilion CXL","image","2012","72cm","±30°","7.5MHU"," 1368KHU/min",
                "0.9 x 0.8mm/1.6 x 1.4mm","oil air","60 KW"," 80,100,120,135KV"," 10-500mA","100s","150cm",
                "205kg"," 0.15-1.5","30 images/s","512x512","LINUX","64","64 x 0.5 mm","32mm"," 0.4s (0.35s *)",
                " 128x0.5, 64x0.5, 32x0.5, 32x1, 16x2 4x0.5  4x1  4x2 4x3  4x4  4x6  4x8 ","SUREExposureTM 3D Adaptive","AIDR 3D *",
                "0%MTF 18lp/cm 2%MTF 14.5lp/cm  ","2mm @ 0.3% 35.6 mGy* at 320 mAs","1Tb",
                "CD-R,DVD","Yes","Yes","Yes","Yes","Yes","MC-standard WS-Not available(Real Prep)",
                "MC-option WS-option(vessel probe)","MC-Not available WS-option(sure subtraction)","MC-Not available WS-option(CBP Study)",
                "MC-Not available WS-option (CBP Study)","MC-Not available WS-option(Lung Volume analysis)",
                "MC-Not available WS-option(SURE-Pulmo)","MC-option WS-option(CT DentaScan)","-"));


        dataList.add(new QuizModel("128","Philips","Ingenuity Core ","image","2012","700mm","±30°","8.0 MHU","1,608 kHUmin ",
                "0.5 x 1.0mm/1.0 x 1.0mm","oil air","80 kW","80,100,120,140kV","20–665mA","100s","186cm","204kg",
                " 0.13-1.5","20 images/s","1024x1024","windows XP","64","64X0.625mm","40mm","0.5s (0.4s *) ",
                "128x0.625, 64x0.625, 32x0.625, 16x0.625, 8x0.625, 4x0.625,2x0.625","Dose Right,iPatient","iDose4 *",
                "0%MTF 24lp/cm, 10%MTF 16lp/cm, 50%MTF 13lp/cm,  ","2mm@ 0.3% 10.4 mGy CTDIvol ","262Gb",
                "CD-R,DVD","Yes","Yes","Yes","Yes","Yes","MC-standard WS-Not available(Bolus tracking)",
                "MC-option WS-option(AVA)  ","NA","MC-option WS-option(Brain perfusion)","MC-Not available WS-option(Body Perfusion)",
                "MC-Not available WS-option (Lung emphysema)","MC-Not available WS-option (Lung Nodule assessmentand Lung CAD)",
                "MC-Not available WS-option（Dental planning）","-"));

        
        dataList.add(new QuizModel("128","Hitachi ","Scenaria","image","2012","75cm","±30°"," 7.5MHU","1,380 kHU/min",
                "0.7 x 0.8mm/ 1.2 x 1.4 mm","oil air","72kW","80,100,120,140kV","10-600mA ","100s","  175cm","230kg",
                "0.56-1.578 ","up to 35 images/s","512x512","Linux","64","64X0.625mm","40mm","0.35s",
                "128x0.625, 64x0.625, 32x0.625, 16x0.625, 8x0.625, 4x0.625,2x0.625",
                "Intelli EC,3-D mA modulation "," Intelli IP ","0% MTF@17.18lp/cm 50% MTF@12.21lp/cm",
                "2.5mm @ 0.25% ","1250Gb","CD-R,DVD","Yes","Yes","Yes","Yes","Yes",
                "MC-standard WS-Not available(Predict Scan)","MC-standard WS-standard(Vessel Analysis)",
                "MC-Not available WS-option(CTA-CT Subtraction)","MC-Not available WS-option(Time-Volume Analysis )",
                "MC-Not available WS-option (Time Dependent Analysis )","MC-Not available WS-option(Lung Analysis)",
                "MC-Not available WS-option(Segmentation Analysis & Tracking)","MC-Not available WS-option Dental Analysis","-"));



    }



    private void initView() {
        filter = (ImageView) findViewById(R.id.filter);
        filter.setOnClickListener(CtActivity.this);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }
}
