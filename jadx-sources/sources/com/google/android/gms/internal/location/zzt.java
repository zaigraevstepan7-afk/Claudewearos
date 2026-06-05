package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;
import com.google.android.gms.location.LocationRequest;
import ee.f;
import x8.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzt extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ f zzb;
    final /* synthetic */ Looper zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzz zzzVar, p pVar, LocationRequest locationRequest, f fVar, Looper looper) {
        super(pVar);
        this.zza = locationRequest;
        this.zzc = looper;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzB(zzba.zza(null, this.zza), a.s(zzbj.zza(this.zzc), null, f.class.getSimpleName()), new zzy(this));
    }
}
