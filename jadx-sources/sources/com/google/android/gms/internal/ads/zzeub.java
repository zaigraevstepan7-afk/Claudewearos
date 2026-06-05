package com.google.android.gms.internal.ads;

import android.os.Bundle;
import nc.s;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeub implements zzett {
    private final int zza;
    private final int zzb;

    public zzeub(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        int i10;
        Bundle bundle = ((zzcut) obj).zza;
        int i11 = this.zza;
        if (i11 == -1 || (i10 = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i11);
        bundle.putInt("crashes_without_flags", i10);
        s sVar = s.f12202f;
        if (t.f12227d.f12230c.zze()) {
            bundle.putBoolean("did_reset", true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
