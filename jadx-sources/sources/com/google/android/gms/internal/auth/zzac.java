package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.t;
import ed.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzac extends d {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, i iVar, p pVar, boolean z2) {
        super(iVar, pVar);
        this.zza = z2;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final t createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(b bVar) {
        f fVar = (f) ((zzam) bVar).getService();
        boolean z2 = this.zza;
        ed.d dVar = (ed.d) fVar;
        Parcel parcelZza = dVar.zza();
        int i10 = zzc.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        dVar.zzc(1, parcelZza);
        setResult((zzac) new zzaj(Status.f3488e));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzac) obj);
    }
}
