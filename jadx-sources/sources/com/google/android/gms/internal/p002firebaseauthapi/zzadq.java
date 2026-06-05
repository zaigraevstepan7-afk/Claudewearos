package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import cg.i;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzadq {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzadq(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        String str;
        String str2;
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        i iVar = this.zza.f4252a;
        iVar.b();
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", iVar.f3369c.f3381a);
        FirebaseAuth firebaseAuth = this.zza;
        synchronized (firebaseAuth.f4259h) {
            str = firebaseAuth.f4260i;
        }
        if (!TextUtils.isEmpty(str)) {
            FirebaseAuth firebaseAuth2 = this.zza;
            synchronized (firebaseAuth2.f4259h) {
                str2 = firebaseAuth2.f4260i;
            }
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", str2);
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzact.zza().zzb());
        i iVar2 = this.zza.f4252a;
        iVar2.b();
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", iVar2.f3368b);
        this.zza.getClass();
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", (String) null);
        this.zzb.startActivity(intent);
    }
}
