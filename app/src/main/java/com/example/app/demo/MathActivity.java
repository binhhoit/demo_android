package com.example.app.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MathActivity extends AppCompatActivity {

    private EditText etNumberA;
    private EditText etNumberB;
    private EditText etNumberC;

    private Button btnResult;

    private TextView tvDenta;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        initFindViewByIds();

        processMath();
    }


    //ánh xạ với UI
    private void initFindViewByIds() {
        etNumberA = findViewById(R.id.activity_math_et_number_a);
        etNumberB = findViewById(R.id.activity_math_et_number_b);
        etNumberC = findViewById(R.id.activity_math_et_number_c);
        btnResult = findViewById(R.id.activity_math_btn_count);
        tvDenta = findViewById(R.id.activity_math_tv_denta);
        tvResult = findViewById(R.id.activity_math_tv_result);
    }

    private void processMath() {
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ép kiểu chuyển kiểu float "ví dụ: 0.12" mặc định kiểu chuổi "String"
                float numberA = Float.valueOf(etNumberA.getText().toString());
                float numberB = Float.valueOf(etNumberB.getText().toString());
                float numberC = Float.valueOf(etNumberC.getText().toString());
                float denta = 0;
                // tính denta


                // phép toán tử  == so sánh bằng , Math.sqrt(...) tính căn bậc 2
                if (numberA == 0) {
                    tvDenta.setText("Phương trình sai");
                    tvResult.setText("Phương trình sai");
                } else {
                    denta = numberB * numberB - 4 * numberA * numberC;

                    if (denta < 0) {
                        tvDenta.setText(String.valueOf(denta));
                        tvResult.setText("Phương trình vô nghiệm");
                    } else {
                        if (denta == 0) {
                            tvDenta.setText(0);
                            float result = -numberB / (2 * numberA);
                            tvResult.setText("Phương trình có nghiệm kép:\n" +
                                    " x1=x2=" + result);
                        } else {
                            tvDenta.setText(String.valueOf(denta));
                            double resultX1 = (-numberB + Math.sqrt(denta)) / (2 * numberA);
                            double resultX2 = (-numberB - Math.sqrt(denta)) / (2 * numberA);
                            tvResult.setText("Phương trình có 2 nghiệm là:\n x1= "
                                    + resultX1 + "\nx2 = " + resultX2);

                        }
                    }

                }
            }
        });
    }
}
