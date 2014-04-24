package com.example.intenciones;

import android.app.Activity;
import android.app.Fragment;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

	public void pgWeb(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://www.androidcurso.com/"));
		startActivity(intent);
	}

	public void llamadaTelefono(View view) {
		Intent intent = new Intent(Intent.ACTION_CALL,
				Uri.parse("tel:677037787"));
		startActivity(intent);
	}

	public void googleMaps(View view) {
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("geo:41.656313,-0.877351"));
		startActivity(intent);
	}

	public void tomarFoto(View view) {
		Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
		startActivity(intent);
	}

	public void mandarCorreo(View view) {
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");
		intent.putExtra(Intent.EXTRA_TEXT, "texto del correo");
		intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "jtomas@upv.es" });
		startActivity(intent);
	}

	public void dial(View view) {
		Intent intent = new Intent(Intent.ACTION_DIAL,
				Uri.parse("tel:677037787"));
		startActivity(intent);
	}

	
}
