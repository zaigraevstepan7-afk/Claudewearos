package rc;

import com.google.android.gms.internal.ads.zzbdc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import nc.s;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f14358a;

    /* renamed from: b, reason: collision with root package name */
    public String f14359b;

    public o(String str) {
        this.f14358a = str;
    }

    @Override // rc.d
    public final n zza(String str) {
        n nVar = n.f14355c;
        n nVar2 = n.f14354b;
        try {
            k.b("Pinging URL: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
            try {
                e eVar = s.f12202f.f12203a;
                String str2 = this.f14358a;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                h hVar = new h();
                hVar.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                hVar.b(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    k.g("Received non-success response code " + responseCode + " from pinging URL: " + str);
                    if (responseCode == 502) {
                        nVar2 = nVar;
                    }
                } else {
                    if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzib)).booleanValue()) {
                        this.f14359b = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                    }
                    nVar2 = n.f14353a;
                }
                httpURLConnection.disconnect();
                return nVar2;
            } catch (Throwable th2) {
                httpURLConnection.disconnect();
                throw th2;
            }
        } catch (IOException e10) {
            e = e10;
            k.g("Error while pinging URL: " + str + ". " + e.getMessage());
            return nVar;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            k.g("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return nVar2;
        } catch (RuntimeException e12) {
            e = e12;
            k.g("Error while pinging URL: " + str + ". " + e.getMessage());
            return nVar;
        } catch (URISyntaxException e13) {
            e = e13;
            k.g("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return nVar2;
        } finally {
        }
    }
}
