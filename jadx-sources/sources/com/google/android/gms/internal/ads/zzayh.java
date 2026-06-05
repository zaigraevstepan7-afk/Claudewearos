package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzayh {
    private final zzawv zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzayh(zzawv zzawvVar, String str, String str2, Class... clsArr) {
        this.zza = zzawvVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzawvVar.zzj().submit(new zzayg(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzayh zzayhVar) {
        try {
            zzawv zzawvVar = zzayhVar.zza;
            Class<?> clsLoadClass = zzawvVar.zzh().loadClass(zzayhVar.zzc(zzawvVar.zzs(), zzayhVar.zzb));
            if (clsLoadClass != null) {
                zzayhVar.zzd = clsLoadClass.getMethod(zzayhVar.zzc(zzawvVar.zzs(), zzayhVar.zzc), zzayhVar.zze);
            }
        } catch (zzavz | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th2) {
            zzayhVar.zzf.countDown();
            throw th2;
        }
        zzayhVar.zzf.countDown();
    }

    private final String zzc(byte[] bArr, String str) {
        return new String(this.zza.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
