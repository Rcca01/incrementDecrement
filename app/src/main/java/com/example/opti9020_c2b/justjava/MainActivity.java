/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 *
 * package com.example.android.justjava;
 *
 */

package com.example.opti9020_c2b.justjava;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void increment(View view){
        display(1);
    }

    public void decrement(View view){
        display(-1);
    }

    public void submitOrder(View view) {
        int valor_atualizado = getValorDisplay();
        displayPrice(valor_atualizado);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private int display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        String text = quantityTextView.getText().toString();
        int quantidade = Integer.parseInt(text);
        quantityTextView.setText("" + (quantidade+number));
        return quantidade+number;
    }

    private int getValorDisplay(){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        String text = quantityTextView.getText().toString();
        int quantidade = Integer.parseInt(text);
        return quantidade;
    }

    private void displayPrice(int number){
        TextView priceTextView = (TextView) findViewById(R.id.valor_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
