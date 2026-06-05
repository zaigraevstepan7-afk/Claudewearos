package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
import mc.n;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeti implements zzetu {
    private final zzgdm zza;
    private final Context zzb;
    private final rc.a zzc;
    private final String zzd;

    public zzeti(zzgdm zzgdmVar, Context context, rc.a aVar, String str) {
        this.zza = zzgdmVar;
        this.zzb = context;
        this.zzc = aVar;
        this.zzd = str;
    }

    public static zzetj zzc(zzeti zzetiVar) {
        Context context = zzetiVar.zzb;
        boolean zF = wd.b.a(context).f();
        r0 r0Var = n.D.f11577c;
        boolean zE = r0.e(context);
        String str = zzetiVar.zzc.f14321a;
        int iMyUid = Process.myUid();
        boolean z2 = iMyUid == 0 || iMyUid == 1000;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new zzetj(zF, zE, str, z2, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, yd.e.d(context, ModuleDescriptor.MODULE_ID, false), yd.e.a(context, ModuleDescriptor.MODULE_ID), zzetiVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeti.zzc(this.zza);
            }
        });
    }
}
