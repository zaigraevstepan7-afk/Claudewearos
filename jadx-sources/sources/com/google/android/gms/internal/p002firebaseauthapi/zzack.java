package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import cg.i;
import com.google.android.gms.common.internal.e0;
import com.google.firebase.auth.FirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import qd.a;
import t.m1;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzack extends AsyncTask<Void, Void, zzacj> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzacm> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final i zzg;

    public zzack(String str, String str2, Intent intent, i iVar, zzacm zzacmVar) {
        e0.e(str);
        this.zzb = str;
        e0.i(iVar);
        this.zzg = iVar;
        e0.e(str2);
        e0.i(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        e0.e(stringExtra);
        Uri.Builder builderBuildUpon = Uri.parse(zzacmVar.zza(stringExtra)).buildUpon();
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendPath("getProjectConfig").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        e0.i(str2);
        builderAppendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = builderBuildUpon.build().toString();
        this.zzd = new WeakReference<>(zzacmVar);
        this.zze = zzacmVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzacj doInBackground(Void... voidArr) throws IOException {
        try {
            URL url = new URL(this.zzc);
            zzacm zzacmVar = this.zzd.get();
            HttpURLConnection httpURLConnectionZza = zzacmVar.zza(url);
            httpURLConnectionZza.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            httpURLConnectionZza.setConnectTimeout(60000);
            new zzacv(zzacmVar.zza(), this.zzg, zzact.zza().zzb()).zza(httpURLConnectionZza);
            int responseCode = httpURLConnectionZza.getResponseCode();
            if (responseCode != 200) {
                String strZza = zza(httpURLConnectionZza);
                zza.c("Error getting project config. Failed with " + strZza + " " + responseCode, new Object[0]);
                return zzacj.zzb(strZza);
            }
            zzafl zzaflVar = new zzafl();
            zzaflVar.zza(new String(zza(httpURLConnectionZza.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzaflVar.zza().contains(this.zzf) ? zzacj.zzb("UNAUTHORIZED_DOMAIN") : zzacj.zza(this.zzf);
            }
            for (String str : zzaflVar.zza()) {
                if (zza(str)) {
                    return zzacj.zza(str);
                }
            }
            return null;
        } catch (zzaah e10) {
            zza.c(m1.i("ConversionException encountered: ", e10.getMessage()), new Object[0]);
            return null;
        } catch (IOException e11) {
            zza.c(m1.i("IOException occurred: ", e11.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e12) {
            zza.c(m1.i("Null pointer encountered: ", e12.getMessage()), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzacj zzacjVar) {
        onPostExecute((zzacj) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream == null) {
                return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
            }
            return (String) zzacs.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e10) {
            zza.f("Error parsing error message from response body in getErrorMessageFromBody. ".concat(String.valueOf(e10)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzacj zzacjVar) {
        String strZza;
        String strZzb;
        Uri.Builder builder;
        zzacm zzacmVar = this.zzd.get();
        if (zzacjVar != null) {
            strZza = zzacjVar.zza();
            strZzb = zzacjVar.zzb();
        } else {
            strZza = null;
            strZzb = null;
        }
        if (zzacmVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(strZza) && (builder = this.zze) != null) {
            builder.authority(strZza);
            zzacmVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f4266p);
        } else {
            zzacmVar.zza(this.zzb, wd.a.T(strZzb));
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e10) {
            zza.c(f.b("Error parsing URL for auth domain check: ", str, ". ", e10.getMessage()), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i11);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th2) {
            byteArrayOutputStream.close();
            throw th2;
        }
    }
}
