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
final class zzae extends d {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzal zzalVar, i iVar, p pVar, String str) {
        super(iVar, pVar);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ t createFailedResult(Status status) {
        return new zzai(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(b bVar) {
        f fVar = (f) ((zzam) bVar).getService();
        zzad zzadVar = new zzad(this);
        String str = this.zza;
        ed.d dVar = (ed.d) fVar;
        Parcel parcelZza = dVar.zza();
        zzc.zzd(parcelZza, zzadVar);
        parcelZza.writeString(str);
        dVar.zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzae) obj);
    }
}
