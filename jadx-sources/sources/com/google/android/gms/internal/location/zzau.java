package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.o;
import ee.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzau extends u {
    private final o zza;

    public zzau(o oVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.zza = oVar;
    }

    public final synchronized void zzc() {
        o oVar = this.zza;
        oVar.f3569b = null;
        oVar.f3570c = null;
    }

    @Override // ee.v
    public final synchronized void zzd(Location location) {
        this.zza.a(new zzat(this, location));
    }
}
