package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import mc.n;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzerj implements zzetu {
    private final Context zza;
    private final Intent zzb;

    public zzerj(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        l0.k("HsdpMigrationSignal.produce");
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmY)).booleanValue()) {
            return zzgdb.zzh(new zzerk(null));
        }
        boolean z2 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                l0.k("HSDP intent is supported");
                z2 = true;
            }
        } catch (Exception e10) {
            n.D.f11582h.zzw(e10, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgdb.zzh(new zzerk(Boolean.valueOf(z2)));
    }
}
