package act.gg.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button btn_REGISTRAR=(Button)findViewById(R.id.btn_REGISTRAR);

        btn_REGISTRAR.setOnDragListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){

            EditText tv_nombre = (EditText)findViewById(R.id.name_edit);
            EditText tv_apellido = (EditText)findViewById(R.id.last_name_edit);
            EditText tv_numerodetarjeta=(EditText)findViewById(R.id.credit_card_edit);
            EditText tv_mes=(EditText)findViewById(R.id.month_edit);
            EditText tv_año=(EditText)findViewById(R.id.year_edit);
            EditText tv_codigo=(EditText)findViewById(R.id.code_edit);
            EditText tv_calleynumero=(EditText)findViewById(R.id.place_edit);
            EditText tv_ciudad=(EditText)findViewById(R.id.city_edit);
            EditText tv_estado=(EditText)findViewById(R.id.state_edit);
            EditText tv_codigopostal=(EditText)findViewById(R.id.code_postal_edit);

            u1.setNombre(txt_nombre.getText().toString());
            u1.setApellidos(txt_apellido.getText().toString());
            u1.setNumerodetarjeta(txt_numerodetarjeta.getText().toString());
            u1.setMes(txt_mes.getText().toString());
            u1.setAño(txt_año.getText().toString());
            u1.setCodigo(txt_codigo.getText().toString());
            u1.setCalleynumero(txt_calleynumero.getText().toString());
            u1.setCiudad(txt_ciudad.getText().toString());
            u1.setEstado(txt_estado.getText().toString());
            u1.setCodigopostal(txt_codigopostal.getText().toString());

            AdminSQLiteOpenHelper base = new AdminSQLiteOpenHelper(MainActivity.this, "Usuario", null, 1);
            SQLiteDatabase db = base.getWritableDatabase();
            // Toast.makeText(MainActivity.this, e1.getNombre(), Toast.LENGTH_LONG).show();

            Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);

            detailIntent.putExtra("el_nombre", u1.getNombre());
            detailIntent.putExtra("el_apellido", u1.getApellidos());
            detailIntent.putExtra("la_edad", u1.getEdad());

            startActivity(detailIntent);
        }
    });


}



}