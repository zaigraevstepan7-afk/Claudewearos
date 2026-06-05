package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import p.g;
import p.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhgp extends l {
    private final WeakReference zza;

    public zzhgp(zzbed zzbedVar) {
        this.zza = new WeakReference(zzbedVar);
    }

    @Override // p.l
    public final void onCustomTabsServiceConnected(ComponentName componentName, g gVar) {
        zzbed zzbedVar = (zzbed) this.zza.get();
        if (zzbedVar != null) {
            zzbedVar.zzc(gVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbed zzbedVar = (zzbed) this.zza.get();
        if (zzbedVar != null) {
            zzbedVar.zzd();
        }
    }
}
