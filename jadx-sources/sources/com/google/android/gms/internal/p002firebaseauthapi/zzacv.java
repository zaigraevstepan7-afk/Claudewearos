package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import cg.i;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import lh.c;
import lh.d;
import lh.f;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzacv {
    private Context zza;
    private zzado zzb;
    private String zzc;
    private final i zzd;
    private boolean zze;
    private String zzf;

    public zzacv(Context context, i iVar, String str) {
        this.zze = false;
        e0.i(context);
        this.zza = context;
        e0.i(iVar);
        this.zzd = iVar;
        this.zzc = m1.i("Android/Fallback/", str);
    }

    private static String zza(i iVar) {
        if (FirebaseAuth.getInstance(iVar).f4266p.get() == null) {
            return null;
        }
        throw new ClassCastException();
    }

    private static String zzb(i iVar) {
        f fVar = (f) FirebaseAuth.getInstance(iVar).f4267q.get();
        if (fVar != null) {
            try {
                d dVar = (d) fVar;
                return (String) Tasks.await(!((UserManager) dVar.f10980b.getSystemService(UserManager.class)).isUserUnlocked() ? Tasks.forResult("") : Tasks.call(dVar.f10983e, new c(dVar, 0)));
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e10.getMessage());
            }
        }
        return null;
    }

    public final void zza(URLConnection uRLConnection) {
        String strV;
        if (this.zze) {
            strV = m1.v(this.zzc, "/FirebaseUI-Android");
        } else {
            strV = m1.v(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzado(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzacy.zza());
        uRLConnection.setRequestProperty("X-Client-Version", strV);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        i iVar = this.zzd;
        iVar.b();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", iVar.f3369c.f3382b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzacv(i iVar, String str) {
        this(iVar.f3367a, iVar, str);
        iVar.b();
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
