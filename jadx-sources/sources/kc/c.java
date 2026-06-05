package kc;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import rc.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Serializable f9518b;

    public /* synthetic */ c(int i10, Serializable serializable) {
        this.f9517a = i10;
        this.f9518b = serializable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f9517a) {
            case 0:
                HashMap map = (HashMap) this.f9518b;
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    try {
                        zzi.zzb(263);
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                                sb2.append("Received non-success response code ");
                                sb2.append(responseCode);
                                sb2.append(" from pinging URL: ");
                                sb2.append(string);
                                Log.w("HttpUrlPinger", sb2.toString());
                            }
                        } finally {
                            httpURLConnection.disconnect();
                        }
                    } finally {
                        zzi.zza();
                    }
                } catch (IOException e10) {
                    e = e10;
                    String message = e.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message).length());
                    sb3.append("Error while pinging URL: ");
                    sb3.append(string);
                    sb3.append(". ");
                    sb3.append(message);
                    Log.w("HttpUrlPinger", sb3.toString(), e);
                } catch (IndexOutOfBoundsException e11) {
                    String message2 = e11.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 32 + String.valueOf(message2).length());
                    sb4.append("Error while parsing ping URL: ");
                    sb4.append(string);
                    sb4.append(". ");
                    sb4.append(message2);
                    Log.w("HttpUrlPinger", sb4.toString(), e11);
                } catch (RuntimeException e12) {
                    e = e12;
                    String message3 = e.getMessage();
                    StringBuilder sb32 = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(message3).length());
                    sb32.append("Error while pinging URL: ");
                    sb32.append(string);
                    sb32.append(". ");
                    sb32.append(message3);
                    Log.w("HttpUrlPinger", sb32.toString(), e);
                }
                return;
            default:
                new o(null).zza((String) this.f9518b);
                return;
        }
    }
}
