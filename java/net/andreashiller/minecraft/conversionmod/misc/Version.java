package net.andreashiller.minecraft.conversionmod.misc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import net.andreashiller.minecraft.conversionmod.ConversionMod;

public class Version extends Thread {
	
	public static String remoteVersion;
	public static String installedVersion;
	public static String remoteIntVersion;
	public static String installedIntVersion;
	public static int iVersion;
	public static int rVersion;
	public static boolean hasNewVersion = false;
	

	public Version() {
		installedVersion = ConversionMod.VERSION;
		installedIntVersion = installedVersion.replaceAll("\\.", "");
		iVersion = Integer.parseInt(installedIntVersion);
		try {
			
			URL url = new URL("http://andreashiller.net/wp-content/uploads/2015/12/conversionBallVersion.txt");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) conn.getContent()));
			remoteVersion = reader.readLine();
			
			remoteIntVersion = remoteVersion.replaceAll("\\.", "");
			rVersion = Integer.parseInt(remoteIntVersion);
			
			if(rVersion > iVersion){
				hasNewVersion = true;
			}
			else
			{
				hasNewVersion = false;
			}
		} catch(Exception e) {
			System.out.println("Scheiﬂe ein Fehler");
		}
	}

}
