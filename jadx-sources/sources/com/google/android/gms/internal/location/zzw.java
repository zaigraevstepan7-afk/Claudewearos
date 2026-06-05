package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzw extends zzx {
    final /* synthetic */ PendingIntent zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzw(zzz zzzVar, p pVar, PendingIntent pendingIntent) {
        super(pVar);
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        ((zzaz) bVar).zzG(this.zza, new zzy(this));
    }
}
