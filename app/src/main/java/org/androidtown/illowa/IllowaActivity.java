package org.androidtown.illowa;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class IllowaActivity extends ActionBarActivity {

    private Toolbar toolbar;
    ListView listView1;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illowa);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        listView1 = (ListView) findViewById(R.id.listView1);
        adapter = new ListAdapter(this);

        Resources res = getResources();
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon05), "�߾��� ��Ʈ����", "30,000 �ٿ�ε�", "900 ��"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon06), "���� - ��ȣ�� ����", "26,000 �ٿ�ε�", "1500 ��"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon05), "ģ��ã�� (Friends Seeker)", "300,000 �ٿ�ε�", "900 ��"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon06), "���� �˻�", "120,000 �ٿ�ε�", "900 ��"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon05), "����ö �뼱�� - ����", "4,000 �ٿ�ε�", "1500 ��"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon06), "����ö �뼱�� - ����", "6,000 �ٿ�ε�", "1500 ��"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon05), "����ö �뼱�� - LA", "8,000 �ٿ�ε�", "1500 ��"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon06), "����ö �뼱�� - ������", "7,000 �ٿ�ε�", "1500 ��"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon05), "����ö �뼱�� - �ĸ�", "9,000 �ٿ�ε�", "1500 ��"));
        adapter.addItem(new IconTextItem(res.getDrawable(R.drawable.icon06), "����ö �뼱�� - ������", "38,000 �ٿ�ε�", "1500 ��"));

        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               IconTextItem curItem = (IconTextItem) adapter.getItem(position);
                String[] curData = curItem.getData();
                Toast.makeText(getApplicationContext(), "selected : " + curData[0], Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_illowa, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
