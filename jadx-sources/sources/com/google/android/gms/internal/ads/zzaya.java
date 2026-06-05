package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaya extends zzayi {
    private final StackTraceElement[] zzh;

    public zzaya(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzawvVar, "UtW7g7feJqOHsjIRMP7TbkL8M4VYsmVrsaULCIKJGwvBOELKcxTQZfT6AHg6wl4V", "3s4OpKjyDjUzqtut1o8wCVCKFRdtRePXWRu+sqk/xG8=", zzasrVar, i10, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzawm zzawmVar = new zzawm((String) this.zze.invoke(null, stackTraceElementArr));
            zzasr zzasrVar = this.zzd;
            synchronized (zzasrVar) {
                try {
                    zzasrVar.zzD(zzawmVar.zza.longValue());
                    if (zzawmVar.zzb.booleanValue()) {
                        zzasrVar.zzZ(true != zzawmVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        zzasrVar.zzZ(3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
