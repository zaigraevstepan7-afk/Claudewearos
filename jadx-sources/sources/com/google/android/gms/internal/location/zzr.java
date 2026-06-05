package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;
import com.google.android.gms.location.LocationRequest;
import ee.g;
import x8.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzr extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ g zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzz zzzVar, p pVar, LocationRequest locationRequest, g gVar) {
        super(pVar);
        this.zza = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzC(this.zza, a.s(zzbj.zzb(), null, g.class.getSimpleName()), new zzy(this));
    }
}
