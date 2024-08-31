package com.example.androidactivities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // variable for text expression
    String expression = "";
    TextView txt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Identify all the buttons
        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        Button del = findViewById(R.id.delBtn);
        Button equal = findViewById(R.id.btnEqual);

        Button add = findViewById(R.id.btnAdd);
        Button sub = findViewById(R.id.btnSubstract);
        Button div = findViewById(R.id.btnDivide);
        Button mul = findViewById(R.id.btnMultiply);
        Button dot = findViewById(R.id.btnDot);

        Button mod = findViewById(R.id.btnMod);

        txt = findViewById(R.id.textViewId);


        // Set listeners for operation buttons
        btn0.setOnClickListener(v -> appendToExpression("0"));
        btn1.setOnClickListener(v -> appendToExpression("1"));
        btn2.setOnClickListener(v -> appendToExpression("2"));
        btn3.setOnClickListener(v -> appendToExpression("3"));
        btn4.setOnClickListener(v -> appendToExpression("4"));
        btn5.setOnClickListener(v -> appendToExpression("5"));
        btn6.setOnClickListener(v -> appendToExpression("6"));
        btn7.setOnClickListener(v -> appendToExpression("7"));
        btn8.setOnClickListener(v -> appendToExpression("8"));
        btn9.setOnClickListener(v -> appendToExpression("9"));

        add.setOnClickListener(v -> appendToExpression("+"));
        sub.setOnClickListener(v -> appendToExpression("-"));
        mul.setOnClickListener(v -> appendToExpression("*"));
        div.setOnClickListener(v -> appendToExpression("/"));
        mod.setOnClickListener(v -> appendToExpression("%"));
        dot.setOnClickListener(v -> appendToExpression("."));

        equal.setOnClickListener(v -> appendToExpression("="));
        del.setOnClickListener(v -> clearAll());
    }

    void appendToExpression(String value) {
        expression = expression + value;
        txt.setText(expression);
    }

    void clearAll() {
        expression = "";
        txt.setText(expression);
    }
}