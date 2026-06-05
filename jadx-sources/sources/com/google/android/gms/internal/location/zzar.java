package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import ee.q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzar extends q {
    private final o zza;

    public zzar(o oVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.zza = oVar;
    }

    public final synchronized void zzc() {
        o oVar = this.zza;
        oVar.f3569b = null;
        oVar.f3570c = null;
    }

    @Override // ee.s
    public final void zzd(LocationResult locationResult) {
        this.zza.a(new zzap(this, locationResult));
    }

    @Override // ee.s
    public final void zze(LocationAvailability locationAvailability) {
        this.zza.a(new zzaq(this, locationAvailability));
    }
}
