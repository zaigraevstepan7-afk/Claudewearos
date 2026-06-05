package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaye extends zzayi {
    public zzaye(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        super(zzawvVar, "1BnW1+pN8ACAA5SCwHeu4aDyUa+GdAsZQaTQjOE/fWA7hyCouT0ju5bDmhkUNXUI", "kp4jwXczzGPw0lGC8OB8RleYASbnnNEZzgNaMBT0Bfw=", zzasrVar, i10, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        zzasr zzasrVar = this.zzd;
        zzasrVar.zzad(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzasrVar) {
            try {
                if (zBooleanValue) {
                    zzasrVar.zzad(2);
                } else {
                    zzasrVar.zzad(1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
