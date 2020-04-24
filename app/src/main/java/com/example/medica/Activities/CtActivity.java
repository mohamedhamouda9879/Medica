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
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
        ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
        ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,"")); dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));
        dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,"")); dataList.add(new QuizModel("64","GE","Optima CT540","image","2012","700mm","±30°","6.3M","840KHU/min","0.7×0.6mm - 0.9×0.9mm","Oil to air","53.2KW","80,100,120,140KV","10 - 440mA","120 sec","170cm","227Kg"
                ,"0.5625-1.75","6 images/s(16ips option)","1024x1024","Linux","HiLight Ceramic Matrix II ","21,888","24","16X0.625mm - 16X1.25mm"
                ,"20mm","0.5sec","8 x 1.25 mm - 8 x 2.5 mm -16 x 1.25 mm - 16 x 0.625 mm"," 3D-modulation","Asir"," MTF0:15.4lp/cm - MTF10% 13.9lp/cm - MTF50% 10.2lp/cm ","5mm @ 0.3% at 13.3 mGy ,8-in. CATPHAN ","290 or more"
                ,"CD-R,DVD","YES","YES","YES","YES"
                ,"YES","MC-standardWS-Not available(SmartPrep)","MC-option WS-option（AVA Xpress)","MC--optionWS-option(SmartScore)"
                ,"MC--optionWS-option(CardIQ Xpress 2 )","MC-Not availableWS-option(CardIQ Function Xpress)","MC-optionWS-option(Neuro or Multi-Organ)","MC-option WS-option (CT Perfusion 4 Neuro)","MC-option WS-option (CT Perfusion 4 (Multi-organs)) "
                ,"MC-option WS-option (Advantage CTC Pro)","MC-Not available WS-option (Lung VCAR)","MC-Not available WS-option (Lung VCAR)","MC-option WS-option (DentaScan)"
                ,""));




    }

















    private void initView() {
        filter = (ImageView) findViewById(R.id.filter);
        filter.setOnClickListener(CtActivity.this);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }
}
