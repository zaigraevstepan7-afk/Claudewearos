package jg;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbj;
import com.google.android.gms.internal.p002firebaseauthapi.zzbp;
import com.google.android.gms.internal.p002firebaseauthapi.zzce;
import com.google.android.gms.internal.p002firebaseauthapi.zzkh;
import com.google.android.gms.internal.p002firebaseauthapi.zzkq;
import com.google.android.gms.internal.p002firebaseauthapi.zzlz;
import com.google.android.gms.internal.p002firebaseauthapi.zzw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    public static u f8906c;

    /* renamed from: a, reason: collision with root package name */
    public final String f8907a;

    /* renamed from: b, reason: collision with root package name */
    public final zzlz f8908b;

    public u(Context context, String str) {
        zzlz zzlzVarZza;
        this.f8907a = str;
        try {
            zzkh.zza();
            zzlz.zza zzaVarZza = new zzlz.zza().zza(context, "GenericIdpKeyset", "com.google.firebase.auth.api.crypto." + str).zza(zzkq.zza);
            zzaVarZza.zza("android-keystore://firebear_master_key_id." + str);
            zzlzVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            zzlzVarZza = null;
        }
        this.f8908b = zzlzVarZza;
    }

    public static u c(Context context, String str) {
        u uVar = f8906c;
        if (uVar == null || !zzw.zza(uVar.f8907a, str)) {
            f8906c = new u(context, str);
        }
        return f8906c;
    }

    public final String a() {
        if (this.f8908b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzce zzceVarZza = zzbj.zza(byteArrayOutputStream);
        try {
            synchronized (this.f8908b) {
                this.f8908b.zza().zza().zza(zzceVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e10.getMessage());
            return null;
        }
    }

    public final String b(String str) {
        String str2;
        zzlz zzlzVar = this.f8908b;
        if (zzlzVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzlzVar) {
                str2 = new String(((zzbp) this.f8908b.zza().zza(zzbp.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }
}
