package jingou.jo.com.greendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        增加操作id必须是Long类型的
        Shop shop = new Shop();
        shop.setName("乔石");
        shop.setId(1L);
        shop.setAddress("北京八维");
        shop.setImage_url("GGG");
        shop.setSell_num(1);

      LoveDao.insertLove(shop);
//
////        查找
        List<Shop> list = LoveDao.queryAll();
        Log.e("TAG",list.toString()+"");

    }
}
