package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzerg implements zzetu {
    private final zzgdm zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzerg(zzgdm zzgdmVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgdmVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public static zzerh zzc(zzerg zzergVar) {
        zzbct zzbctVar = zzbdc.zzgb;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && zzergVar.zzb != null && zzergVar.zzd.contains("banner")) {
            return new zzerh(Boolean.valueOf(zzergVar.zzb.isHardwareAccelerated()));
        }
        boolean zBooleanValue = ((Boolean) tVar.f12230c.zzb(zzbdc.zzgc)).booleanValue();
        Boolean boolValueOf = null;
        if (zBooleanValue && zzergVar.zzd.contains("native")) {
            Context context = zzergVar.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new zzerh(boolValueOf);
            }
        }
        return new zzerh(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerg.zzc(this.zza);
            }
        });
    }
}
