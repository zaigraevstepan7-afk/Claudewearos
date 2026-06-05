package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzebr implements zzgcx {
    final /* synthetic */ zzffw zza;

    public zzebr(zzebs zzebsVar, zzffw zzffwVar) {
        this.zza = zzffwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        String strValueOf = String.valueOf(th2.getMessage());
        int i10 = l0.f13401b;
        k.d("Failed to get offline buffered ping database: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e10) {
            String strValueOf = String.valueOf(e10.getMessage());
            int i10 = l0.f13401b;
            k.d("Error executing function on offline buffered ping database: ".concat(strValueOf));
        }
    }
}
