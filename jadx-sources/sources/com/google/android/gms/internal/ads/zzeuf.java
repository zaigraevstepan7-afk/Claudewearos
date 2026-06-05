package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeuf implements zzetu {
    private final zzgdm zza;
    private final Context zzb;

    public zzeuf(zzgdm zzgdmVar, Context context) {
        this.zza = zzgdmVar;
        this.zzb = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114 A[PHI: r0
      0x0114: PHI (r0v27 android.content.Context) = 
      (r0v1 android.content.Context)
      (r0v1 android.content.Context)
      (r0v1 android.content.Context)
      (r0v2 android.content.Context)
     binds: [B:32:0x0112, B:35:0x0130, B:36:0x0132, B:78:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzeud zzc(com.google.android.gms.internal.ads.zzeuf r27) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeuf.zzc(com.google.android.gms.internal.ads.zzeuf):com.google.android.gms.internal.ads.zzeud");
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeue
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeuf.zzc(this.zza);
            }
        });
    }
}
