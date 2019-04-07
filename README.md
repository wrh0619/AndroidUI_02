# AndroidUI_02
这是实验三第二题<br>
题目：<br>
 创建如图所示的自定义对话框<br>
 请创建一个如图所示的布局，<br>
 调用 AlertDialog.Builder 对象上的 setView() 将布局添加到
AlertDialog

实验截图：<br>
![image](https://github.com/wrh0619/AndroidUI_02/blob/master/images/%E6%8D%95%E8%8E%B72.JPG)

关键代码：<br>
MainActivity.java
```
 public class MainActivity extends AppCompatActivity {


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
         TableLayout tableLayout = (TableLayout) getLayoutInflater().inflate(R.layout.activity_main,null);
         new AlertDialog.Builder(this).setView(tableLayout).create().show();
     }
 }
```

Activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
 <TableLayout
     xmlns:android="http://schemas.android.com/apk/res/android"
     xmlns:app="http://schemas.android.com/apk/res-auto"
     xmlns:tools="http://schemas.android.com/tools"
     android:layout_width="match_parent"
     android:layout_height="match_parent"
     tools:context=".MainActivity">
         <TableRow>
             <ImageView
                 android:src="@drawable/top"
                 android:layout_width="match_parent"
                 android:layout_height="64dp"
                 android:scaleType="center"
                 />
     </TableRow>
     
         <TableRow>
         <EditText
             android:layout_width="match_parent"
            android:layout_height="wrap_content"
             android:hint="Uername"
             android:textSize="10pt"
             />
     </TableRow>
     
     <TableRow>
         <EditText
             android:layout_width="match_parent"
             android:layout_height="wrap_content"
             android:hint="Password"
             android:textSize="10pt"
             />
 </TableRow>
 
     <LinearLayout
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:orientation="horizontal">
         <Button
             android:id="@+id/Cancel"
             android:layout_width="0dp"
             android:layout_height="match_parent"
             android:layout_gravity="left"
             android:layout_weight="1"
             android:text="Cancel"
              />
         <Button
             android:id="@+id/Signin"
             android:layout_width="0dp"
             android:layout_height="match_parent"
             android:layout_gravity="right"
             android:layout_weight="1"
             android:text="Signin"
  />
 </LinearLayout>
</TableLayout>

```
